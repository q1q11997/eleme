package com.etc.entity;

public class Goodstype {
    private Integer gtid;

    private String gtname;

    private Integer sid;

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }

    public String getGtname() {
        return gtname;
    }

    public void setGtname(String gtname) {
        this.gtname = gtname == null ? null : gtname.trim();
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }
}