package com.example.kdt20214026.classex2;

public class InsuMain {

    public static void main(String[] args){

        Insu insu1 = new Insu("보험", 10000);

        Insu2 pet = new Pet("강아지보험", 120000);



        //부모 타입 변수에 자식 객체 생성
        Insu health = new Health("실손보험", 50000);
        Insu car = new Car("자동차보험", 30000, 2);
        Insu travel = new Travel("여행자보험", 10000);


        int age = 55;
        System.out.println("보험" + insu1.calculateRate(age));
        System.out.println("실손보험" + health.calculateRate(age));
        System.out.println("자동차보험" + car.calculateRate(age));
        System.out.println("여행자보험" + travel.calculateRate(age));
        System.out.println("===");
        System.out.println("강아지보험" +pet.calculateRate(age));

    }

}
