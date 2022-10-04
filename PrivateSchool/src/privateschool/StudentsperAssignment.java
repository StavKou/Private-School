
package privateschool;

import java.util.ArrayList;


public class StudentsperAssignment {
    
    
    Student student;
    static ArrayList<Assignment> studentsAss1 = new ArrayList<>();


    public StudentsperAssignment(Student student, ArrayList<Assignment> studentsAss1) {
        this.student = student;
        this.studentsAss1 = studentsAss1;
    }

    public StudentsperAssignment() {}
    
    

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public static ArrayList<Assignment> getStudentsAss1() {
        return studentsAss1;
    }

    public static void setStudentsAss1(ArrayList<Assignment> studentsAss1) {
        StudentsperAssignment.studentsAss1 = studentsAss1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StudentsperAssignment{student=").append(student);
        sb.append('}');
        return sb.toString();
    }

    

    
}
