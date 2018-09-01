package com.etc.entity;

public class Comment {
    private Integer cid;

    private Integer oid;

    private Integer uid;

    private String ccontent;

    private Long cgrade;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent == null ? null : ccontent.trim();
    }

    public Long getCgrade() {
        return cgrade;
    }

    public void setCgrade(Long cgrade) {
        this.cgrade = cgrade;
    }
}