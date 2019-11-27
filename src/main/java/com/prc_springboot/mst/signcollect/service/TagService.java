package com.prc_springboot.mst.signcollect.service;

import com.prc_springboot.mst.signcollect.pojo.Tag;

public interface TagService {

    public void saveTag(Tag t);

    public void delTag(Tag t);

    public void truncTags(Tag t);

}
