package Chaitra;

import org.junit.Test;

public class TestVariablesandMethods {//class begins

    //class level variable
    String fullName;

    @Test
    public void testVariablesandMethods() {

        fullName = "not a valid value";

        methodONE();
        methodTwo();
        displayName();

    }


    public void methodONE(){ // method begins
        String firstName;//local variable

        firstName = "Chaitra";
        System.out.println(firstName);
       //assigned firstname to fullname variable
        fullName = firstName;


            }//method ends

    public void methodTwo() {// method begins
        String lastName;//local variable

        lastName = "Pramod";
        System.out.println(lastName);

        //concatinated lastname to full name
        fullName = fullName + " " + lastName;


    }//method ends

    public void displayName(){//method begins

        System.out.println("FullName:" + fullName);
    }//method ends



    }//class ends


