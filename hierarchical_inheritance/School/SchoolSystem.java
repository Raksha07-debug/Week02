package hierarchical_inheritance.School;

class SchoolSystem{
    public static void main(String[] args) {
        // Creating instances of Teacher, Student, and Staff classes
        Teacher t=new Teacher("Rahul",25,"Maths");
        Student s=new Student("Rohan",20,85.5);
        Staff st=new Staff("Ramesh",30,"Principal");
        // Displaying roles of teacher, student, and staff
        t.displayRole();
        System.out.println("----------------");
        s.displayRole();
        System.out.println("----------------");

        st.displayRole();

    }
}