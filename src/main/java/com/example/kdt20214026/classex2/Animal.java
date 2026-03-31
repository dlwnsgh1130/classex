package com.example.kdt20214026.classex2;

//부모(상위)클래스
public class Animal {
    //protected는 자식 클래스에만 접근 가능
    protected String name;
    protected int age;

    //생성자
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce(){
        System.out.println("이름: " + name + "나이: " + age);
    }
    public  void sound(){
        System.out.println(name + "이 소리를 냅니다.");
    }

}
