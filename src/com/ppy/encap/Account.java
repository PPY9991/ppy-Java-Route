package com.ppy.encap;

public class Account {
    private String username;
    private double balance;
    private String password;
    //提供两个构造器


    public Account() {
    }

    public Account(String username, double balance, String password) {
        this.setUsername(username);
        this.setBalance(balance);
        this.setPassword(password);
    }

    /*
            username 长度2位 3位 4位

             */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 6 && password.length() <= 16) {
            this.password = password;
        } else {
            System.out.println("password error");
            this.password = null;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 20) {
            this.balance = balance;
        } else {
            System.out.println("balance less than 20");
            this.balance = 0;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() >= 2 && username.length() <= 4) {
            this.username = username;
        } else {
            System.out.println("illegal username");
            this.username = "00000";
        }
    }

    public void showinfo(){
        System.out.println("username:" + username + " balance:" + balance + " password:" + password);
    }
}
