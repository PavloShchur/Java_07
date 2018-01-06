package oop;

public class VipVisitor extends AbstractVisitor {

    public VipVisitor(float discount) {
        this.discount = discount;
    }

    public VipVisitor(String name, float discount) {
        super(name);
        this.discount = discount;
    }

    private float discount;

    @Override
    public void buy(GoodsInterface goods) {
        if (!checkDiscount()) {
            super.buy(goods);
        }else{
            // купить со скидкой
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }
}
