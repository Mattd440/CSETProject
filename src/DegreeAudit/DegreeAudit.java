package DegreeAudit;

import java.util.Scanner;

/**
 * Created by Matt on 2/9/2017.
 */
public class DegreeAudit {
     public static void main(String[] args){
         Scanner input = new Scanner(System.in);
         CourseLists courses = new CourseLists();
         // hours needed to graduate
         final int HOURSTOGRADUATE = 128;
         // students credits completed so far
         int hoursCompleted = 0 ;
         // how many courses user has taken
         int coursesTaken = 0;
         // how many credits the course is worth
         int credits;
         // holds the course the user enters
         String course;

         //ask the user how many courses they have taken
         System.out.println("How many courses have you completed?");
         coursesTaken = input.nextInt();
         
         // get every course taken by the student by looping to from 0 - the number of classes they enter they have taken
         for(int i = 0; i < coursesTaken;i++){
             // user enters the course
             System.out.println("Enter a course that you have completed in the form CSET1200  ");
             course = input.next();
             // call the getCredit hours  function using the object of the Courselist class
             // and pass it the course the user enters
            credits = courses.getCreditHours(course);
            // increment the hours the student have completed by how many credits the course is worth
             hoursCompleted += credits;
         }
         // display how many credits they have remaining
         System.out.printf("You have %d hours left", HOURSTOGRADUATE - hoursCompleted);
     }
 