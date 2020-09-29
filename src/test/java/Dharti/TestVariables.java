package Dharti;

import org.junit.Test;

public class TestVariables {//class begin
    @Test
  public void testVariables(){//method begins
      //Local variable declaration
      String fullName;
      int age = 10;
      char gender = 'F';
      boolean status;

      fullName = "Dharti Patel";
      age = 15;
      System.out.println(fullName);
      System.out.println(age);
      System.out.println(gender);

//Displaying values with labels
       System.out.println("Full Name:"+ fullName);
       System.out.println("Age:"+ age);
       System.out.println("Gender:" + gender);

  }//method ends

}//class ends
