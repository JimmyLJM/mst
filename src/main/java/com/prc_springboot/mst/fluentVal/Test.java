package com.prc_springboot.mst.fluentVal;

import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Result;
import com.baidu.unbiz.fluentvalidator.util.Preconditions;
import com.prc_springboot.mst.fluentVal.pojo.CarPojo;
import com.prc_springboot.mst.fluentVal.pojo.volidate.CarSeatCountValidator;

import static com.baidu.unbiz.fluentvalidator.ResultCollectors.toSimple;

public class Test {

    public static void main(String[] args) {
        CarPojo car = new CarPojo();
        Preconditions.checkNotNull(car, "car should not be null");
        Result result = FluentValidator.checkAll().failOver()
                .on(car.getSeatCount(), new CarSeatCountValidator())
                .doValidate().result(toSimple());
        System.out.println(result);
    }

}
