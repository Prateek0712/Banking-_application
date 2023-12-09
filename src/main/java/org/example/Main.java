package org.example;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("WelCome to  All in One Account Opening  and management portal");
        System.out.println("Enter Your Name : ");
        String name=sc.next();
        System.out.println("Choose 1 to select Yup Bank And Choose 2 to  select Bank Of Bharat");
        int selected=sc.nextInt();
        System.out.println("Enter Initial deposit Amount : ");
        double bal=sc.nextDouble();
        System.out.println("Enter PassKey You want  to keep and Note It Down : ");
        String password=sc.next();
        Bank bank;
        if(selected==1)
        {
            bank=new YupBank(bal,password);
            System.out.println("Thank You For Selecting Yup Bank");
        }
        else
        {
            bank=new BankOfBharat(bal,password);
            System.out.println("Thank You For Selecting Bank Of Bharat");
        }
        System.out.println("Enter the Money You want to add : ");
        int money=sc.nextInt();
        String  result=bank.addMoney(money);
        System.out.println(result);

        System.out.println("Enter the Money You Want to with : ");
        money=sc.nextInt();
        System.out.println("Enter the Password Please");
        password=sc.next();
        result=bank.withDrawMoney(password,money);
        System.out.println(result);

        System.out.println("Now Enter Password To Check  Correct Balance : ");
        password= sc.next();
        result= bank.checkBalance(password);
        System.out.println(result);

        System.out.println("Lets Check ROI : ");
        System.out.println("Enter Number of  years You want  to keep that money");
        int years=sc.nextInt();
        double result1= bank.getRateOfInteterest(years);
        System.out.println("Total amount You Will Received At The End Of :"+years+" is : "+result1);

    }
}