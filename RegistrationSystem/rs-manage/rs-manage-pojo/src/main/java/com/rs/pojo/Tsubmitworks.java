package com.rs.pojo;

public class Tsubmitworks {
    private Long wid;

    private Long teamid;

    private Long tmid;

    private String workname;

    private String firstwriter;

    private Long sno;

    private String submitpath;

    public Long getWid() {
        return wid;
    }

    public void setWid(Long wid) {
        this.wid = wid;
    }

    public Long getTeamid() {
        return teamid;
    }

    public void setTeamid(Long teamid) {
        this.teamid = teamid;
    }

    public Long getTmid() {
        return tmid;
    }

    public void setTmid(Long tmid) {
        this.tmid = tmid;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname == null ? null : workname.trim();
    }

    public String getFirstwriter() {
        return firstwriter;
    }

    public void setFirstwriter(String firstwriter) {
        this.firstwriter = firstwriter == null ? null : firstwriter.trim();
    }

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getSubmitpath() {
        return submitpath;
    }

    public void setSubmitpath(String submitpath) {
        this.submitpath = submitpath == null ? null : submitpath.trim();
    }
}