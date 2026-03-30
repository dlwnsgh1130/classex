package com.example.kdt20214026.classex;

//장바구니 아이템 - "상품 정보를 가지고 있다."
public class CartItem {

    private ShoppingProduct sp;
    private int qty;

    public CartItem(ShoppingProduct sp, int qty){
        this.sp = sp;
        this.qty = qty;
    }

    public ShoppingProduct getSp() {
        return sp;
    }

    public void setSp(ShoppingProduct sp) {
        this.sp = sp;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
    //내부에서의 계산
    public int getSubtotal(){
        return sp.getPrice() * qty;
    }

    @Override
    public String toString(){
        return String.format("%s | 단가: %, d x %d개 = %,d원",
                sp.getName(), sp.getPrice(), getSubtotal());
    }
}







