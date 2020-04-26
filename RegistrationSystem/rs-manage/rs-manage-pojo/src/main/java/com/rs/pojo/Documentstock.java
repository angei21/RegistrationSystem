package com.rs.pojo;

public class Documentstock {
    private Long did;

    private String dname;

    private String ddescribe;

    private String dpath;

    private String dpicture;

    public Long getDid() {
        return did;
    }

    public void setDid(Long did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDdescribe() {
        return ddescribe;
    }

    public void setDdescribe(String ddescribe) {
        this.ddescribe = ddescribe == null ? null : ddescribe.trim();
    }

    public String getDpath() {
        return dpath;
    }

    public void setDpath(String dpath) {
        this.dpath = dpath == null ? null : dpath.trim();
    }

    public String getDpicture() {
        return dpicture;
    }

    public void setDpicture(String dpicture) {
        this.dpicture = dpicture == null ? null : dpicture.trim();
    }
}