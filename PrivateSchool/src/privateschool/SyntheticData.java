package privateschool;

import java.util.ArrayList;

public class SyntheticData {

    ArrayList<Student> studentsView;
    ArrayList<Trainer> trainersView;
    ArrayList<Course> coursesView;
    ArrayList<Assignment> assignmentsView;
    ArrayList<Student> studentsJava;
    ArrayList<Student> studentsHtml;
    ArrayList<Student> studentsCss;
    ArrayList<Student> studentsCb8;
    ArrayList<Student> studentsCb10;
    ArrayList<Student> studentsBootstrap;
    ArrayList<Trainer> trainersJava;
    ArrayList<Trainer> trainersHtml;
    ArrayList<Trainer> trainersCss;
    ArrayList<Trainer> trainersCb8;
    ArrayList<Trainer> trainersCb10;
    ArrayList<Trainer> trainersBootstrap;
    ArrayList<Assignment> assignmentsJava;
    ArrayList<Assignment> assignmentsHtml;
    ArrayList<Assignment> assignmentsCss;
    ArrayList<Assignment> assignmentsCb8;
    ArrayList<Assignment> assignmentsCb10;
    ArrayList<Assignment> assignmentsBootstrap;
    ArrayList<StudentsperCourse> stpCourse;
    ArrayList<TrainersperCourse> trpCourse;
    ArrayList<StudentsperAssignment> stpAssignments;
    ArrayList<AssignmentsperCourse> asspCourse;
    ArrayList<StudentsperAssignment> studentsAss1;
    ArrayList<StudentsperAssignment> studentsAss2;
    ArrayList<StudentsperAssignment> studentsAss3;
    ArrayList<StudentsperAssignment> studentsAss4;
    
    
    

    public ArrayList<Student> AllStudentsList() {

        studentsView = new ArrayList<>();
        Student st1 = new Student("Stavros", "Kourkoulos", "6-5-1989", 2500);
        studentsView.add(st1);
        Student st2 = new Student("Vaggelis", "Pappas", "4-4-1991", 2500);
        studentsView.add(st2);
        Student st3 = new Student("Efi", "Gavrielatou", "9-6-1990", 2500);
        studentsView.add(st3);
        Student st4 = new Student("Tzeni", "Rapti", "15-3-1990", 2500);
        studentsView.add(st4);
        Student st5 = new Student("Antonis", "Katsakos", "1-3-1991", 2500);
        studentsView.add(st5);
        Student st6 = new Student("Pantelis", "Petrou", "11-8-1989", 2500);
        studentsView.add(st6);
        Student st7 = new Student("Giannis", "Sevas", "13-3-1989", 2500);
        studentsView.add(st7);
        Student st8 = new Student("Vaggelis", "Korres", "2-8-1993", 2500);
        studentsView.add(st8);
        Student st9 = new Student("Giwrgos", "Topalidis", "2-2-1985", 2500);
        studentsView.add(st9);
        Student st10 = new Student("Nikos", "Topalidis", "5-2-1987", 2500);
        studentsView.add(st10);
        Student st11 = new Student("Nikos", "Goumenos", "15-12-1987", 2500);
        studentsView.add(st11);
        Student st12 = new Student("Mairh", "Rizou", "13-1-1992", 2500);
        studentsView.add(st12);
        Student st13 = new Student("Kwstas", "Xatzis", "1-5-1991", 2500);
        studentsView.add(st13);
        Student st14 = new Student("Stamatis", "Koxlas", "11-15-1990", 2500);
        studentsView.add(st14);
        Student st15 = new Student("Xaris", "Tziovalis", "3-2-1988", 2500);
        studentsView.add(st15);
        for (int i = 0; i < studentsView.size(); i++) {
            System.out.println(studentsView.get(i));
        }

        return studentsView;
    }



    public ArrayList<Course> AllCoursesList() {

        coursesView = new ArrayList<>();
        Course c1 = new Course("Java", "1", "Front End", "1-1-2022", "5-1-2022");
        coursesView.add(c1);
        Course c2 = new Course("HTML", "2", "Front-End", "1-1-2022", "4-1-2022");
        coursesView.add(c2);
        Course c3 = new Course("CSS", "3", "Front-End", "1-1-2022", "5-2-2022");
        coursesView.add(c3);
        Course c4 = new Course("CB8", "4", "Front End", "1-2-2022", "6-3-2022");
        coursesView.add(c4);
        Course c5 = new Course("CB10", "5", "Back End", "1-1-2022", "15-5-2022");
        coursesView.add(c5);
        Course c6 = new Course("Bootstrap", "6", "Back End", "1-1-2022", "22-5-2022");
        coursesView.add(c6);
        for (int i = 0; i < coursesView.size(); i++) {
            System.out.println(coursesView.get(i));
        }
        return coursesView;

    }

