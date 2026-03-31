package com.example.kdt20214026.classex2;

public class AnimalMain {
    public static void main(String[] args){

        Dog dog = new Dog("송이",4);
        Cat cat = new Cat("묭이",12);

        dog.introduce();    //부모 클래스
        dog.sound();        //오버라이딩된 메서드
        dog.play();         //본인 메서드

        System.out.println("===");

        cat.introduce();
        cat.sound();
        cat.play();
    }
}
