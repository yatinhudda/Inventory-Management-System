package com.InventoryManagementSystem.InventoryManagementSystem.Entities;

import org.springframework.stereotype.Component;


public class User {
    private int userId;
    private String userFirstName;
    private String userLastName;
    private String userEmail;
    private String userMobile;
    private String userPassword;
    private boolean isAdminUser;

    public User(int userId, String userFirstName, String userLastName, String userEmail, String userMobile, String userPassword, boolean isAdminUser) {
        this.userId = userId;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userEmail = userEmail;
        this.userMobile = userMobile;
        this.userPassword = userPassword;
        this.isAdminUser = isAdminUser;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public void setAdminUser(boolean adminUser) {
        isAdminUser = adminUser;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserFirstName() {
        return userFirstName;
    }

    public String getUserLastName() {
        return userLastName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public boolean isAdminUser() {
        return isAdminUser;
    }
}