    public ArrayList<Trainer> AllTrainersList() {

        trainersView = new ArrayList<>();
        Trainer t1 = new Trainer("Giorgws", "Pasparakis", "Java");
        trainersView.add(t1);
        Trainer t2 = new Trainer("Dimitris", "Pespas", "CB8");
        trainersView.add(t2);
        Trainer t3 = new Trainer("Rafaila", "Kalogeropoulou", "HTML");
        trainersView.add(t3);
        Trainer t4 = new Trainer("Stamatis", "Dimitrakopoulos", "CB10");
        trainersView.add(t4);
        for (int i = 0; i < trainersView.size(); i++) {
            System.out.println(trainersView.get(i));
        }

        return trainersView;
    }

    public ArrayList<Assignment> AllAssignmentsList() {
        
        assignmentsView = new ArrayList<>();
        Assignment a1 = new Assignment("Assignment1", "desc1", "4-4-2022", 20, 100);
        assignmentsView.add(a1);
        Assignment a2 = new Assignment("Assignment2", "desc2", "4-4-2022", 20, 100);
        assignmentsView.add(a2);
        Assignment a3 = new Assignment("Assignment3", "desc3", "4-4-2022", 20, 100);
        assignmentsView.add(a3);
        Assignment a4 = new Assignment("Assignment4", "desc4", "4-4-2022", 20, 100);
        assignmentsView.add(a4);
        for (int i = 0; i < assignmentsView.size(); i++) {
            System.out.println(assignmentsView.get(i));
        }
        return assignmentsView;
    }

    
        //ArrayList Students per Courses//
    
    public ArrayList<Student> studentsJava() {   // studentsJava
        Student stpc1 = studentsView.get(0);
        studentsJava.add(stpc1);
        Student stpc2 = studentsView.get(1);
        studentsJava.add(stpc2);
        Student stpc3 = studentsView.get(2);
        studentsJava.add(stpc3);
        Student stpc4 = studentsView.get(3);
        studentsJava.add(stpc4);
        for (int i = 0; i < studentsJava.size(); i++) {
            System.out.println(studentsJava.get(i));
        }
        return studentsJava;
    }
    
    
    
    
    public ArrayList<StudentsperCourse> addStudentperCourse() {
    StudentsperCourse stpc1 = new StudentsperCourse(coursesView.get(0), studentsJava);
    stpCourse.add(stpc1);
    StudentsperCourse stpc2 = new StudentsperCourse(coursesView.get(1), studentsHtml);
    stpCourse.add(stpc2);
    StudentsperCourse stpc3 = new StudentsperCourse(coursesView.get(2), studentsCss);
    stpCourse.add(stpc3);
    StudentsperCourse stpc4 = new StudentsperCourse(coursesView.get(3), studentsCb8);
    stpCourse.add(stpc4);
    StudentsperCourse stpc5 = new StudentsperCourse(coursesView.get(4), studentsCb10);
    stpCourse.add(stpc5);
    StudentsperCourse stpc6 = new StudentsperCourse(coursesView.get(5), studentsBootstrap);
    stpCourse.add(stpc6);
    for (int i = 0; i < stpCourse.size(); i++) {
            System.out.println(stpCourse.get(i));
        }
    return stpCourse;
    } 
    
    
    
