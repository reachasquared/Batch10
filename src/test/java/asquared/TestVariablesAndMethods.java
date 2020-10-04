package asquared;

import org.junit.Test;

public class TestVariablesAndMethods { //class begins
    //class level variable
    String fullName;

    @Test
    public void testVariablesAndMethods(){
        fullName = "not a valid value";
        displayName();
        methodOne();
        methodTwo();
    }

    public void methodOne(){ //method begins
        String firstName; //local variable

        firstName = "ASquared";
        System.out.println(firstName);

        // assigned firstname to fullname variable
        fullName = firstName;
    }//method ends

    public void methodTwo(){ //method begins
        String lastName; //local variable

        lastName = "LLC.";
        System.out.println(lastName);

        // Concatenated lastname to fullname
        fullName = fullName + " " + lastName;
    }//method ends

    public void displayName(){//method begins
        System.out.println("Full name: " + fullName);
    }//method ends

}// class ends
