package hierarchical_inheritance.School;

class Teacher extends Person {
    private String subject;
 
    Teacher(String var1, int var2, String var3) {
       super(var1, var2);
       this.subject = var3;
    }
 
    public void displayRole() {
       super.displayRole();
       System.out.println("teacher");
       System.out.println("Subject: " + this.subject);
    }
 }
 
