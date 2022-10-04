
package privateschool;

import java.util.Scanner;

import privateschool.Services.assServices;
import privateschool.Services.csServices;
import privateschool.Services.stServices;
import privateschool.Services.trServices;
import privateschool.Services.StpCServices;
import privateschool.Services.StudentsperAssServices;
import privateschool.Services.TrpCServices;




public class Registration_Menu {

    
    
    public Registration_Menu myRegistration() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Press 1 to make a new Registration, " + " 2 for using Synthetic Data, " + "3 for new Registration Student per Course, " + "4 for new Registration Student per Assignment, " + "5 for new Registration Trainer per Course " + "or 0 to terminate Programm");
         int choice1 = sc.nextInt();
         while ((choice1) != 1 && (choice1 != 2) && (choice1 !=3) && (choice1 !=4) && (choice1 !=5)&& (choice1 != 0)) {
         System.out.println("Wrong input! Please press 1 to make a new Registration" + "2 for using Synthetic Data" + "3 for new Registration Student per Course " + "4 for new Registration Student per Assignment, " + "5 for new Registration Trainer per Course " + "0 to terminate Programm");
         choice1 = sc.nextInt();
         }
        
        
        
        
    if (choice1 != 0) {
             do {
                 if (choice1 == 1) {
                         System.out.println("Press 6 to add new Student, " + "7 to add new Trainer, " + "8 to add new Course, " + "9 to add new Assignment, " + "or 0 to Terminate");
                         int choice2 =sc.nextInt();
                         
                         while ((choice2 != 6) && (choice2 != 7) && (choice2 != 8) && (choice2 != 9) && (choice2 != 0)) {
                             System.out.println("Wrong input! Please choose one from above");
                             choice2 = sc.nextInt();
                         } 
                         
                         switch (choice2) {
                             case 6:
                                 System.out.println("Add new Student: ");
                                 stServices addstudent = new stServices();
                                 addstudent.addStudent();
                                 break;
                                 
                             case 7:
                                 System.out.println("Add new Trainer: ");
                                 trServices addtrainer = new trServices();
                                 addtrainer.addTrainer();
                                 break;
                                 
                             case 8:
                                 System.out.println("Add new Course: ");
                                 csServices addcourses = new csServices();
                                 addcourses.addCourse();
                                 break;
                                 
                             case 9:
                                 System.out.println("Add new Assignment: ");
                                 assServices addassignments = new assServices();
                                 addassignments.addAssignment();
                                 break;

                             default:
                                 System.out.println("Termination");
                                 choice1 = 0;
                                 break;
                         }
                
                         
                             
                } else if (choice1 == 2) {
                    System.out.println("Press 10 for Students List, " + "11 for Trainers List, " + "12 for Courses List, " + " 13 for Assignments List " + "or 0 to terminate Programm: ");
                    int choice3 = sc.nextInt();
                    while((choice3 != 10) && (choice3 != 11) && (choice3 != 12) && (choice3 != 13) && (choice3 != 0)) {
                        System.out.println("Wrong input! Please choose one from above");
                        choice3 = sc.nextInt();
                    }
                        switch (choice3) {
                            case 10:
                                System.out.println("All Students List: ");
                                SyntheticData studentsView = new SyntheticData();
                                studentsView.AllStudentsList();
                                break;
                                
                            case 11:
                                System.out.println("All Trainers List: ");
                                SyntheticData trainersView = new SyntheticData();
                                trainersView.AllTrainersList();
                                break;
                                
                            case 12:
                                System.out.println("All Courses List: ");
                                SyntheticData coursesView = new SyntheticData();
                                coursesView.AllCoursesList();
                                break;
                                
                            case 13:
                                System.out.println("All Assignments List: ");
                                SyntheticData assignmentsView = new SyntheticData();
                                assignmentsView.AllAssignmentsList();
                                break;
                                
                            default:
                                System.out.println("Termination");
                                choice1 = 0;
                                break;
                        }
                }  else if (choice1 == 3) {
                    System.out.println("Press 14 to register a Student in Java, " + "15 to register a Student in Html, " + "16 to register a Student in Css, " + "17 to register a Student in Cb8, " + "18 to register a Student in Cb10, " + "19 to register a Student in Bootstrap, " + "or 0 to terminate Programm: ");
                    int choice4 = sc.nextInt();
                    while((choice4 != 14) && (choice4 != 15) && (choice4 != 16) && (choice4 != 17) && (choice4 != 18) && (choice4 != 19) && (choice4 != 0)) {
                        System.out.println("Wrong input! Please choose one from above");
                        choice4 = sc.nextInt();
                    }
                    switch (choice4) {
                        case 14:
                            System.out.println("Add Student in Java Course: ");
                            StpCServices addnewstinJava = new StpCServices();
                            addnewstinJava.addstudentsJava();
                            break;
                        case 15:
                            System.out.println("Add Student in Html Course: ");
                            StpCServices addnewstinHtml = new StpCServices();
                            addnewstinHtml.addstudentsHtml();
                            break;
                            
                        case 16:
                            System.out.println("Add Student in Css Course: ");
                            StpCServices addnewstinCss = new StpCServices();
                            addnewstinCss.addstudentsCss();
                            break;
                            
                        case 17:
                            System.out.println("Add Student in Cb8 Course: ");
                            StpCServices addnewstinCb8 = new StpCServices();
                            addnewstinCb8.addstudentsCb8();
                            break;  
                            
                        case 18:
                            System.out.println("Add Student in Cb10 Course: ");
                            StpCServices addnewstinCb10 = new StpCServices();
                            addnewstinCb10.addstudentsCb10();
                            break;
                            
                        case 19:
                            System.out.println("Add Student in Bootstrap Course: ");
                            StpCServices addnewstinBootstrap = new StpCServices();
                            addnewstinBootstrap.addstudentsBootstrap();
                            break;
                            
                        default:
                                System.out.println("Termination");
                                choice1 = 0;
                                break;
                    }
                    
                    
                } else if (choice1 == 4) {
                    System.out.println("Press 20 for new Registration Student per Assignment1, " + "21 for new Registration Student per Assignment2, " + "22 for new Registration Student per Assignment3, " + "23 for new Registration Student per Assignment4 " + "or 0 to terminate Programm");        
                    int choice5 = sc.nextInt();
                    while((choice5 != 20) && (choice5 != 21) && (choice5 != 22) && (choice5 != 23) && (choice5 != 0)) {
                    System.out.println("Wrong input! Please choose one from above");
                    choice5 = sc.nextInt();
                    }
                    
                    switch (choice5) {
                        case 20:
                            System.out.println("Add Student in Assignment_Java: ");
                            StudentsperAssServices addnewstinAss1 = new StudentsperAssServices();
                            addnewstinAss1.addstassJava();
                            break;
                         
                        case 21:
                            System.out.println("Add Student in Assignment_Html: ");
                            StudentsperAssServices addnewstinAss2 = new StudentsperAssServices();
                            addnewstinAss2.addstassHtml();
                            break;
                    
                        case 22:
                            System.out.println("Add Student in Assignment_Css: ");
                            StudentsperAssServices addnewstinAss3 = new StudentsperAssServices();
                            addnewstinAss3.addstassCss();
                            break;
                    
                        case 23:
                            System.out.println("Add Student in Assignment_Html: ");
                            StudentsperAssServices addnewstinAss4 = new StudentsperAssServices();
                            addnewstinAss4.addstassCb8();
                            break;
                            
                        default:
                                System.out.println("Termination");
                                choice1 = 0;
                                break;
                    }
                    
                    
                    
                    }else if (choice1 == 5) {
                     System.out.println("Press 24 to registrate Trainer in Java Course, " + "25 to registrate Trainer in Html Course, " + "26 to registrate Trainer in Css Course " + "or 0 to terminate Programm");        
                     int choice6 = sc.nextInt();
                     while((choice6 != 24) && (choice6 != 25) && (choice6 != 26) && (choice6 != 0)) {
                     System.out.println("Wrong input! Please choose one from above");
                     choice6 = sc.nextInt(); 
                    }
                     
                    switch (choice6) {
                        case 24:
                            System.out.println("Add Trainer in Java Course: ");
                            TrpCServices addnewtrinJava = new TrpCServices();
                            addnewtrinJava.addtrainersJava();
                            break;
                            
                        case 25:
                            System.out.println("Add Trainer in Html Course: ");
                            TrpCServices addnewtrinHtml = new TrpCServices();
                            addnewtrinHtml.addtrainersHtml();
                            break;
                            
                        case 26:
                            System.out.println("Add Trainer in Css Course: ");
                            TrpCServices addnewtrinCss = new TrpCServices();
                            addnewtrinCss.addtrainersCss();
                            break;
                            
                        default:
                            System.out.println("Termination");
                                choice1 = 0;
                                break;
                    }
                    }
                    
            } while (choice1 != 0);
             System.out.println("Terminatation");
             
            } else {
                System.out.println("Termination");
            }           
                 Registration_Menu menu = new Registration_Menu();
                 return menu;
    }
}           
                             
                             
                             
                             
                             
                             
                             

        
        
        
        
     
        