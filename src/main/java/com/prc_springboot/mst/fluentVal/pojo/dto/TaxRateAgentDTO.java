package com.prc_springboot.mst.fluentVal.pojo.dto;

/**
 * 代理人税率设置DTO
 */
public class TaxRateAgentDTO {

    /* 创建人  */
    private String createdBy;

    /* 创建人  */
    private String createdDate;

    /* 修改人  */
    private String updatedBy;

    /* 修改日期  */
    private String updatedDate;

    /* 代理主键  */
    private String idTaxrateAgentSetting;

    /* 是否有效 */
    private String isValidate;

    /* 生效日期  */
    private String effectiveDate;

    /* 财务机构 */
    private String financeDepartmentCode;

    /* 是否允许未勾销支付 */
    private String isWipePayFlag;

    /* 是否允许自动支付 */
    private String autoFlag;

    /* 是否允许预借 */
    private String isBorrowInvoice;


    /* 预借是否需要审批 */
    private String isApprovaSignreport;

    /* 车险增值税税率 */
    private String carSaleadditionTax;

    /* 财产险增值税税率 */
    private String weaSaleadditionTax;

    /* 意健险增值税税率 */
    private String accSaleadditionTax;

    /* 通用增值税税率 */
    private String commonaleadditionTax;

    /* 发票类型 */
    private String invoicType;

    /* 预借最大还票日期 */
    private Integer returnMax;

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

    public String getIdTaxrateAgentSetting() {
        return idTaxrateAgentSetting;
    }

    public void setIdTaxrateAgentSetting(String idTaxrateAgentSetting) {
        this.idTaxrateAgentSetting = idTaxrateAgentSetting;
    }

    public String getIsValidate() {
        return isValidate;
    }

    public void setIsValidate(String isValidate) {
        this.isValidate = isValidate;
    }

    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getFinanceDepartmentCode() {
        return financeDepartmentCode;
    }

    public void setFinanceDepartmentCode(String financeDepartmentCode) {
        this.financeDepartmentCode = financeDepartmentCode;
    }

    public String getIsWipePayFlag() {
        return isWipePayFlag;
    }

    public void setIsWipePayFlag(String isWipePayFlag) {
        this.isWipePayFlag = isWipePayFlag;
    }

    public String getAutoFlag() {
        return autoFlag;
    }

    public void setAutoFlag(String autoFlag) {
        this.autoFlag = autoFlag;
    }

    public String getIsBorrowInvoice() {
        return isBorrowInvoice;
    }

    public void setIsBorrowInvoice(String isBorrowInvoice) {
        this.isBorrowInvoice = isBorrowInvoice;
    }

    public String getIsApprovaSignreport() {
        return isApprovaSignreport;
    }

    public void setIsApprovaSignreport(String isApprovaSignreport) {
        this.isApprovaSignreport = isApprovaSignreport;
    }

    public String getCarSaleadditionTax() {
        return carSaleadditionTax;
    }

    public void setCarSaleadditionTax(String carSaleadditionTax) {
        this.carSaleadditionTax = carSaleadditionTax;
    }

    public String getWeaSaleadditionTax() {
        return weaSaleadditionTax;
    }

    public void setWeaSaleadditionTax(String weaSaleadditionTax) {
        this.weaSaleadditionTax = weaSaleadditionTax;
    }

    public String getAccSaleadditionTax() {
        return accSaleadditionTax;
    }

    public void setAccSaleadditionTax(String accSaleadditionTax) {
        this.accSaleadditionTax = accSaleadditionTax;
    }

    public String getCommonaleadditionTax() {
        return commonaleadditionTax;
    }

    public void setCommonaleadditionTax(String commonaleadditionTax) {
        this.commonaleadditionTax = commonaleadditionTax;
    }

    public String getInvoicType() {
        return invoicType;
    }

    public void setInvoicType(String invoicType) {
        this.invoicType = invoicType;
    }

    public Integer getReturnMax() {
        return returnMax;
    }

    public void setReturnMax(Integer returnMax) {
        this.returnMax = returnMax;
    }
}
