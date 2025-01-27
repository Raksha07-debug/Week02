package hybrid_inheritance.ChefQ;

class Restaurant {
    Restaurant() {
    }
 
    public static void main(String[] var0) {
       Person var1 = new Person("Sarv", "1307");
       var1.performDuties();
       System.out.println("-------------------");
       Chef var2 = new Chef("Rahul", "123");
       var2.performDuties();
       System.out.println("-------------------");
       Waiter var3 = new Waiter("Rohan", "456");
       var3.performDuties();
    }
 }
 
