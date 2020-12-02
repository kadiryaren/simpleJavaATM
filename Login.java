package com.company;

import java.util.Scanner;

public class Login {
    public boolean login(Account account,String username,Integer password){

        String accountUsername = account.getUsername();
        Integer accountPassword = account.getPassword();
        if(username.equals(accountUsername) && password.equals(accountPassword) ){
            return true;
        }
        else{
            return false;
        }





    }
}
