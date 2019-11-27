package com.prc_springboot.mst.fluentVal.pojo.service;

import com.baidu.unbiz.fluentvalidator.FluentValidator;
import com.baidu.unbiz.fluentvalidator.Result;
import com.baidu.unbiz.fluentvalidator.util.Preconditions;
import com.prc_springboot.mst.fluentVal.pojo.dto.CmBizQo;
import com.prc_springboot.mst.fluentVal.pojo.volidate.CarSeatCountValidator;
import com.prc_springboot.mst.fluentVal.pojo.volidate.TempleValidator;
import org.springframework.stereotype.Service;

import static com.baidu.unbiz.fluentvalidator.ResultCollectors.toSimple;

@Service("carOptService")
public class CarOptService {

    /**
     * 校验方法调用方法
     */
    public void doSomething(){
        System.out.println("CarOptService  do something");
    }


    /**
     * 业务方法
     * @param bizQo
     */
    public void generateBiz(CmBizQo bizQo){
        // 校验
        Preconditions.checkNotNull(bizQo, "car should not be null");
        Result result = FluentValidator.checkAll().failOver()
                .on(bizQo, new TempleValidator())
                .doValidate().result(toSimple());
        System.out.println(result);

        if(result.isSuccess()){

        }
    }




}
