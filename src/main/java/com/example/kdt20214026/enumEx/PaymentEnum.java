package com.example.kdt20214026.enumEx;
/*
    결제 수다넹 따라 수수료와 안내 메세지가 다름

    상수별로 다르게 동작하는 메서드
 */
public enum PaymentEnum {

    CREDIT_CARD("신용카드") {
        @Override
        public int calculateFee(int money) {// 추상메서드
            // 2.5% 카드 수수료
            return (int) (money * 0.025);
        }

        @Override
        public String getGuideMsg() {
            return "포인트 적립 가능합니다.";
        }
    },
    BANK_TRANSFER("계좌이체") {
        @Override
        public int calculateFee(int money) {
            // 수수료 0
            return 0;
        }

        @Override
        public String getGuideMsg() {
            return "수수료없이 결제됩니다.";
        }
    },
    EASY_PAY("간편결제") {
        @Override
        public int calculateFee(int money) {
            // 수수료 1.5%
            return (int) (money * 0.015);
        }

        @Override
        public String getGuideMsg() {
            return "카카오페이, 네이버페이, 페이코 결제됩니다.";
        }
    };

    // 생성자와 공통 필드 ===
    // 불변으로 선언
    private final String name;
    private PaymentEnum(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // 추상 메서드 선언
    public abstract int calculateFee(int money);

    public abstract String getGuideMsg();



}
