
package privateschool;

import java.util.ArrayList;



public class StudentsperCourse {
    
    
    Course course;
    static ArrayList<Student> studentsJava = new ArrayList<>();

    public StudentsperCourse(Course course, ArrayList<Student> studentsJava) {  // constractor
        this.course = course;
        this.studentsJava = studentsJava;
    }
    
    

    public StudentsperCourse() {}

    

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static ArrayList<Student> getStudentsJava() {
        return studentsJava;
    }

    public static void setStudentsJava(ArrayList<Student> studentsJava) {
        StudentsperCourse.studentsJava = studentsJava;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentsperCourse{course=").append(course);
        sb.append('}');
        return sb.toString();
    }           
}