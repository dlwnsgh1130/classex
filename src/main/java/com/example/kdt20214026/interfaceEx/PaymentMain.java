package com.example.kdt20214026.interfaceEx;

public class PaymentMain {
    public static void main(String[] args) {

        PaymentService service = new PaymentService();

        // 계좌이체 결제
        service.processPayment(new BankTransfer(), 50000);
        System.out.println("===");

        service.processPayment(new CardPayment(100000), 50000);
        service.processPayment(new CardPayment(30000), 50000);

    }
}
