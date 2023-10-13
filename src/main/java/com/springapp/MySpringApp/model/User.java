package com.springapp.MySpringApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "UserData")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Column(name = "Name") // This annotation is not compulsory. By default it will create a column.
    private String uname;
    @Column(name = "Email")
    private String uemail;
    // @Column(name = "Mobile")
    // private int umob;
    @Column(name = "Password")
    private String upassword;
    // @Column(name = "Confirmpassword")
    // private String uconfirmpassword;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // public int getUmob() {
    // return umob;
    // }

    // public void setUmob(int umob) {
    // this.umob = umob;
    // }

    // public String getUconfirmpassword() {
    // return uconfirmpassword;
    // }

    // public void setUconfirmpassword(String uconfirmpassword) {
    // this.uconfirmpassword = uconfirmpassword;
    // }

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
        return "User [id=" + id + ", uname=" + uname + ", uemail=" + uemail + /* ",  umob=" +umob + */", upassword="
                + upassword + /* ",  uconfirmpassword=" + uconfirmpassword + */"]";
    }

}