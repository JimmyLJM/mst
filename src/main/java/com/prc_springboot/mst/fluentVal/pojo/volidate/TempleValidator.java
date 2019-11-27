package com.prc_springboot.mst.fluentVal.pojo.volidate;

import com.baidu.unbiz.fluentvalidator.Validator;
import com.baidu.unbiz.fluentvalidator.ValidatorContext;
import com.baidu.unbiz.fluentvalidator.ValidatorHandler;
import com.prc_springboot.mst.fluentVal.pojo.CarPojo;
import com.prc_springboot.mst.fluentVal.pojo.dto.CmBizQo;
import com.prc_springboot.mst.fluentVal.pojo.service.CarOptService;
import org.springframework.beans.factory.annotation.Autowired;

public class TempleValidator extends ValidatorHandler<CmBizQo> implements Validator<CmBizQo> {

        // 注入业务类
        @Autowired
        private CarOptService carOptService;



        @Override
        public boolean validate(ValidatorContext context, CmBizQo t) {

            carOptService.doSomething();

            return true;
        }
}
