package com.springapp.MySpringApp.model;

public class User {

    private String uname;
    private String uemail;
    private String upassword;

    public User() {
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail;
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Override
    public String toString() {
        return "user [uname=" + uname + ", uemail=" + uemail + ", upassword=" + upassword + "]";
    }

}