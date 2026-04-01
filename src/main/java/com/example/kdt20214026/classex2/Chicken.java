package com.example.kdt20214026.classex2;

public class Chicken extends Food {
    private String flavor;

    public Chicken(String flavor, int price) {
        // 부모가 가지고 있는 매개변수(String name, int price, int cal)
        super(flavor + "치킨", price, 2000);
        this.flavor = flavor;
    }
    @Override
    public void eat() {
        System.out.println(getName() + ": " + getCal() +"칼로리" );
    }

    public void addSet() {
        System.out.println("세트 메뉴 변경시 3000원 추가");
    }

}
