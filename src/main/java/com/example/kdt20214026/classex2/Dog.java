package com.example.kdt20214026.classex2;

// 자식 클래스 extends -> 부모 클래스의 성격을 상속 받는다
public class Dog extends Animal {
    // 생성자
    public Dog(String name, int age) {
        super(name, age);
    }

    // 재정의
    @Override
    public void sound() {
        System.out.println(name + ": 멍멍");
    }

    public void play() {
        System.out.println(name + "이(가) 공을 가져옵니다.");
    }
}
