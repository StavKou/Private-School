
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.StudentsperAssignment;
import privateschool.StudentsperCourse;



public class StudentsperAssServices {
    
    static ArrayList<StudentsperAssignment> assJava = new ArrayList<>();
    static ArrayList<StudentsperAssignment> assHtml = new ArrayList<>();;
    static ArrayList<StudentsperAssignment> assCss = new ArrayList<>();;
    static ArrayList<StudentsperAssignment> assCb8 = new ArrayList<>();;
    
    
    ArrayList<Course> coursesView;
    ArrayList<Assignment> assignmentsView;
    ArrayList<StudentsperCourse> stpCourse;
    
    
    public StudentsperAssignment addstassJava () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Assignment Title: ");
        String title = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperAssignment newstAss1;
        newstAss1 = new StudentsperAssignment();  
        StudentsperAssServices.assJava.add(newstAss1);
        System.out.println(assJava);
        return newstAss1;
    }
    
    
    public StudentsperAssignment addstassHtml () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Assignment Title: ");
        String title = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperAssignment newstAss2;
        newstAss2 = new StudentsperAssignment();  
        StudentsperAssServices.assJava.add(newstAss2);
        System.out.println(assJava);
        return newstAss2;
    }
    
    
    public StudentsperAssignment addstassCss () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Assignment Title: ");
        String title = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperAssignment newstAss3;
        newstAss3 = new StudentsperAssignment();  
        StudentsperAssServices.assJava.add(newstAss3);
        System.out.println(assJava);
        return newstAss3;
    }
    
    
    public StudentsperAssignment addstassCb8 () {
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Assignment Title: ");
        String title = sc.nextLine();
        System.out.println("Description: ");
        String description = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperAssignment newstAss4;
        newstAss4 = new StudentsperAssignment();  
        StudentsperAssServices.assJava.add(newstAss4);
        System.out.println(assJava);
        return newstAss4;
    }
}
