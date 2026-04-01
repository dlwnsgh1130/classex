package com.example.kdt20214026.classex2;

public class Food {

    private String name;
    private int price;
    private int cal;

    // 생성자
    public Food(String name, int price, int cal) {
        this.name = name;
        this.price = price;
        this.cal = cal;
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getCal() {
        return cal;
    }

    public void order() {
        System.out.println(name + " 주문 완료, " + price + "원");
    }

    public void eat() {
        System.out.println(name + " 칼로리: " + cal);
    }
}
