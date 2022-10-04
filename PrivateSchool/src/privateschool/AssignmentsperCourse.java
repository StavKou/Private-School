
package privateschool;

import java.util.ArrayList;


public class AssignmentsperCourse {
    
    Course course;
    static ArrayList<Assignment> assJava = new ArrayList<>();

    public AssignmentsperCourse(Course course, ArrayList<Assignment> assJava) {
        this.course = course;
        this.assJava = assJava;
    }
    
    public AssignmentsperCourse() {}

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static ArrayList<Assignment> getAssJava() {
        return assJava;
    }

    public static void setAssJava(ArrayList<Assignment> assJava) {
        AssignmentsperCourse.assJava = assJava;
    }

    @Override
    public String toString() {
        return "AssignmentsperCourse{" + "course=" + course + '}';
    }
    
}
