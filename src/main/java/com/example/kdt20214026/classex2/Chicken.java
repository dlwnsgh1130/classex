package com.example.kdt20214026.classex2;

public class Chicken extends Food {

    private String flavor;

    public Chicken(String flavor, int price){
        super(flavor + "치킨", price, 2000);
        this.flavor = flavor;
    }

}
