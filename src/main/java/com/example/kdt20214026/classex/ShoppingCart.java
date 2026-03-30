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
    public void removeItem(){

    }
}
