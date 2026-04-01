package com.example.kdt20214026.classex2;

public class Car extends Insu{
    //사고 횟수
    private int accidentCnt;

    public Car(String name, int monthlyRate, int accidentCnt) {
        super(name, monthlyRate);
        this.accidentCnt = accidentCnt;
    }

    //같은 이름, 다른 계산 방식
    @Override
    public int calculateRate(int age){
        int base = getMonthlyRate();
        return base + (base * accidentCnt / 10);
    }
}
