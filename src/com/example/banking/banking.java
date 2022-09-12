package com.example.banking;
// package for user input
import java.util.Scanner;
//main function
public class banking {
    public static void main(String[] args) {
        System.out.println("Hello World");
        account newaccount = new account();
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        boolean x = true;
        while(x) {
            System.out.println("Enter desired action: ");
            String n = reader.nextLine();
            switch (n) {
                case "withdraw"-> {
                    newaccount.withdraw();
                }
                case "deposit" -> {
                    {
                        newaccount.deposit();
                    }
                }
                case "balance" ->{
                    newaccount.display();
                }
                case "exit" -> {
                    x = false;
                }
                default -> {
                    System.out.println("action not recognized");
                }
                //reader.close();
            }
        }
        //newaccount.deposit();
        //newaccount.withdraw();
        newaccount.display();
        System.out.println(newaccount.balance);
        //reader.close();
    }
}

