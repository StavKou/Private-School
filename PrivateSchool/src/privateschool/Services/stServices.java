
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Student;

public class stServices {
    
   static ArrayList<Student> studentsList = new ArrayList<>();
    
    
    public Student addStudent() {
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String fName = sc.nextLine();
        System.out.println("Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Date of Birth: ");
        String doBirth = sc.nextLine();
        System.out.println("Tuition Fee: ");
        int tFee = sc.nextInt();
        
        
        Student addstudent;
        addstudent = new Student(fName, lName, doBirth, tFee);
        stServices.studentsList.add(addstudent);
        System.out.println(studentsList);
        return addstudent;
    }
    
}