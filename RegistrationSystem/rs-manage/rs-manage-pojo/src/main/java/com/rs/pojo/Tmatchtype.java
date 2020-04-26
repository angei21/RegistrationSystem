package com.rs.pojo;

public class Tmatchtype {
    private Long tmid;

    private String mname;

    public Long getTmid() {
        return tmid;
    }

    public void setTmid(Long tmid) {
        this.tmid = tmid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }
}