
package privateschool;

import java.util.ArrayList;


public class TrainersperCourse {
    
    Course course;
    static ArrayList<Trainer> trainersJava;

    public TrainersperCourse(Course course, ArrayList<Trainer> trainersc1) {
        this.course = course;
        this.trainersJava = trainersc1;
    }
    
    

    public TrainersperCourse() {}

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public static ArrayList<Trainer> getTrainersJava() {
        return trainersJava;
    }

    public static void setTrainersJava(ArrayList<Trainer> trainersJava) {
        TrainersperCourse.trainersJava = trainersJava;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrainersperCourse{course=").append(course);
        sb.append('}');
        return sb.toString();
    }
       
}
