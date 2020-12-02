package com.company;

public class Account {
    private String username = "kadir";
    private Integer password = 12345;
    private Integer amount = 1000;


    public Account(){

    }
    public Account(String username, Integer password){
        this.username = username;
        this.password = password;

    }

    public String getUsername() {
        return username;
    }

    public Integer getPassword() {
        return password;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