   public ArrayList<Student> studentsHTML() {    // studentsHtml
        Student stphtml1 = studentsView.get(4);
        studentsHtml.add(stphtml1);
        Student stphtml2 = studentsView.get(5);
        studentsHtml.add(stphtml2);
        Student stphtml3 = studentsView.get(6);
        studentsHtml.add(stphtml3);
        Student stphtml4 = studentsView.get(7);
        studentsHtml.add(stphtml4);
        for (int i = 0; i < studentsHtml.size(); i++) {
            System.out.println(studentsHtml.get(i));
        }
        return studentsHtml;
   }
    
    
   public ArrayList<Student> studentsCss() {   // studentsCss
        Student stpcss1 = studentsView.get(8);
        studentsCss.add(stpcss1);
        Student stpcss2 = studentsView.get(9);
        studentsCss.add(stpcss2);
        Student stpcss3 = studentsView.get(10);
        studentsCss.add(stpcss3);
        Student stpcss4 = studentsView.get(11);
        studentsCss.add(stpcss4);
        for (int i = 0; i < studentsCss.size(); i++) {
            System.out.println(studentsCss.get(i));
        }
        return studentsCss;
   }

    
    public ArrayList<Student> studentsCb8() {    // studentsCb8
        Student stpcbe1 = studentsView.get(12);
        studentsCb8.add(stpcbe1);
        Student stpcbe2 = studentsView.get(13);
        studentsCb8.add(stpcbe2);
        for (int i = 0; i < studentsCb8.size(); i++) {
            System.out.println(studentsCb8.get(i));
        }
        return studentsCb8;
   }
    
    
    public ArrayList<Student> studentsCb10() {   // studentsCb10
        Student stpcb1 = studentsView.get(14);
        studentsCb10.add(stpcb1);
        Student stpcb2 = studentsView.get(15);
        studentsCb10.add(stpcb2);
        for (int i = 0; i < studentsCb10.size(); i++) {
            System.out.println(studentsCb10.get(i));
        }
        return studentsCb10;
    }   
    
    
    
    public ArrayList<Student> studentsBootstrap() {   
        Student stpcb1 = studentsView.get(2);
        studentsBootstrap.add(stpcb1);
        Student stpcb2 = studentsView.get(9);
        studentsBootstrap.add(stpcb2);
        for (int i = 0; i < studentsBootstrap.size(); i++) {
            System.out.println(studentsBootstrap.get(i));
        }
        return studentsBootstrap;
   }

 
    
    
    
    //ArrayList Trainers per Courses//
    
    public ArrayList<Trainer> trainersJava() {  // trainersJava
        Trainer trpc1 = trainersView.get(0);
        trainersJava.add(trpc1);
        Trainer trpc2 = trainersView.get(1);
        trainersJava.add(trpc2);
        
        return trainersJava;
    }
    
    public ArrayList<TrainersperCourse> addTrainerperCourse() {
    TrainersperCourse trpc1 = new TrainersperCourse(coursesView.get(0), trainersJava);
    trpCourse.add(trpc1);
    TrainersperCourse trpc2 = new TrainersperCourse(coursesView.get(1), trainersHtml);
    trpCourse.add(trpc2);
    TrainersperCourse trpc3 = new TrainersperCourse(coursesView.get(2), trainersCss);
    trpCourse.add(trpc3);
    TrainersperCourse trpc4 = new TrainersperCourse(coursesView.get(3), trainersCb8);
    trpCourse.add(trpc4);
    TrainersperCourse trpc5 = new TrainersperCourse(coursesView.get(4), trainersCb10);
    trpCourse.add(trpc5);
    TrainersperCourse trpc6 = new TrainersperCourse(coursesView.get(5), trainersBootstrap);
    trpCourse.add(trpc6);
    
    return trpCourse;
    }
    
    
    public ArrayList<Trainer> trainersHtml() {   // trainersHtml
        Trainer trpchtml1 = trainersView.get(1);
        trainersHtml.add(trpchtml1);
        return trainersHtml;
    }
    
    
    public ArrayList<Trainer> trainersCss() {   // trainersCss
        Trainer trpcss1 = trainersView.get(2);
        trainersCss.add(trpcss1);
        return trainersHtml;
    }
    
    
    public ArrayList<Trainer> trainersCb8() {   // trainersCb8
        Trainer trpcbe1 = trainersView.get(1);
        trainersCb8.add(trpcbe1);
        Trainer trcbe2 = trainersView.get(2);
        trainersCb8.add(trcbe2);
        return trainersCb8;
    }
    
    
    public ArrayList<Trainer> trainersCb10() {   // trainerCb10
        Trainer trpcb1 = trainersView.get(0);
        trainersCb10.add(trpcb1);
        Trainer trcb2 = trainersView.get(3);
        trainersCb10.add(trcb2);
        return trainersCb10;
    }
    
    
    public ArrayList<Trainer> trainersBootstrap() {   // trainersBootstrap
        Trainer trpcboot1 = trainersView.get(1);
        trainersBootstrap.add(trpcboot1);
        Trainer trcboo2 = trainersView.get(2);
        trainersBootstrap.add(trcboo2);
        return trainersBootstrap;
    }

    
    
    
    
