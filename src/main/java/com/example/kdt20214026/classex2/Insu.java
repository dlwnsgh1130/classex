package com.example.kdt20214026.classex2;

public class Insu {

    private String name;
    private int monthlyRate;

    public Insu(String name, int monthlyRate) {
        this.name = name;
        this.monthlyRate = monthlyRate;
    }

    public String getName() {
        return name;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

    // 보험료 계산 메서드 - 자식마다 다름
    public int calculateRate(int age) {
        return monthlyRate; // 기본 월 보험료
    }
}
