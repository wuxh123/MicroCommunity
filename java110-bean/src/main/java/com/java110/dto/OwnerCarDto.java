package com.java110.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName FloorDto
 * @Description 车辆管理数据层封装
 * @Author wuxw
 * @Date 2019/4/24 8:52
 * @Version 1.0
 * add by wuxw 2019/4/24
 **/
public class OwnerCarDto extends PageDto implements Serializable {

    private String carColor;
private String carBrand;
private String carType;
private String carNum;
private String psId;
private String remark;
private String ownerId;
private String userId;
private String carId;


    private Date createTime;

    private String statusCd = "0";


    public String getCarColor() {
        return carColor;
    }
public void setCarColor(String carColor) {
        this.carColor = carColor;
    }
public String getCarBrand() {
        return carBrand;
    }
public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
public String getCarType() {
        return carType;
    }
public void setCarType(String carType) {
        this.carType = carType;
    }
public String getCarNum() {
        return carNum;
    }
public void setCarNum(String carNum) {
        this.carNum = carNum;
    }
public String getPsId() {
        return psId;
    }
public void setPsId(String psId) {
        this.psId = psId;
    }
public String getRemark() {
        return remark;
    }
public void setRemark(String remark) {
        this.remark = remark;
    }
public String getOwnerId() {
        return ownerId;
    }
public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
public String getUserId() {
        return userId;
    }
public void setUserId(String userId) {
        this.userId = userId;
    }
public String getCarId() {
        return carId;
    }
public void setCarId(String carId) {
        this.carId = carId;
    }


    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatusCd() {
        return statusCd;
    }

    public void setStatusCd(String statusCd) {
        this.statusCd = statusCd;
    }
}