    // ArrayList Assignments per Courses//
    
    public ArrayList<Assignment> assJava() {   // assignmentsJava
        Assignment asspc1 = assignmentsView.get(0);
        assignmentsJava.add(asspc1);
        Assignment asspc2 = assignmentsView.get(1);
        assignmentsJava.add(asspc2);
        Assignment asspc3 = assignmentsView.get(2);
        assignmentsJava.add(asspc3);
        Assignment asspc4 = assignmentsView.get(3);
        assignmentsJava.add(asspc4);
        for (int i = 0; i < assignmentsJava.size(); i++) {
            System.out.println(assignmentsJava.get(i));
        }
        return assignmentsJava;
    }
    
    
    
    
    public ArrayList<AssignmentsperCourse> addAssignmentperCourse() {
    AssignmentsperCourse asspc1 = new AssignmentsperCourse(coursesView.get(0), assignmentsJava);
    asspCourse.add(asspc1);
    AssignmentsperCourse asspc2 = new AssignmentsperCourse(coursesView.get(1), assignmentsHtml);
    asspCourse.add(asspc2);
    AssignmentsperCourse asspc3 = new AssignmentsperCourse(coursesView.get(2), assignmentsCss);
    asspCourse.add(asspc3);
    AssignmentsperCourse asspc4 = new AssignmentsperCourse(coursesView.get(3), assignmentsCb8);
    asspCourse.add(asspc4);
    AssignmentsperCourse asspc5 = new AssignmentsperCourse(coursesView.get(4), assignmentsCb10);
    asspCourse.add(asspc5);
    AssignmentsperCourse asspc6 = new AssignmentsperCourse(coursesView.get(5), assignmentsBootstrap);
    asspCourse.add(asspc6);
    for (int i = 0; i < asspCourse.size(); i++) {
            System.out.println(asspCourse.get(i));
        }
    return asspCourse;
    } 
    
    
    
    
    public ArrayList<Assignment> assHtml() {   // assignmentsHtml
        Assignment assp1 = assignmentsView.get(0);
        assignmentsHtml.add(assp1);
        Assignment assp2 = assignmentsView.get(1);
        assignmentsHtml.add(assp2);
        Assignment assp3 = assignmentsView.get(2);
        assignmentsHtml.add(assp3);
        Assignment assp4 = assignmentsView.get(3);
        assignmentsHtml.add(assp4);
        for (int i = 0; i < assignmentsHtml.size(); i++) {
            System.out.println(assignmentsHtml.get(i));
        }
        return assignmentsHtml;
    }
    
    
    
    
    public ArrayList<Assignment> assCss() {   // assignmentsCss
        Assignment asspc1 = assignmentsView.get(0);
        assignmentsCss.add(asspc1);
        Assignment asspc2 = assignmentsView.get(1);
        assignmentsCss.add(asspc2);
        Assignment asspc3 = assignmentsView.get(2);
        assignmentsCss.add(asspc3);
        Assignment asspc4 = assignmentsView.get(3);
        assignmentsCss.add(asspc4);
        for (int i = 0; i < assignmentsCss.size(); i++) {
            System.out.println(assignmentsCss.get(i));
        }
        return assignmentsCss;
    }
    
    
    public ArrayList<Assignment> assCb8() {    // assignmentsCb8
        Assignment asspc1 = assignmentsView.get(0);
        assignmentsCb8.add(asspc1);
        Assignment asspc2 = assignmentsView.get(1);
        assignmentsCb8.add(asspc2);
        Assignment asspc3 = assignmentsView.get(2);
        assignmentsCb8.add(asspc3);
        Assignment asspc4 = assignmentsView.get(3);
        assignmentsCb8.add(asspc4);
        for (int i = 0; i < assignmentsCb8.size(); i++) {
            System.out.println(assignmentsCb8.get(i));
        }
        return assignmentsCb8;
    }
    
    
    public ArrayList<Assignment> assCb10() {   // assignmentsCb10
        Assignment asspc1 = assignmentsView.get(0);
        assignmentsCb10.add(asspc1);
        Assignment asspc2 = assignmentsView.get(1);
        assignmentsCb10.add(asspc2);
        Assignment asspc3 = assignmentsView.get(2);
        assignmentsCb10.add(asspc3);
        Assignment asspc4 = assignmentsView.get(3);
        assignmentsCb10.add(asspc4);
        for (int i = 0; i < assignmentsCb10.size(); i++) {
            System.out.println(assignmentsCb10.get(i));
        }
        return assignmentsCb10;
    }
    
    
    public ArrayList<Assignment> assBootstrap() {  // assignmentsBootstrap
        Assignment asspc1 = assignmentsView.get(0);
        assignmentsBootstrap.add(asspc1);
        Assignment asspc2 = assignmentsView.get(1);
        assignmentsBootstrap.add(asspc2);
        Assignment asspc3 = assignmentsView.get(2);
        assignmentsBootstrap.add(asspc3);
        Assignment asspc4 = assignmentsView.get(3);
        assignmentsBootstrap.add(asspc4);
        for (int i = 0; i < assignmentsBootstrap.size(); i++) {
            System.out.println(assignmentsBootstrap.get(i));
        }
        return assignmentsBootstrap;
    }
    
    
    
