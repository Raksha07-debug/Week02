package ecommerce;

public class Groceries extends Product {
    Groceries(String name,double price,String productId){
        super(name, price, productId);
    }
    public double calculateDiscount(){
        return 0.1 * getPrice();
    }
    
}
