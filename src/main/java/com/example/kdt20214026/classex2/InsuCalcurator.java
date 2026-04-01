package com.example.kdt20214026.classex2;

public class InsuCalcurator {

    public static void main(String[] args){

        Insu[] products = {
                new Health("암보험",40000),
                new Car("운전자보험",20000,1),
                new Travel("해외여행자보험",30000),
                new Travel("국내여행자보험",15000),
                new Health("치아보험",22000),
                new Car("자동차보험",500000,3)
        };
        int age = 45;
        for(Insu product: products){
            int price = product.calculateRate(age);
            System.out.printf("%s -> 월 보험료: %,d원\n",
                                    product.getName(), price);
        }

    }

}
