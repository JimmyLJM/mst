package com.prc.ThreadLearn;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static List<Double> list = new ArrayList<Double>();

    public static void main(String[] args) {
//        double[] keys = { 1564, 121, 11,-0.02,1, 2, 3, 4, 5, 6, 7, 121, 154, 156465, 154, 0.05,
//                4564, -0.05,10 };
        double[] keys ={11,3,5,-0.3,-0.05,1};
        System.err.println(getNum(keys, 11.05));
    }

    static List<Double> getNum(double[] keys, double kill) {
        int n = keys.length;
        int nbit = 1 << n;
        double in;
        List<Double> list = new ArrayList<Double>();
        for (int i = 0; i < nbit; i++) {
            in = 0;
            list.clear();
            for (int j = 0; j < n; j++) {
                int tmp = 1 << j; // 由0到n右移位
                if ((tmp & i) != 0) { // 与运算，同为1时才会是1
                    in += keys[j];
                    list.add(keys[j]);
                }
            }
            if (in == kill)
                return list;
        }
        return list;
    }
}
