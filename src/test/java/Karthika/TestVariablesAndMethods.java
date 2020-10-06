package Karthika;

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
    public void methodOne(){//method begins
        String firstName;//local variable
        firstName = "Karthika";
        System.out.println(firstName);
        //assigned firstName to fullname variable
        fullName = firstName ;

    }//method ends

    public void methodTwo(){//method begins
        String lastName;//local variable
        lastName = "Balaji";
        System.out.println(lastName);

        //concatenated lastName to fullName
        fullName = fullName +" " +lastName;

    }//method ends

    public void displayName(){
        System.out.println("fullName:" + fullName);
    }
}//class ends



