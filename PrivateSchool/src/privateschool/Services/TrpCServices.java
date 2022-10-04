
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;
import privateschool.StudentsperCourse;
import privateschool.Trainer;
import privateschool.TrainersperCourse;

public class TrpCServices {
    
    
  static ArrayList<TrainersperCourse> trainersJava;
  static ArrayList<TrainersperCourse> trainersHtml;
  static ArrayList<TrainersperCourse> trainersCss;
    ArrayList<Student> studentsView;
    ArrayList<Course> coursesView;
    ArrayList<Trainer> trainersView;
    ArrayList<Assignment> assignmentsView;
    ArrayList<StudentsperCourse> trpCourse;  
    
    
    
    public TrainersperCourse addtrainersJava () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String tfName = sc.nextLine();
        System.out.println("Last Name: ");
        String tlName = sc.nextLine();
        System.out.println("Course: ");
        String trcourse = sc.nextLine();
        
        
        
     TrainersperCourse newtrainersJava;
       newtrainersJava = new TrainersperCourse ();
        TrpCServices.trainersJava.add(newtrainersJava);
       System.out.println(trainersJava);
        return newtrainersJava;
    }
    
    
    public TrainersperCourse addtrainersHtml () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String tfName = sc.nextLine();
        System.out.println("Last Name: ");
        String tlName = sc.nextLine();
        System.out.println("Course: ");
        String trcourse = sc.nextLine();
        
        
        
     TrainersperCourse newtrainersHtml;
       newtrainersHtml = new TrainersperCourse ();
       TrpCServices.trainersHtml.add(newtrainersHtml);
       System.out.println(trainersHtml);
        return newtrainersHtml;
    }
    
    
    
    public TrainersperCourse addtrainersCss () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String tfName = sc.nextLine();
        System.out.println("Last Name: ");
        String tlName = sc.nextLine();
        System.out.println("Course: ");
        String trcourse = sc.nextLine();
        
        
        
     TrainersperCourse newtrainersCss;
       newtrainersCss = new TrainersperCourse ();
        TrpCServices.trainersCss.add(newtrainersCss); 
       System.out.println(trainersCss);
        return newtrainersCss;
    }
}
