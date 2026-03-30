package com.example.kdt20214026.classex;

public class BankMain {
    public static  void main(String[] args){

        //계좌 생성 - 설계도인 Bank를 실체화해서 프로그램에서 사용할 수 있는 데이터(인스턴스)로 만듬

        Bank account = new Bank("한라봉", 10000000);
        //getter()
        System.out.println("예금주: " + account.getOwner());
        System.out.println("잔고: " + account.getBalance());

        //입금
        account.deposit(50000);
        System.out.println("입금 후 잔고: " + account.getBalance());

        //출금
        account.withdraw(95000);
        System.out.println("출금 후 잔고: " + account.getBalance());

        account.withdraw(5290000);
    }
}
