package com.prc_springboot.mst.fluentVal.pojo;

import lombok.Getter;

public class CarPojo {

    /**
     * 车牌号
     */
    private String licensePlate;

    /**
     * 品牌
     */
    private String brand;


    /**
     * 类型
     */
    private String carType;

    /**
     * 油类型
     */
    private String oilType;

    private int seatCount;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getOilType() {
        return oilType;
    }

    public void setOilType(String oilType) {
        this.oilType = oilType;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
