package com.vip.mvc.entity;

import lombok.Data;

/**
 * @author zhangwei
 */
@Data
public class Address {
    private Integer addressId;
    private String city;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
