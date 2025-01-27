class Order{
    // Order class to store order details
    private String orderId;
    private String orderDate;

    // Constructor to initialize order details
    Order(String orderId,String orderDate)
    {
        this.orderId=orderId;
        this.orderDate=orderDate;
    }
    // Method to get order status
    public void getOrderStatus(String orderId,String orderDate)
    {
        System.out.println("The order id is "+orderId+" orderDate is "+orderDate);
    }
}

// ShippedOrder class extends Order class
class ShippedOrder extends Order {
    // Tracking number for shipped order
    private int trackingNum;
    // Constructor to initialize shipped order details
    ShippedOrder(String orderId,String orderDate,int trackingNum){
        super(orderId,orderDate);
        this.trackingNum=trackingNum;
    }
    // Method to get shipped order status
    public void getorderStatus(){
        super.getOrderStatus("56", "24-8-2024");
        System.out.println("tracking number of order is "+trackingNum);
    }
}

// DelieverdOrder class extends ShippedOrder class
class DelieverdOrder extends ShippedOrder{
    // Delivery date for delivered order
    private String delieveryDate;
    // Constructor to initialize delivered order details
    DelieverdOrder(String orderId,String orderDate,int trackingNum,String delieveryDate){
        super(orderId,orderDate,trackingNum);
        this.delieveryDate=delieveryDate;
    }
    // Method to get delivered order status
    public void getOrderStatus(){
        super.getorderStatus();
        System.out.println("The order is delivered on "+delieveryDate);
    }
}

// OnlineRetailOrderMgmt class to manage online retail orders
class OnlineRetailOrderMgmt{
    // Main method to test order management
    public static void main(String[] args) {
        // Create order objects
        Order o1= new Order("54hb", "1-8-2024");
        ShippedOrder o2=new ShippedOrder("56lk","7-8-2024",054);
        DelieverdOrder o3= new DelieverdOrder("jk45", "5-7-2024", 1250, "13-8-2024");
        // Get order status
        o1.getOrderStatus("54hb","1-8-2024");
        o2.getorderStatus();
      
        o3.getOrderStatus();
    }
}
