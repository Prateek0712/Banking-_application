package org.example;

public interface Bank {
    public String addMoney(int money);
    public String checkBalance(String password);
    public String withDrawMoney(String password,int money);
    public double getRateOfInteterest(int years);
}
