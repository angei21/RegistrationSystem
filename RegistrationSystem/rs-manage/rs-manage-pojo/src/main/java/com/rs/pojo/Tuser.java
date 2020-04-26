package com.rs.pojo;

public class Tuser {
    private Long sno;

    private String sname;

    private String spassword;

    private String sportaid;

    private String school;

    private String academy;

    private String classname;

    private String telphone;

    private Integer statue;

    private Integer sex;

    public Long getSno() {
        return sno;
    }

    public void setSno(Long sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword == null ? null : spassword.trim();
    }

    public String getSportaid() {
        return sportaid;
    }

    public void setSportaid(String sportaid) {
        this.sportaid = sportaid == null ? null : sportaid.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getAcademy() {
        return academy;
    }

    public void setAcademy(String academy) {
        this.academy = academy == null ? null : academy.trim();
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telphone) {
        this.telphone = telphone == null ? null : telphone.trim();
    }

    public Integer getStatue() {
        return statue;
    }

    public void setStatue(Integer statue) {
        this.statue = statue;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

	@Override
	public String toString() {
		return "Tuser [sno=" + sno + ", sname=" + sname + ", spassword=" + spassword + ", sportaid=" + sportaid
				+ ", school=" + school + ", academy=" + academy + ", classname=" + classname + ", telphone=" + telphone
				+ ", statue=" + statue + ", sex=" + sex + "]";
	}
    
    
}