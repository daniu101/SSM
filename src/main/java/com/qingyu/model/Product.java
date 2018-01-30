package com.qingyu.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable {
    private Integer id;

    private String tittle;

    private Integer tag1;

    private Integer tag2;

    private Integer tag3;

    private Integer substart;

    private Integer subend;

    private Integer investterm;

    private Integer domain;

    private Integer fundfront;

    private Integer fundblack;

    private Float rate;

    private Float process;

    private Date timesrart;

    private Integer state;

    private Integer scale;

    private Integer type;

    private Integer bonusinvite;

    private Integer bonusshare;

    private Integer issuer;

    private Integer structure;

    private Integer channel;

    private Integer profittype;

    private Integer interesttype;

    private Integer level;

    private Integer ratiomix;

    private Integer ratemortgage;

    private String investprovince;

    private String investcity;

    private String investdistrict;

    private String tip;

    private Integer collection;

    private Integer see;

    private Date time;

    private String highlights;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle == null ? null : tittle.trim();
    }

    public Integer getTag1() {
        return tag1;
    }

    public void setTag1(Integer tag1) {
        this.tag1 = tag1;
    }

    public Integer getTag2() {
        return tag2;
    }

    public void setTag2(Integer tag2) {
        this.tag2 = tag2;
    }

    public Integer getTag3() {
        return tag3;
    }

    public void setTag3(Integer tag3) {
        this.tag3 = tag3;
    }

    public Integer getSubstart() {
        return substart;
    }

    public void setSubstart(Integer substart) {
        this.substart = substart;
    }

    public Integer getSubend() {
        return subend;
    }

    public void setSubend(Integer subend) {
        this.subend = subend;
    }

    public Integer getInvestterm() {
        return investterm;
    }

    public void setInvestterm(Integer investterm) {
        this.investterm = investterm;
    }

    public Integer getDomain() {
        return domain;
    }

    public void setDomain(Integer domain) {
        this.domain = domain;
    }

    public Integer getFundfront() {
        return fundfront;
    }

    public void setFundfront(Integer fundfront) {
        this.fundfront = fundfront;
    }

    public Integer getFundblack() {
        return fundblack;
    }

    public void setFundblack(Integer fundblack) {
        this.fundblack = fundblack;
    }

    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = rate;
    }

    public Float getProcess() {
        return process;
    }

    public void setProcess(Float process) {
        this.process = process;
    }

    public Date getTimesrart() {
        return timesrart;
    }

    public void setTimesrart(Date timesrart) {
        this.timesrart = timesrart;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getScale() {
        return scale;
    }

    public void setScale(Integer scale) {
        this.scale = scale;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getBonusinvite() {
        return bonusinvite;
    }

    public void setBonusinvite(Integer bonusinvite) {
        this.bonusinvite = bonusinvite;
    }

    public Integer getBonusshare() {
        return bonusshare;
    }

    public void setBonusshare(Integer bonusshare) {
        this.bonusshare = bonusshare;
    }

    public Integer getIssuer() {
        return issuer;
    }

    public void setIssuer(Integer issuer) {
        this.issuer = issuer;
    }

    public Integer getStructure() {
        return structure;
    }

    public void setStructure(Integer structure) {
        this.structure = structure;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public Integer getProfittype() {
        return profittype;
    }

    public void setProfittype(Integer profittype) {
        this.profittype = profittype;
    }

    public Integer getInteresttype() {
        return interesttype;
    }

    public void setInteresttype(Integer interesttype) {
        this.interesttype = interesttype;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getRatiomix() {
        return ratiomix;
    }

    public void setRatiomix(Integer ratiomix) {
        this.ratiomix = ratiomix;
    }

    public Integer getRatemortgage() {
        return ratemortgage;
    }

    public void setRatemortgage(Integer ratemortgage) {
        this.ratemortgage = ratemortgage;
    }

    public String getInvestprovince() {
        return investprovince;
    }

    public void setInvestprovince(String investprovince) {
        this.investprovince = investprovince == null ? null : investprovince.trim();
    }

    public String getInvestcity() {
        return investcity;
    }

    public void setInvestcity(String investcity) {
        this.investcity = investcity == null ? null : investcity.trim();
    }

    public String getInvestdistrict() {
        return investdistrict;
    }

    public void setInvestdistrict(String investdistrict) {
        this.investdistrict = investdistrict == null ? null : investdistrict.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public Integer getCollection() {
        return collection;
    }

    public void setCollection(Integer collection) {
        this.collection = collection;
    }

    public Integer getSee() {
        return see;
    }

    public void setSee(Integer see) {
        this.see = see;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getHighlights() {
        return highlights;
    }

    public void setHighlights(String highlights) {
        this.highlights = highlights == null ? null : highlights.trim();
    }
}