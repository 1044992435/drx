package com.jk.model;

import java.util.HashSet;
import java.util.Set;

/**
 * <pre>com.jk.model
 * 类名称：User
 * 类描述：用户名模块实体类
 * 创建人：王震
 * 创建时间：2018/10/30  18:39
 * 修改人：王震
 * 修改时间：2018/10/30  18:39
 * 修改备注：
 * @version </pre>
 */
public class User {
    private Integer uid;
    private String username;
    private String password;
    private String name;
    private String email;
    private String phone;
    private String addr;
    private Integer state;
    private String code;
    // 一个用户对应多个订单:
    private Set<Order> orders = new HashSet<Order>();
    public Integer getUid() {
        return uid;
    }
    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddr() {
        return addr;
    }
    public void setAddr(String addr) {
        this.addr = addr;
    }
    public Integer getState() {
        return state;
    }
    public void setState(Integer state) {
        this.state = state;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public Set<Order> getOrders() {
        return orders;
    }
    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
