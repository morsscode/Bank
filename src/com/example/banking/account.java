package com.example.banking;

import java.util.Scanner;

public class account {
    int balance = 0;
    public void deposit(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter amount to depost: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        balance += n;
        //once finished
        //reader.close();
    }
    public void withdraw(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter amount to withdraw: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        if (n < balance){
            balance -= n;
        }
        else{
            System.out.println("insufficient funds");
        }
        //once finished
        //reader.close();
    }
    public void display(){
        System.out.println("current balance = " + balance);
    }
    public static void main(String[] args) {
        account newaccount = new account();
        newaccount.deposit();
        newaccount.withdraw();
        newaccount.display();
        System.out.println(newaccount.balance);
    }
}
