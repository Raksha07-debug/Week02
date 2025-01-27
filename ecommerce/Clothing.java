package ecommerce;

public class Clothing  extends Product{
    private  double discountRate;
    Clothing(String name,double price,String productId,double discountRate){
        super(name,price,productId);
    }
    public double calculateDiscount(){
        return discountRate;
        }

        
}
