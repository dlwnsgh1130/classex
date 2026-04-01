package com.example.kdt20214026.interfaceEx;
/*
    결제 처리 시스템 구현 클래스
    결제 수단의 종류를 몰라도 pay() 메서드만 호출되면 결제
 */
public class PaymentService {
    // 어떤 결제 수단이든 다 처리
    public void processPayment(Payment payment, int money) {
        System.out.println(payment.getPayName() + "결제");

        boolean success = payment.pay(money);
        if(success) {
            System.out.println("결제 성공");
        } else {
            System.out.println("결제 실패. 다른 결제 수단을 사용해주세요.");
        }
    }


    // 환불
    public void processRefund(Payment payment, int money) {
        System.out.println(payment.getPayName() + "환불 중...");

        boolean success = payment.refund(money);

        if(success) {
            System.out.println("환불 완료: " + money);
        }
    }
}

