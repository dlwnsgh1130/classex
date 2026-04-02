package com.example.kdt20214026.enumEx;

public class SeasonMain{

    public static void main(String[] args){

        // 타입.상수명으로 사용
        Season now = Season.SPRING;
        System.out.println("현재 계절: " + now);

        // == 사용가능
        if(now==Season.SPRING){
            System.out.println("봄입니다. 꽃이 핍니다.");
        }

        String name = now.name();
        System.out.println("이름: " + name); //문자열로 반환 가능

        int order = now.ordinal(); // 인덱스 번호 반환
        System.out.println("순서: " + order);; // 0

        for(Season season : Season.values()){ //모든 상수를 배열로 반환
            System.out.println(season.ordinal() + "번" + season.name());
        }
        // 문자열을 Enum으로 변환
        Season formatting = Season.valueOf("WINTER");
        System.out.println("문자열 -> Enum: " + formatting);

    }

}









