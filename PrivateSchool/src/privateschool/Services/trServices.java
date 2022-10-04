
package privateschool.Services;

import java.util.ArrayList;
import java.util.Scanner;
import privateschool.Trainer;



public class trServices {
    
    static ArrayList<Trainer> trainersList = new ArrayList<>();
    
    public Trainer addTrainer() {
    
        
        Scanner sc = new Scanner(System.in);
        System.out.println("First Name: ");
        String tfName = sc.nextLine();
        System.out.println("Last Name: ");
        String tlName = sc.nextLine();
        System.out.println("Trainer Subject: ");
        String subject = sc.nextLine();
        
        
        Trainer addtrainer;
        addtrainer = new Trainer(tfName, tlName, subject);
        trServices.trainersList.add(addtrainer);
        System.out.println(trainersList);
        return addtrainer;
       
    }
}
