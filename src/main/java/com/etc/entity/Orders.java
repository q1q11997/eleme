package com.etc.entity;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Integer oid;

    private Integer aid;

    private Integer sid;

    private Date otime;

    private String ostatus;

    private BigDecimal ototal;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Date getOtime() {
        return otime;
    }

    public void setOtime(Date otime) {
        this.otime = otime;
    }

    public String getOstatus() {
        return ostatus;
    }

    public void setOstatus(String ostatus) {
        this.ostatus = ostatus == null ? null : ostatus.trim();
    }

    public BigDecimal getOtotal() {
        return ototal;
    }

    public void setOtotal(BigDecimal ototal) {
        this.ototal = ototal;
    }
}