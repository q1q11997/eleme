package com.etc.entity;

import java.math.BigDecimal;

public class Goods {
    private Integer gid;

    private String gname;

    private BigDecimal gprice;

    private Integer gcount;

    private String ginfo;

    private String gimage;

    private BigDecimal gbox;

    private Integer gtid;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public BigDecimal getGprice() {
        return gprice;
    }

    public void setGprice(BigDecimal gprice) {
        this.gprice = gprice;
    }

    public Integer getGcount() {
        return gcount;
    }

    public void setGcount(Integer gcount) {
        this.gcount = gcount;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo == null ? null : ginfo.trim();
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage == null ? null : gimage.trim();
    }

    public BigDecimal getGbox() {
        return gbox;
    }

    public void setGbox(BigDecimal gbox) {
        this.gbox = gbox;
    }

    public Integer getGtid() {
        return gtid;
    }

    public void setGtid(Integer gtid) {
        this.gtid = gtid;
    }
}