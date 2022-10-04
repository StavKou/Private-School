
package privateschool;

import java.util.ArrayList;


public class Trainer {
    
    private String tfName;
    private String tlName;
    private String subject;
    public static ArrayList<Trainer> trainers = new ArrayList<Trainer>();

    
    
    public Trainer(String tfName, String tlName, String subject) {
        this.tfName = tfName;
        this.tlName = tlName;
        this.subject = subject;
    }

    public String getTfName() {
        return tfName;
    }

    public void setTfName(String tfName) {
        this.tfName = tfName;
    }

    public String getTlName() {
        return tlName;
    }

    public void setTlName(String tlName) {
        this.tlName = tlName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trainer{tfName=").append(tfName);
        sb.append(", tlName=").append(tlName);
        sb.append(", subject=").append(subject);
        sb.append('}');
        return sb.toString();
    }

    
}
