package com.example.kdt20214026.classex2;
/*
    추상 클래스 : 미완성 설계도
    완성된 부분 : 공통 로직으로 구현
    미완성 부분 : 자식이 반드시 채워야 할 부분, abstract 메서드로 비워져 있음

    new 키워드로 직접 객체 생성 안됨
    반드시 자식 클래스가 오버라이드 되어야 함
 */
public abstract class Insu2 {

    private String name;
    private int monthlyRate;

    public Insu2(String name, int monthlyRate) {
        this.name = name;
        this.monthlyRate = monthlyRate;
    }
    public String getName() {
        return name;
    }
    public int getMonthlyRate() {
        return monthlyRate;
    }

    // 추상 메서드: 계산 방식은 자식이 반드시 구현해라
    public abstract int calculateRate(int age);

}

