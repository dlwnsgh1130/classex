package com.example.kdt20214026.interfaceEx;

//구현 클래스 : Payment 인터페이스의 규칙에 맞춰 실제 로직을 구현
public class BankTransfer implements Payment{


    @Override
    public boolean pay(int money) {
        System.out.println("계좌이체: " + money + "원");
        return false;
    }

    @Override
    public boolean refund(int money) {
        System.out.println("계좌환불: " + money + "원");
        return false;
    }

    @Override
    public String getPayName() {
        return "계좌이체";
    }
}
