package com.rs.pojo;

public class Twordscore {
    private Long sid;

    private String mname;

    private Long teamid;

    private String workname;

    private String firstwriter;

    private String submitpath;

    private Integer scoretotal;

    private Integer rater;

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname == null ? null : mname.trim();
    }

    public Long getTeamid() {
        return teamid;
    }

    public void setTeamid(Long teamid) {
        this.teamid = teamid;
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

    public String getSubmitpath() {
        return submitpath;
    }

    public void setSubmitpath(String submitpath) {
        this.submitpath = submitpath == null ? null : submitpath.trim();
    }

    public Integer getScoretotal() {
        return scoretotal;
    }

    public void setScoretotal(Integer scoretotal) {
        this.scoretotal = scoretotal;
    }

    public Integer getRater() {
        return rater;
    }

    public void setRater(Integer rater) {
        this.rater = rater;
    }
}