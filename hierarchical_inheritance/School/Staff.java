package hierarchical_inheritance.School;


class Staff extends Person {
    private String designation;
 
    Staff(String var1, int var2, String var3) {
       super(var1, var2);
       this.designation = var3;
    }
 
    public void displayRole() {
       super.displayRole();
       System.out.println("staff");
       System.out.println("Designation: " + this.designation);
    }
 }