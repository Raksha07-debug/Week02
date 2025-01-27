package hierarchical_inheritance.School;

// Base class representing a person
class Person {
    private String name;
    private int age;

    // Constructor to initialize person's name and age
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;

    }

    // Method to display person's role
    public void displayRole(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

    }
}

    
