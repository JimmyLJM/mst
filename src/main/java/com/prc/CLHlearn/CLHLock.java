package com.prc.CLHlearn;

import java.util.concurrent.atomic.AtomicReference;

/**
 * CLH算法模拟
 *
 */
public class CLHLock {

    AtomicReference<QNode> tail = new AtomicReference<QNode>(new QNode());
    ThreadLocal<QNode> myPred;
    ThreadLocal<QNode> myNode;

    public static class QNode {
        public volatile boolean locked = false;
    }

    public CLHLock() {
        myNode = new ThreadLocal<QNode>() {
            protected QNode initialValue() {
                return new QNode();
            }
        };
        myPred = new ThreadLocal<QNode>() {
            protected QNode initialValue() {
                return null;
            }
        };
    }

    public void lock() {
        QNode qnode = myNode.get();
        qnode.locked = true;
        QNode pred = tail.getAndSet(qnode);
        myPred.set(pred);
        // 等待自旋过程
        while (pred.locked) {
            //非阻塞算法
        }
    }

    // 将自己的locked域设置为false
    public void unlock() {
        QNode qnode = myNode.get();
        qnode.locked = false;
        myNode.set(myPred.get());
    }

}
