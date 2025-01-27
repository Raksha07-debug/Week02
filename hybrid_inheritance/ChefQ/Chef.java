package hybrid_inheritance.ChefQ;

class Chef extends Person implements Worker {
    Chef(String var1, String var2) {
       super(var1, var2);
    }
 
    public void performDuties() {
       System.out.println("I am a chef");
       super.performDuties();
    }
 }
 
