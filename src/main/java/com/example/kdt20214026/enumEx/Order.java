package com.example.kdt20214026.enumEx;

// 주문 클래스 : Enum을 필드로 사용해 상태 관리
public class Order {

    private String orderId;
    private String name;
    private OrderStatus status;

    public Order(String orderId, String name) {
        this.orderId = orderId;
        this.name = name;
        this.status = OrderStatus.RECEIVED;// 초기 상태 설정(접수)
    }

    // 다음 단계를 위한 메서드
    public void nextStep() {
        OrderStatus[] allStatus = OrderStatus.values();
        int currentIdx = status.ordinal();

        if(currentIdx < allStatus.length - 1) {
            status = allStatus[currentIdx + 1];
            System.out.println("상태 변경: " + status);
        } else {
            System.out.println("최종 단계입니다: " + status );
        }
    }

    // 현재 상태에 따른 메시지 출력
    public void printStatus() {
        String msg = switch (status) {
            case RECEIVED -> "주문 접수";
            case PROCESSING -> "상품 준비 중";
            case SHIPPING -> "배송 중";
            case COMPLETED -> "배송 완료";
        };
        System.out.println(orderId + ": " + name + " - " + msg);
    }

    public boolean isCompleted() {
        return status == OrderStatus.COMPLETED;
    }

    // 배송 전에만 취소
    public boolean isCancel() {
        return status == OrderStatus.RECEIVED || status == OrderStatus.PROCESSING;
    }
}







