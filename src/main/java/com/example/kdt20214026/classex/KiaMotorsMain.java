package com.example.kdt20214026.classex;

public class KiaMotorsMain {

    static public void main(String[] args){

        //객체 생성-첫번째
        KiaMotors car1 = new KiaMotors();
        car1.model = "sorento";
        car1.color = "green";
        car1.wheel = "24인치";
        car1.optional = "플래티넘";

        //객체 생성-두번째
        KiaMotors car2 = new KiaMotors();
        car2.model = "carnaval";
        car2.color = "black";
        car2.wheel = "24인치";
        car2.optional = "마스터즈";

        car1.show();
        car1.selectOn();

        car2.show();;
        car2.selectOff();

    }
}
