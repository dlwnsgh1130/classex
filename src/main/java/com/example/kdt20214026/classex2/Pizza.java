package com.example.kdt20214026.classex2;

public class Pizza extends Food {

    private String size;
    public Pizza(int price, String size) {
        // name, price, cal
        super(size + " 피자", price, 1500);
        this.size = size;
    }

    @Override
    public void eat() {
        System.out.println(getName() + ": " + getCal() +"칼로리" );
    }

    public void addTopping() {
        System.out.println("토핑 선택시 3000원 추가");
    }

}
