package com.example.demo.model;

import org.springframework.context.annotation.EnableMBeanExport;

import javax.persistence.*;

@Entity
@Table(name="Administrator")
public class Admin {
    @Id
    @GeneratedValue
    private int Id;

    @Column(name="UserName")
    private String adminUserName;
    @Column(name = "Passwords")
    private String adminPassword;

    public Admin(){

    }

    public int getId() {
        return Id;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "Id=" + Id +
                ", adminUserName='" + adminUserName + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                '}';
    }
}
