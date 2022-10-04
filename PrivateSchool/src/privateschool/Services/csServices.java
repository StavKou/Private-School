
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Course;


public class csServices {
   
    static ArrayList<Course> coursesList = new ArrayList<>();
    
    public Course addCourse() {
    
     
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Course Title: ");
        String title = sc.nextLine();
        System.out.println("Stream Course: ");
        String stream = sc.nextLine();
        System.out.println("Course Type: ");
        String type = sc.nextLine();
        System.out.println("Starting Date:");
        String stDate = sc.nextLine();
        System.out.println("End Date: ");
        String endDate = sc.nextLine();
        
        
        Course addcourse;
        addcourse = new Course(title, stream, type, stDate, endDate);
        csServices.coursesList.add(addcourse);
        System.out.println(coursesList);
        return addcourse;
    }    
}
