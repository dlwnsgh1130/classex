package com.example.kdt20214026.classex2;

public class Cat extends Animal {
    public Cat(String name, int age){
        super(name,age);
    }
    @Override
    public void sound(){
        System.out.println(name + ": 야옹");
    }

    public void  play(){
        System.out.println(name + "이 소리를 냅니다");
    }
}
