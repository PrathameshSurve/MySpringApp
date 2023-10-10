package com.springapp.MySpringApp.model;

public class LoginUser {
    private String username;
    private String confirmedpassword;

    public LoginUser() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getConfirmedpassword() {
        return confirmedpassword;
    }

    public void setConfirmedpassword(String confirmedpassword) {
        this.confirmedpassword = confirmedpassword;
    }

    @Override
    public String toString() {
        return "LoginUser [username=" + username + ", confirmedpassword=" + confirmedpassword + "]";
    }

}
