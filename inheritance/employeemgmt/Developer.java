package inheritance.employeemgmt;

class Developer extends Employee {
    // Private field for programming language
    private String programLang;

    // Constructor to initialize developer details including programming language
    public Developer(String name, int id, double salary, String programLang) {
        super(name, id, salary);
        this.programLang = programLang;
    }

    // Getter method for programming language
    public String getLang() {
        return programLang;
    }

    // Override displayDetails method to include programming language
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Programming language: " + programLang);
    }
}

