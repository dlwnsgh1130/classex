package com.example.kdt20214026.interfaceEx;
/*
    인터페이스 : 기능 구현이 약속된 계약서

    Payment.java : 계약서
    BankTransfer.java : 구현(계좌이체)
    CardPayment.java : 구현(카드결제)
    PaymentService.java : 결제 서비스 관리
    PaymentMain.java : 구현
 */

//반드시 지켜야만 하는 규칙들만 존재
//결제 시스템 필수 기능 : 결제, 환불, 수단 확인
public interface Payment {

    //결제
    boolean pay(int money);
    //환불
    boolean refund(int money);
    //수단
    String getPayName();

}
