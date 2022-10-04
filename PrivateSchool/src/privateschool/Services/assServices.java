
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Assignment;


public class assServices {
    
    static ArrayList<Assignment> assignmentsList = new ArrayList<>();
    
    public Assignment addAssignment() {
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Title of Assignment: ");
        String title = sc.nextLine();
        System.out.println("Assignment Description: ");
        String description = sc.nextLine();
        System.out.println("Date of Birth: ");
        String subDate = sc.next();
        System.out.println("Submission Date: ");
        int oralmark = sc.nextInt();
        System.out.println("Oral Mark: ");
        int totalmark = sc.nextInt();
        System.out.println("Total Mark: ");
        
        
        Assignment addassignment;
        addassignment = new Assignment(title, description, subDate, oralmark, totalmark);
        assServices.assignmentsList.add(addassignment);
        System.out.println(assignmentsList);
        return addassignment;
    }
    
}
