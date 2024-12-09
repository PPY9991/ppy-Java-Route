package com.ppy.encap;

public class AccountTest {
    public static void main(String[] args) {
        //创建无参构造器
        Account account = new Account();
        account.setPassword("12345 ");
        account.setUsername("张三");
        account.setBalance(934.9);
        account.showinfo();
    }
}
