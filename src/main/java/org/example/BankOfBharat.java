package org.example;

import java.util.Random;

public class BankOfBharat implements Bank{
    private String AccNumber;
    private double balance;
    private String passkey;
    public static final double rateOfInterest = 9.50;
    BankOfBharat(double balance,String passkey)
        {
            this.balance=balance;
            this.passkey=passkey;
            this.AccNumber=generateAccNumber();
        }
    public String addMoney(int money) {
        balance=balance+money;
        return "Your account ending with xxxxxx"+AccNumber.substring(6)+" has been creadited with "+money+" new Acc Balance is "+balance ;
    }
    public String generateAccNumber()
    {
        String check="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String acc="";
        Random rdm=new Random();
        for(int i=0;i<10;i++)
        {
            int idx=rdm.nextInt(check.length());
            acc+=check.charAt(idx);
        }
        return acc;
    }


    public String checkBalance(String password) {
        if(password.equals(passkey))
        {
            return  "Available balance of account number ending with xxxxxx"+AccNumber.substring(6)+" is "+balance;
        }
        else
        {
            return "password is wrong";
        }
    }

    public String withDrawMoney(String password, int money) {
        if(password.equals(passkey))
        {
            if(balance>=money)
            {
                balance=balance-money;
                return "Account number ending with xxxxxx"+AccNumber.substring(6)+" has been creadited with "+money+" new Available Balance is "+balance;
            }
            else {
                return  "Insufficieint  Fund :( ";
            }
        }
        else
        {
            return "password is wrong";
        }
    }

    public double getRateOfInteterest(int years) {
        double totalInterest = (balance*BankOfBharat.rateOfInterest*years)/100;
        return totalInterest;
    }
}
