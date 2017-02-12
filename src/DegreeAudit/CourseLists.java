package DegreeAudit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Matt on 2/9/2017.
 */
public class CourseLists {

    // array of cset courses
    // uses the constructor in the course class and passes it the four required params for each course
    private Course[] cset = new Course[]{
            new Course("Fr", "CSET", 1100, 3),
            new Course("Fr", "CSET", 1200, 3),
            new Course("So", "CSET", 2230, 4),
            new Course("So", "CSET", 2200, 4),
            new Course("Jr", "CSET", 3150, 4),
            new Course("Jr", "CSET", 3300, 4),
            new Course("Jr", "CSET", 3100, 3),
            new Course("Jr", "CSET", 3200, 3),
            new Course("Jr", "CSET", 3250, 3),
            new Course("Jr", "CSET", 3400, 3),
            new Course("Jr", "CSET", 4150, 3),
            new Course("Sr", "CSET", 3600, 3),
            new Course("Sr", "CSET", 4350, 3),

            new Course("Sr", "CSET", 4750, 4),
            new Course("Sr", "CSET", 4250, 3),
            new Course("Sr", "CSET", 4200, 4),
            new Course("Sr", "CSET", 4650, 4),
            new Course("Sr", "CSET", 4850, 4)
    };
    // array of cset courses
    // uses the constructor in the course class and passes it the four required params for each course
    private Course[] math ={
            new Course("So", "MATH",2450, 3),
            new Course("So", "MATH",2460, 3),
            new Course("Jr", "MATH",2890,3)
    };


    // function to call to get the number of credit hours for the course the user enters
    public int getCreditHours(String course){
        // splits the course in two parts the course type (CSET)
        // and the sectionNumber (1200)
        String courseType = course.substring(0,4);
        int sectionNumber = Integer.parseInt(course.substring(4));

        // ensure the sectionNumber is valid 1000 - 5000
        if(sectionNumber > 1000 && sectionNumber < 5000){
            // determine what courseType the user enterered
            switch(courseType.toLowerCase()){
                case "cset":
                    // if the user enter a cset courseType pass the list of cset courses and the
                    //section number to the find Credit function
                    return findCredits(cset,sectionNumber);
                case "math":
                    // if the user enter a math courseType pass the list of math courses and the
                    //section number to the find Credit function
                    return findCredits(math,sectionNumber);

                default:
                    // print error message if the courseType the user entered does not match a courseType array
                    System.out.println("Invalid Course Number");
            }
        }else{
            // print error message if the user enters an invalid section number (not between 1000 - 5000)
            System.out.println("Invalid Section Number");
        }
        // return 0 if findCredit function is never called
        return 0 ;
    }

    // function to find the credits of the course the user entered
    private int findCredits(Course[] courses,int sectionNumber) {
       // loops through the array of courses that is passed to the function (Cset..math.. see getCreditHours function)
        // uses c as a reference to the current course being used in the loop
        for (Course c : courses) {
            // test whether the section Number the user entered matches a courses section Number
            // by using the getSectionNumber function of the course class
            if (c.getSectionNumber() == sectionNumber) {
                //if it matchs the getCreditHours function is used to return the number of credit hours of the course
                return c.getCreditHours();
            }

        }
        return 0;
    }
}