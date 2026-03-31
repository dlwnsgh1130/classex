package com.example.kdt20214026.classex2;

public class Food {

    private String name;
    private int price;
    private int cal;

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

    //order()
    public void order(){
        System.out.println(name + " 의 가격은 " + price + "원 이고, 칼로리는 " + cal +"kcal 입니다");
    }

    //eat()
    public void eat(){
        System.out.println("개 당 " + price + "원의" + name +"을 먹습니다");
    }
}
