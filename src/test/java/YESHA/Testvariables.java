package YESHA;

import org.junit.Test;

public class Testvariables {//class begins
    @Test
   public void testvariables() {//method begins
     //Local Variable declaration
     String fullname;
     int age;
     char gender;
     boolean status;

     fullname = "YESHA";
     age = 35;

     System.out.println(fullname);
     System.out.println(age);

     gender = 'F';
     System.out.println(gender);

    //Displaying values with labels
        System.out.println("Full Name:"+ fullname);
        System.out.println("Age:" + age);
        System.out.println("Gender: "+ gender);
   }// method ends
}//class ends
