package com.etc.entity;

public class Shopuser {
    private Integer suid;

    private Integer sid;

    private String suname;

    private String password;

    public Integer getSuid() {
        return suid;
    }

    public void setSuid(Integer suid) {
        this.suid = suid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSuname() {
        return suname;
    }

    public void setSuname(String suname) {
        this.suname = suname == null ? null : suname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}