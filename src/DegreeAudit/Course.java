package DegreeAudit;

/**
 * Created by Matt on 2/9/2017.
 */
public class Course {
    //Properties for the course class
    private String year;
    private String type;
    private int sectionNumber;
    private int creditHours;

    //constructor for course class
    // Requires 4 properties to create a course object
    public Course(String year, String type, int courseNumber, int creditHours) {
        this.year = year;
        this.type = type;
        this.sectionNumber = courseNumber;
        this.creditHours = creditHours;
    }

    // getter methods to access course properties
    public String getYear() {
        return year;
    }

    public String getType() {
        return type;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public int getCreditHours() {
        return creditHours;
    }
}
