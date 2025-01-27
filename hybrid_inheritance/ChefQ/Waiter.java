package hybrid_inheritance.ChefQ;

class Waiter extends Person implements Worker {
    // Constructor to call the superclass constructor and initialize the waiter
    Waiter(String name, String id) {
      super(name, id);
    }
  
    // This method overrides the performDuties method from Person and prints a message specific to Waiter
    @Override
    public void performDuties() {
      System.out.println("I am a waiter");
      super.performDuties(); // Call the performDuties method from the parent class Person
    }
  }
  
