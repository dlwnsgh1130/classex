package com.example.kdt20214026.classex2;

public class Health extends Insu {
    public Health(String name, int monthlyRate) {
        super(name, monthlyRate);
    }

    @Override
    public int calculateRate(int age) {
        if(age >= 60) {
            // 50% 할증
        } else if(age >= 40) {
            // 25% 할증
        }

        return getMonthlyRate();

    }

}
