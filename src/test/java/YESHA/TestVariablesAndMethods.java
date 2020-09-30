package YESHA;

import org.junit.Test;

public class TestVariablesAndMethods {//class begins
    //class level variable
    String fullName;

    @Test
    public void testVariablesAndMethods(){
        fullName = "not a valid value";

        methodOne();
        methodTwo();
        displayName();
    }

    public void methodOne() {// method begins
        String firstname;


        firstname = "YESHA";
        System.out.println(firstname);

        //assign firstname to fullname variable
        fullName =firstname;
    }//method ends

    public void methodTwo() {//method begins
        String Lastname;// local varaible
        Lastname = "PATEL";
        System.out.println(Lastname);


        //concatenated lastname to fullname
        fullName = fullName + " " + Lastname;

    }// method ends

    public void displayName(){//method begins



        System.out.println("Full name" + fullName);

    }//method ends


}// class ends









