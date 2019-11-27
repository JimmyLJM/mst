package com.prc_springboot.mst.signcollect.pojo;

import java.io.Serializable;

public class Tag implements Serializable {

    // 标签url
    private String tagUrl;

    // 标签分类  文件夹、标签
    private String type;

    // 标签创建人
    private String owner;

    // 常用等级
    private String level;

    // 是否私密标签
    private String isPersonal;

    // 状态
    private String states;

    public String getTagUrl() {
        return tagUrl;
    }

    public void setTagUrl(String tagUrl) {
        this.tagUrl = tagUrl;
    }

    public String getStates() {
        return states;
    }

    public void setStates(String states) {
        this.states = states;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getIsPersonal() {
        return isPersonal;
    }

    public void setIsPersonal(String isPersonal) {
        this.isPersonal = isPersonal;
    }
}
