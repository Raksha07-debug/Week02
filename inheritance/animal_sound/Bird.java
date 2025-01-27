package inheritance.animal_sound;

class Bird extends Animal {
    public Bird(String var1, int var2) {
       super(var1, var2);
    }
 
    public void makeSound() {
       System.out.println("Birds are chirping");
    }
 }
