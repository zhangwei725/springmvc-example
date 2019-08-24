package com.vip.mvc.entity;


import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * @author zhangwei
 */
@Data
public class User implements Serializable {
    private Integer uid;
    private String name;
    private Address address;
    private List<Address> addressList;
    private Map<String,Address> map;

}
