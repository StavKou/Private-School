
package privateschool;

import java.util.ArrayList;


public class Course {
   
    
    private String title;
    private String stream;
    private String type;
    private String stDate;
    private String endDate;
    public static ArrayList<Course> courses = new ArrayList<Course>();
    public static ArrayList<Course> coursesView = new ArrayList<>();

    
    
    public Course(String title, String stream, String type, String stDate, String endDate) {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.stDate = stDate;
        this.endDate = endDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStDate() {
        return stDate;
    }

    public void setStDate(String stDate) {
        this.stDate = stDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Course{title=").append(title);
        sb.append(", stream=").append(stream);
        sb.append(", type=").append(type);
        sb.append(", stDate=").append(stDate);
        sb.append(", endDate=").append(endDate);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
