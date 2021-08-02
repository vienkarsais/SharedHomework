package Edgars.DiscountPriceShop;



public class DiscountPrice {
    private float price;
    private float discount;

    public DiscountPrice(float price, float discount){
        this.price = price;
        this.discount = discount;

    }
    public void FinalPrice(){
        float discountSum = price * (discount / 100);
        float finalPrice = price - discountSum;
        System.out.print("Your final price: ");
        System.out.format("%.2f" + System.lineSeparator(), finalPrice);
    }
    public static void main(String[] args) {
        DiscountPrice price1 = new DiscountPrice(100.25f,25.22f);
        DiscountPrice price2 = new DiscountPrice(89f,20f);
        price1.FinalPrice();
        price2.FinalPrice();
    }
}
