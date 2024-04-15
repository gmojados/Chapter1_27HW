package HW1_27;

public class Student {
    double studentId;
    int age;

    void speak(String greeting){
        System.out.println(greeting);
    }

    void profile(String subject, char grade){
        System.out.println("Subject: " + subject + "Grade is: " + grade);
    }
    public void setStudentId(double studentId){
        this.studentId = studentId;
    }
    public double getStudentId(){

        return studentId;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){

        return age;
    }

}
