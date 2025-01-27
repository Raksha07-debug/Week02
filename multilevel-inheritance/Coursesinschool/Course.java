 class Course {
    
    private String courseName;
    private int duration;
    Course(String courseName,int duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void getDetails(){
        System.out.println("course name is "+courseName);
        System.out.println("duration is "+duration+" months");
    }

    
}

// subclass of course
class OnlineCourse extends Course{
    private String platform;
    private  String isRecorded;
    OnlineCourse(String courseName,int duration)
    {
        super(courseName, duration);
        this.platform="Online";
    }
    public void getDetails(){
        super.getDetails();
        System.out.println("the platform is "+platform);
        System.out.println("course is recorded "+isRecorded);
    }

}
//subclass of OnlineCourse 
class PaidOnlineCourse extends OnlineCourse{
    private  float fee;
    private float discount;
    PaidOnlineCourse(String courseName,int duration,float fee,float discount)
    {
        super(courseName, duration);
        this.fee=fee;
        this.discount=discount;

    }
    public void getDetails(){
        super.getDetails();
        System.out.println("fee is "+fee);
    System.out.println("the discounted amount is "+discount);
    }


}

class EducationCourseHierarchy{
    //main method
    public static void main(String[] args) {
        //object create
        PaidOnlineCourse course=new PaidOnlineCourse("java",5,1000,200);
        course.getDetails();
        Course c=new Course("soft skills", 12);
        c.getDetails();
        OnlineCourse o=new OnlineCourse("Generative AI", 24);
        o.getDetails();


    }
}