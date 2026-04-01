package com.example.kdt20214026.interfaceEx;

public class CardPayment implements Payment{

    //한도초과
    private int balance;

    public CardPayment(int balance){
        this.balance = balance;
    }

    @Override
    public boolean pay(int money) {
        if(money > balance){
            System.out.println("카드 한도 초과: 잔액 " + balance);
            return false;
        }
        balance -= money;
        System.out.println("카드결제: " + money + "원(잔여: " + balance +")");
        return true;
    }

    @Override
    public boolean refund(int money) {
        System.out.println("카드 환불: " + money);
        return true;
    }

    @Override
    public String getPayName() {
        return "신용카드";
    }
}

//boolean isAble = false;