    // ArrayList Students per Assignment //
    
    
     public ArrayList<StudentsperAssignment> studentperAss1() {
        StudentsperAssignment asspst1 = studentsAss1.get(0);
        studentsAss1.add(asspst1);
        StudentsperAssignment asspst2 = studentsAss1.get(1);
        studentsAss1.add(asspst2);
        StudentsperAssignment asspst3 = studentsAss1.get(2);
        studentsAss1.add(asspst3);
        StudentsperAssignment asspst4 = studentsAss1.get(3);
        studentsAss1.add(asspst4);
        for (int i = 0; i < studentsAss1.size(); i++) {
            System.out.println(studentsAss1.get(i));
        }
        return studentsAss1;
    }
    
    
    
    
    public ArrayList<StudentsperAssignment> addStudentperAssignment() {
    StudentsperAssignment asspst1 = new StudentsperAssignment(studentsView.get(0), assignmentsJava);
    studentsAss1.add(asspst1);
    StudentsperAssignment asspst2 = new StudentsperAssignment(studentsView.get(4), assignmentsHtml);
    studentsAss2.add(asspst2);
    StudentsperAssignment asspst3 = new StudentsperAssignment(studentsView.get(8), assignmentsCss);
    studentsAss3.add(asspst3);
    StudentsperAssignment asspst4 = new StudentsperAssignment(studentsView.get(12), assignmentsCb8);
    studentsAss4.add(asspst4);
    for (int i = 0; i < studentsAss1.size(); i++) {
            System.out.println(studentsAss1.get(i));
        }
    return stpAssignments;
    }
    
    
    public ArrayList<StudentsperAssignment> studentperAss2() {
        StudentsperAssignment stpass1 = studentsAss1.get(4);
        studentsAss2.add(stpass1);
        StudentsperAssignment stpass2 = studentsAss1.get(5);
        studentsAss2.add(stpass2);
        StudentsperAssignment stpass3 = studentsAss1.get(6);
        studentsAss2.add(stpass3);
        StudentsperAssignment stpass4 = studentsAss1.get(7);
        studentsAss2.add(stpass4);
        for (int i = 0; i < studentsAss2.size(); i++) {
            System.out.println(studentsAss2.get(i));
        }
        return studentsAss2;
    }
    
    
    public ArrayList<StudentsperAssignment> studentperAss3() {
        StudentsperAssignment stpass1 = studentsAss3.get(8);
        studentsAss3.add(stpass1);
        StudentsperAssignment stpass2 = studentsAss3.get(9);
        studentsAss3.add(stpass2);
        StudentsperAssignment stpass3 = studentsAss3.get(10);
        studentsAss3.add(stpass3);
        StudentsperAssignment stpass4 = studentsAss3.get(11);
        studentsAss3.add(stpass4);
        for (int i = 0; i < studentsAss3.size(); i++) {
            System.out.println(studentsAss3.get(i));
        }
        return studentsAss3;
    }
    
    
    public ArrayList<StudentsperAssignment> studentperAss4() {
        StudentsperAssignment stpass1 = studentsAss4.get(12);
        studentsAss4.add(stpass1);
        StudentsperAssignment stpass2 = studentsAss4.get(13);
        studentsAss4.add(stpass2);
        StudentsperAssignment stpass3 = studentsAss4.get(14);
        studentsAss4.add(stpass3);
        for (int i = 0; i < studentsAss4.size(); i++) {
            System.out.println(studentsAss4.get(i));
        }
        return studentsAss4;
    }
    
    
}
