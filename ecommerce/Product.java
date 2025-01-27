package ecommerce;

public abstract class Product {
    private String name;
    private double price;
    private String productId;

    Product(String name,double price,String productId) {
        this.name = name;
        this.price = price;
        this.productId = productId;
        }
        public String getName() {
            return name;
         }
        public double getPrice() {
           return price;
                }
        public String getProductId() {
             return productId;
        }
        public  abstract double calculateDiscount();
        public void displayDetails(){
            System.out.println("Product Name: "+name);
            System.out.println("Product Price: "+price);
            System.out.println("Product ID: "+productId);
            
        }


                    
    
}
