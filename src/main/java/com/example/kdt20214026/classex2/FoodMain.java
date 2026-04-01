package com.example.kdt20214026.classex2;

public class FoodMain {
    public static void main(String[] args) {

        System.out.println("== 주문 ==");
        Chicken chicken = new Chicken("후라이드", 20000);
        Pizza pizza = new Pizza(15000, "라지");

        chicken.order();// 부모 클래스
        pizza.order();

        chicken.eat();
        pizza.eat();

        chicken.addSet();
        pizza.addTopping();

        System.out.println("====");
        // 부모 타입 배열에 자식을 담음
        Food[] menu = { chicken, pizza };
        int total = 0;
        for(Food f: menu) {
            f.eat();
            total += f.getPrice();
        }

        System.out.println("총 결제 금액: " + total + "원");

    }
}
