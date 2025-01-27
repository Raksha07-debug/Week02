package inheritance.animal_sound;

class Animal {
    private String name = "animal";
    private int age = 10;
 
    Animal(String var1, int var2) {
       this.name = var1;
       this.age = var2;
    }
 
    public void makeSound() {
       System.out.println("Animal makes sound");
    }
 
    public String getName() {
       return this.name;
    }
 
    public int getAge() {
       return this.age;
    }
 }
 
