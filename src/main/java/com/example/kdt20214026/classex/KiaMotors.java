package com.example.kdt20214026.classex;

public class KiaMotors {

    //상태-속성(필드)
    String model;
    String color;
    String wheel;
    String optional;
    boolean select;

    //생성자

    //동작-메서드
    void  selectOn(){
        select = true;
        System.out.println("차량을 선택하세요");
    }
    void  selectOff(){
        select = false;
        System.out.println();
    }

    void show(){

    }
}
