
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Assignment;
import privateschool.Course;
import privateschool.Student;
import privateschool.StudentsperCourse;
import privateschool.Trainer;





public class StpCServices {
    
    static ArrayList<StudentsperCourse> studentsJava = new ArrayList<>();
    static ArrayList<StudentsperCourse> studentsHtml = new ArrayList<>();;
    static ArrayList<StudentsperCourse> studentsCss = new ArrayList<>();;
    static ArrayList<StudentsperCourse> studentsCb8 = new ArrayList<>();;
    static ArrayList<StudentsperCourse> studentsCb10 = new ArrayList<>();;
    static ArrayList<StudentsperCourse> studentsBootstrap = new ArrayList<>();;
    
    ArrayList<Student> studentsView;
    ArrayList<Course> coursesView;
    ArrayList<Trainer> trainersView;
    ArrayList<Assignment> assignmentsView;
    ArrayList<StudentsperCourse> stpCourse;


    
    public StudentsperCourse addstudentsJava () {   // addstudentsJava
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperCourse newstudentsJava;
        newstudentsJava = new StudentsperCourse ();  
        StpCServices.studentsJava.add(newstudentsJava);
        System.out.println(studentsJava);
        return newstudentsJava;
    }    
    
    
    
    public StudentsperCourse addstudentsHtml () {   // addstudentsHtml
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperCourse newstudentsHtml;
        newstudentsHtml = new StudentsperCourse ();  
        StpCServices.studentsHtml.add(newstudentsHtml);
        System.out.println(studentsHtml);
        return newstudentsHtml;
    }
    
    
    
    public StudentsperCourse addstudentsCss () {     // addstudentsCss
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperCourse newstudentsCss;
        newstudentsCss = new StudentsperCourse ();  
        StpCServices.studentsCss.add(newstudentsCss);
        System.out.println(studentsCss);
        return newstudentsCss;
    }
    
    
    
    public StudentsperCourse addstudentsCb8 () {   // addstudentsCb8
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperCourse newstudentsCb8;
        newstudentsCb8 = new StudentsperCourse ();  
        StpCServices.studentsCb8.add(newstudentsCb8);
        System.out.println(studentsCb8);
        return newstudentsCb8;
    }
    
    
    
    public StudentsperCourse addstudentsCb10 () {   // addstudentsCb10
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperCourse newstudentsCb10;
        newstudentsCb10 = new StudentsperCourse ();  
        StpCServices.studentsCb10.add(newstudentsCb10);
        System.out.println(studentsCb10);
        return newstudentsCb10;
    }
    
    
    public StudentsperCourse addstudentsBootstrap () {   // addstudentsBootstrap
        
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Course: ");
        String course = sc.nextLine();
        
        
        
        StudentsperCourse newstudentsBootstrap;
        newstudentsBootstrap = new StudentsperCourse ();  
        StpCServices.studentsBootstrap.add(newstudentsBootstrap);
        System.out.println(studentsBootstrap);
        return newstudentsBootstrap;
    }
    
}