public class Person {
    private String name;
    private int age;
    private String email;

    // Regular constructor
    public Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Copy constructor
    public Person(Person originalPerson) {
        this.name = originalPerson.name;
        this.age = originalPerson.age;
        this.email = originalPerson.email;
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Email: " + email);
    }

    public static void main(String[] args) {
        // Creating an original person
        Person person1 = new Person("Alice", 25, "alice@example.com");

        // Cloning the person
        Person person2 = new Person(person1);

        // Displaying both persons' details
        person1.display();
        person2.display();
    }
}

