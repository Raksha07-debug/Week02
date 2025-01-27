package hierarchical_inheritance.School;

class Student extends Person {
    private double grade;
 
    Student(String var1, int var2, double var3) {
       super(var1, var2);
       this.grade = var3;
    }
 
    public void displayRole() {
       super.displayRole();
       System.out.println("student");
       System.out.println("Grade: " + this.grade);
    }
 }
 
