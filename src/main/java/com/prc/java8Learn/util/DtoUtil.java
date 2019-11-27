package com.prc.java8Learn.util;

import com.prc.java8Learn.dto.Apple;

import java.util.ArrayList;
import java.util.List;

public class DtoUtil {


    /**
     * 初始化获取List方便测试
     * @return
     */
    public static  List<Apple> initApplList(){
        List<Apple> appls = new ArrayList<Apple>();


        Apple a1 = new Apple(500,"red",10);
        Apple a2 = new Apple(600,"blue",13);
        Apple a3 = new Apple(550,"red",11);
        Apple a4 = new Apple(570,"blue",11);
        Apple a5 = new Apple(509,"red",11);
        Apple a6 = new Apple(600,"blue",12);
        Apple a7 = new Apple(200,"red",15);
        Apple a8 = new Apple(100,"blue",13);
        Apple a9 = new Apple(400,"red",9);

        appls.add(a1);
        appls.add(a2);
        appls.add(a3);
        appls.add(a4);
        appls.add(a5);
        appls.add(a6);
        appls.add(a7);
        appls.add(a8);
        appls.add(a9);

        return appls;
    }

}
