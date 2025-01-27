package hybrid_inheritance.ChefQ;

// This class represents a person with a name and id
class Person {
  private String name;
  private String id;

  // Constructor to initialize the name and id
  Person(String name, String id) {
    this.name = name;
    this.id = id;
  }

  // This method prints the person's name and id
  public void performDuties() {
    System.out.println(name + " " + id);
  }
}

// This interface defines a method called performDuties
interface Worker {
  void  performDuties();
}

// This class inherits from Person and implements Worker
class Chef extends Person implements Worker {
  // Constructor to call the superclass constructor and initialize the chef
  Chef(String name, String id) {
    super(name, id);
  }

  // This method overrides the performDuties method from Person and prints a message specific to Chef
  @Override
  public void performDuties() {
    System.out.println("I am a chef");
    super.performDuties(); // Call the performDuties method from the parent class Person
  }
}

