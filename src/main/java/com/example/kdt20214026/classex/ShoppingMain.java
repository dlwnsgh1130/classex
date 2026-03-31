package com.example.kdt20214026.classex;

public class ShoppingMain {

    public static void main(String[] args){
        //상품 생성
        ShoppingProduct apple = new ShoppingProduct("감홍",8000);
        ShoppingProduct banana = new ShoppingProduct("필리핀",4000);
        ShoppingProduct pear = new ShoppingProduct("탱크보이",1200);

        //장바구니 생성 후 상품 닫기
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(apple, 1);
        cart.addItem(banana, 3);
        cart.addItem(pear, 12);


        cart.removeItem("탱크보이");
        cart.removeItem("감수광");

    }

}
