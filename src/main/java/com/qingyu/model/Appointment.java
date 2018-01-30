package com.qingyu.model;

import java.io.Serializable;

public class Appointment implements Serializable {
    private Integer id;

    private String product;

    private String name;

    private Integer phone;

    private Integer moneyadd;

    private Integer moneyappointment;

    private Integer organization;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product == null ? null : product.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getMoneyadd() {
        return moneyadd;
    }

    public void setMoneyadd(Integer moneyadd) {
        this.moneyadd = moneyadd;
    }

    public Integer getMoneyappointment() {
        return moneyappointment;
    }

    public void setMoneyappointment(Integer moneyappointment) {
        this.moneyappointment = moneyappointment;
    }

    public Integer getOrganization() {
        return organization;
    }

    public void setOrganization(Integer organization) {
        this.organization = organization;
    }
}