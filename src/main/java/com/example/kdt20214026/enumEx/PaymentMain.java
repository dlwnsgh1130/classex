package com.example.kdt20214026.enumEx;

public class PaymentMain {
    public static void main(String[] args) {

        int money = 10000;

        System.out.println("결제 수단별 비교: "+ money);

        for(PaymentEnum pay : PaymentEnum.values()) {
            int fee = pay.calculateFee(money);
            int total = fee + money;

            System.out.println("==" + pay.getName() + "==");
            System.out.println(" 수수료: " + fee);
            System.out.println(" 총 결제금액: " + total);
            System.out.println(" 설명: " + pay.getGuideMsg());
        }
        System.out.println("== 결제 수단별 선택");
        System.out.println("= 결제 진행");
        PaymentEnum selected = PaymentEnum.BANK_TRANSFER;
        processPayment(selected, money);

        selected = PaymentEnum.CREDIT_CARD;
        processPayment(selected, money);
    }

    static void processPayment(PaymentEnum pay, int money) {
        int fee = pay.calculateFee(money);
        int total = money + fee;

        System.out.println(pay.getName() + " 결제");
        System.out.println(" 상품금액: " + money + ", 수수료: " + fee + ", 합계: "
                + total);
        System.out.println(" " + pay.getGuideMsg());
    }

}

