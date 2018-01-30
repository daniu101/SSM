package com.qingyu.model;

import java.io.Serializable;

public class Issuer implements Serializable {
    private Integer id;

    private String name;

    private String accountname;

    private Integer account;

    private Integer accountbig;

    private Integer bankopen;

    private String brief;

    private String idea;

    private String measures;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname == null ? null : accountname.trim();
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public Integer getAccountbig() {
        return accountbig;
    }

    public void setAccountbig(Integer accountbig) {
        this.accountbig = accountbig;
    }

    public Integer getBankopen() {
        return bankopen;
    }

    public void setBankopen(Integer bankopen) {
        this.bankopen = bankopen;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }

    public String getIdea() {
        return idea;
    }

    public void setIdea(String idea) {
        this.idea = idea == null ? null : idea.trim();
    }

    public String getMeasures() {
        return measures;
    }

    public void setMeasures(String measures) {
        this.measures = measures == null ? null : measures.trim();
    }
}