
package privateschool;

import java.util.ArrayList;



public class Assignment {
    
   private String title;
   private String description;
   private String subDate;
   private int oralmark;
   private int totalmark;
   public static ArrayList<Assignment> assignments = new ArrayList<Assignment>();

    public Assignment(String title, String description, String subDate, int oralmark, int totalmark) {
        this.title = title;
        this.description = description;
        this.subDate = subDate;
        this.oralmark = oralmark;
        this.totalmark = totalmark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDate() {
        return subDate;
    }

    public void setSubDate(String subDate) {
        this.subDate = subDate;
    }

    public int getOralmark() {
        return oralmark;
    }

    public void setOralmark(int oralmark) {
        this.oralmark = oralmark;
    }

    public int getTotalmark() {
        return totalmark;
    }

    public void setTotalmark(int totalmark) {
        this.totalmark = totalmark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Assignment{title=").append(title);
        sb.append(", description=").append(description);
        sb.append(", subDate=").append(subDate);
        sb.append(", oralmark=").append(oralmark);
        sb.append(", totalmark=").append(totalmark);
        sb.append('}');
        return sb.toString();
    }
   
   
}
