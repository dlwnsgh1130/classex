package com.example.kdt20214026.classex;
/*
    캡슐화
    데이터를 외부에서 직접 접근하지 못하게 숨기는 것

    private : 클래스 내부에서만 접근 가능
    public : 어디서든 접근 가능
 */
public class Bank {

    // 멤버 변수 선언
    private String owner;   //예금주
    private int balance;    //잔고

    //매개변수가 있는 생성자를 자동으로 생성
    public Bank(String owner, int balance){
        this.owner = owner;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
    //입금
    public void deposit(int amount){
        //금액은 0보다 커야한다
        if(amount <= 0){
            System.out.println("입금액은 0보다 커야합니다.");
            return;
        }
        balance += amount;
    }
    //출금
    public void withdraw(int amount){
        //출금시 0보다 작으면 잔고가 부족합니다.
        if(balance < amount){
            System.out.println("출금 잔액이 부족합니다.");
            return;
        }
        balance -= amount; // 실제 잔고에서 차감
        System.out.println(amount + "원이 출금되었습니다. (현재 잔고: " + balance + ")");
    }
}
