package ecommerce;

public class Electronics extends Product{
     private String brand;

    Electronics(String name,double price,String productId,String brand){
        super(name,price,productId);
        this.brand=brand;
    }
    public String getBrand(){
        return brand;
    }
    public double calculateDiscount(){
        double discount = 0.1 * getPrice(); // 10% discount
        return discount;
    }
    public String getDetails(){
        return "electronics item";
    }

}
