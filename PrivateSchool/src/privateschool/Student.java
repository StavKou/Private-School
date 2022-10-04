
package privateschool;

import java.util.ArrayList;


public class Student {
    

   
    private String fName;
    private String lName;
    private String doBirth;
    private int tFee;
     public static ArrayList<Student> studentsView = new ArrayList<Student>();
    
    
    

    public Student(String fName, String lName, String doBirth, int tFee) {
 
        this.fName = fName;
        this.lName = lName;
        this.doBirth = doBirth;
        this.tFee = tFee;
        
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getDoBirth() {
        return doBirth;
    }

    public void setDoBirth(String doBirth) {
        this.doBirth = doBirth;
    }

    public int gettFee() {
        return tFee;
    }

    public void settFee(int tFee) {
        this.tFee = tFee;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student{fName=").append(fName);
        sb.append(", lName=").append(lName);
        sb.append(", doBirth=").append(doBirth);
        sb.append(", tFee=").append(tFee);
        sb.append('}');
        return sb.toString();
    } 
    
}    
