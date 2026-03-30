package com.example.kdt20214026.classex;

import java.util.ArrayList;
import java.util.List;

/*
    장바구니 클래스
    여러개의 장바구니 항목(CartItem)을 리스트 형태로 관리
    추가/삭제/계산 등의 비즈니스 로직 수행
*/
public class ShoppingCart {
    //장바구니에 담김 여러 항목을 순서대로 저장
    //List: 데이터의 순서를 유지하고 중복을 허용하는 인터페이스
    //ArrayList : 자동으로 크기가 늘어나는 배열
    List<CartItem> itemList = new ArrayList<>();

    // 추가
    public void addItem(ShoppingProduct sp, int qty){
        itemList.add(new CartItem(sp,qty));
        System.out.println(sp.getName() + " " + qty + "개 담았습니다.");
    }
    // 삭제
    public void removeItem(String productName){
        //리스트 안에 해당 상품이 있는지 탐색
        //삭제

        boolean removed = false;
        /*
        //리스트의 맨 끝 인덱스부터 탐색
        for(int i = itemList.size() -1; i >= 0 ; i--){
            CartItem item = itemList.get(i);
            //상품평 비교
            if(item.getSp().getName().equals(productName)){
                itemList.remove(i);//조건이 맞으면 해당 인덱스 삭제

                removed = true;
            }
        }


        // forEach(); /탐색, 조회, 출력
        itemList.forEach(item ->{
            if(item.getSp().getName().equals(productName)){
                //itemList.remove(i); 삭제시 오류
            }
        });
        */

        if(removed){
            System.out.println("장바구니에서 삭제했습니다.");
        }
        else {
            System.out.println(productName + "이 없습니다.");
        }
    }
}
