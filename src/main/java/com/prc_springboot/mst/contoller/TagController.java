package com.prc_springboot.mst.contoller;

import com.prc_springboot.mst.api.TagApi;
import com.prc_springboot.mst.signcollect.pojo.Tag;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TagController implements TagApi {

    @Override
    public Tag getById(String id) {
        Tag tag = new Tag();

        tag.setIsPersonal("Y");
        tag.setTagUrl("baidu.com");
        tag.setLevel(id);
        return tag;
    }

    @Override
    public String delById(String id) {
        return "success";
    }
}
