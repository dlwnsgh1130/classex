package com.example.kdt20214026.classex;
/*
    ShoppingProduct.java : 상품 정보
    ShoppingCart.java : 장바구니
    CartItem.java : 상품 + 수량
    ShoppingMain.java : 실행
 */
public class ShoppingProduct {
    private String name;
    private int price;

    public ShoppingProduct(String name, int price){

        this.name = name;
        this.price = price;
    }

    // getter / setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


















