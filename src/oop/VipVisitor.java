package oop;

public class VipVisitor extends BaseVisitor {

    // private String name; не нужно дублировать переменную, она уже есть в родительском классе Visitor
    private float discount;

    @Override
    public void buy() {
        if (!checkDiscount()) {
            super.buy();
        }else{
            // купить со скидкой
        }
    }

    private boolean checkDiscount(){
        return discount>0;
    }
}
