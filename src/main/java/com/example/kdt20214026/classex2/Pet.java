package com.example.kdt20214026.classex2;
//동물 보험
public class Pet extends Insu2 {
    public Pet(String name, int monthlyRate) {
        super(name, monthlyRate);
    }

    @Override
    public int calculateRate(int age) {
        return getMonthlyRate();
    }

}
