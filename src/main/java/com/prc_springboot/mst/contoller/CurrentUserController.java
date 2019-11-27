package com.prc_springboot.mst.contoller;

import com.prc_springboot.mst.Exception.GlobalException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api("swagger测试")
public class CurrentUserController {

    @GetMapping("/user/setname")
    @ApiOperation(value = "设置用户名称")
    public String SetCurrentUser(@ApiParam(value = "昵称", example = "小小") @RequestParam(required = true)String name){
        return name;
    }

    @GetMapping("/test/error")
    public void  errorTest(){
        try{
            int a = 0;
            String b = "aaa";
            a = a+ Integer.valueOf(b);
        } catch (Exception e){
            throw new GlobalException(1001,e.getMessage());
        }
    }

    @GetMapping("/test/play")
    public String play(){
        return "play";
    }

}
