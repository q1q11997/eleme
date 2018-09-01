package com.etc.entity;

public class Shop {
    private Integer sid;

    private String sname;

    private String sinfo;

    private Integer stype;

    private String saddress;

    private String stel;

    private String simage;

    private String sstatus;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSinfo() {
        return sinfo;
    }

    public void setSinfo(String sinfo) {
        this.sinfo = sinfo == null ? null : sinfo.trim();
    }

    public Integer getStype() {
        return stype;
    }

    public void setStype(Integer stype) {
        this.stype = stype;
    }

    public String getSaddress() {
        return saddress;
    }

    public void setSaddress(String saddress) {
        this.saddress = saddress == null ? null : saddress.trim();
    }

    public String getStel() {
        return stel;
    }

    public void setStel(String stel) {
        this.stel = stel == null ? null : stel.trim();
    }

    public String getSimage() {
        return simage;
    }

    public void setSimage(String simage) {
        this.simage = simage == null ? null : simage.trim();
    }

    public String getSstatus() {
        return sstatus;
    }

    public void setSstatus(String sstatus) {
        this.sstatus = sstatus == null ? null : sstatus.trim();
    }
}