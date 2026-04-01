package com.example.kdt20214026.classex2;

public class Health extends Insu {
    public Health(String name, int monthlyRate) {
        super(name, monthlyRate);
    }

    @Override
    public int calculateRate(int age) {
        if(age >= 60) {
            return (int)(getMonthlyRate() * 1.5);
            // 50% 할증
        } else if(age >= 40) {
            return (int)(getMonthlyRate() * 1.25);
            // 25% 할증
        }

        return getMonthlyRate();//그 외 기본 보험료

    }

}
