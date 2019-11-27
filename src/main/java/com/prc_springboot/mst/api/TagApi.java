package com.prc_springboot.mst.api;

import com.prc_springboot.mst.signcollect.pojo.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface TagApi {

    @GetMapping("/tagapi/getById-{id}")
    public Tag getById(@PathVariable("id")String id);

    @GetMapping("/tagapi/delById")
    public String delById(String id);
}
