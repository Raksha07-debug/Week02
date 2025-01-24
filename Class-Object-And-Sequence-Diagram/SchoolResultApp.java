import java.util.ArrayList;
import java.util.List;
 class Subject {
    private String subName;
    private double marks;

    public Subject(String subName, double marks) {
        this.subName = subName;
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getSubName() {
        return subName;
    }
}



 class Student {
    private String studentName;
    private int id;
    private List<Subject> subjects;

    public Student(String studentName, int id) {
        this.studentName = studentName;
        this.id = id;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public int getSubjectCount() {
        return subjects.size();
    }
    
    public String getStdName() {
        return studentName;
    }

    public int getStdId() {
        return id;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }
}


 class GradeCalculator {

    public static String calculateGrade(Student student) {
        double totalMarks = 0;
        int totalSubjects = student.getSubjectCount();

        if (totalSubjects == 0) {
            return "No subject available.";
        } else {
            for (Subject subject : student.getSubjects()) {
                totalMarks += subject.getMarks();
            }

            double avg = totalMarks / totalSubjects;

            if (avg >= 90) {
                return "A";
            } else if (avg >= 80) {
                return "B";
            } else if (avg >= 70) {
                return "C";
            } else if (avg >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }
}


 class SchoolResultApp {
    public static void main(String[] args) {
        
        Subject subj1 = new Subject("Maths", 89);
        Subject subj2 = new Subject("Chemistry", 92);
        Subject subj3 = new Subject("Physics", 85);

        Student student = new Student("Saviii", 707);

        student.addSubject(subj1);
        student.addSubject(subj2);
        student.addSubject(subj3);

        String grade = GradeCalculator.calculateGrade(student);

        System.out.println("Student: " + student.getStdName() + " , Grade: " + grade);
    }
}
