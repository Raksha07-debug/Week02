package inheritance.animal_sound;

class Cat extends Animal {
    public Cat(String var1, int var2) {
       super(var1, var2);
    }
 
    public void makeSound() {
       System.out.println("Meow Meow");
    }
 }
 
