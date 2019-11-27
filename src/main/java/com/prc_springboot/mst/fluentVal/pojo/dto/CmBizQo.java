package com.prc_springboot.mst.fluentVal.pojo.dto;

public class CmBizQo {

    /* 创建人  */
    private String createdBy;

    /* 创建人  */
    private String createdDate;

    /* 修改人  */
    private String updatedBy;

    /* 修改日期  */
    private String updatedDate;

    private String  payObjectNo;

    private String payApplyNo;


    private String receiptType;

    private String typeFlag;

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getPayObjectNo() {
        return payObjectNo;
    }

    public void setPayObjectNo(String payObjectNo) {
        this.payObjectNo = payObjectNo;
    }

    public String getPayApplyNo() {
        return payApplyNo;
    }

    public void setPayApplyNo(String payApplyNo) {
        this.payApplyNo = payApplyNo;
    }

    public String getReceiptType() {
        return receiptType;
    }

    public void setReceiptType(String receiptType) {
        this.receiptType = receiptType;
    }

    public String getTypeFlag() {
        return typeFlag;
    }

    public void setTypeFlag(String typeFlag) {
        this.typeFlag = typeFlag;
    }
}
