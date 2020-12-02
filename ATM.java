package com.company;

import java.util.Scanner;

public class ATM {
    public  void calistir(){
        Scanner scanner = new Scanner(System.in);


        Account account1 = new Account();
        Login login = new Login();
        Integer girisHakki = 3;

        while(true){
            System.out.print("Please enter username: ");
            String username = scanner.nextLine();
            System.out.print("Please enter password:  ");
            Integer password = scanner.nextInt();
            scanner.nextLine();

            if(login.login(account1,username,password) != true){
                System.out.println("Username or password is incorrect!");
                girisHakki -= 1;
                System.out.println("entry left:  " + girisHakki);

            }
            else{
                break;
            }
            if(girisHakki == 0){
                System.out.print("You entered incorrectly 3 times!");
                return;
            }


        }

        System.out.println("Menu ");
        System.out.println("1.See balance");
        System.out.println("2.Withdraw money ");
        System.out.println("3.Loading money");

        Integer secim;
        while (true){
            System.out.print("Select the action you want to do: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim){
                case 1:
                    System.out.println("Your newest balance  " + account1.getAmount());
                    break;
                case 2:
                    System.out.print("please type how much money do you want to withdraw: ");
                    Integer tutar = scanner.nextInt();
                    scanner.nextLine();
                    if(account1.getAmount()<tutar){
                        System.out.println("there is no money enough   ");
                        break;
                    }
                    else{
                        Integer newbakiye = account1.getAmount() - tutar;
                        account1.setAmount(newbakiye);
                        System.out.println("Completed!  Newest balance:  " + account1.getAmount());
                        break;
                    }
                case 3:
                    System.out.print("Please type how much money you want to load: ");
                    Integer yatirTutar = scanner.nextInt();
                    scanner.nextLine();
                    Integer newbakiye = account1.getAmount() + yatirTutar;
                    account1.setAmount(newbakiye);
                    System.out.println("Newest balance:   " + account1.getAmount());
                    break;
                case 4:
                    System.out.println("Come again :)");
                    return;
                default:
                    System.out.println("You select incorrect action!");
                    break;



            }


        }



    }


}
