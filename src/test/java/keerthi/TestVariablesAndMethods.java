package keerthi;

import org.junit.Test;

public class TestVariablesAndMethods {//class begins
    String fullName;//class level variable
    @Test
    public void testVariablesAndMethods(){
      fullName ="not a valid value";

        methodOne();
        methodTwo();
        displayName();
    }
    public void methodOne(){
 String firstName;//local variable

 firstName = "keerthi";
 System.out.println(firstName);
 //assign first name to variable  fullname
 fullName = firstName;

    }//methods ends
public void methodTwo(){//method begins
        String lastName;//local variable
        lastName = "Ram";
    System.out.println(lastName);
    //concatenated fullName to firstname
     fullName = fullName + " " + lastName;
}//method ends
public  void displayName(){//method begins

        //fullName = "keerthi Ram";
       System.out.println("fullName:" + fullName);
     //System.out.println("fullName:"  = "firstName + " " + lastName");

}//method ends
}//class ends
