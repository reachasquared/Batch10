package RP;

import org.junit.Test;

public class TestVariablesAndMethods {//class begins
    String fullName;
    @Test
    public void testVariablesAndMethods(){
        fullName="Not a valid value";
        methodOne();
        methodTwo();
        displayName();
    }
    public void methodOne(){//methodOne starts
        String firstName;
        firstName="Asquared";
        System.out.println(firstName);
        fullName=firstName;
    }//methodOne ends
    public void methodTwo(){//methodOne starts
        String lastName;
        lastName="LLC.";
        System.out.println(lastName);
        //concatenated lastname to firstname
        fullName=fullName+" "+lastName;
    }//methodTwo ends
    public void displayName(){//method starts
        System.out.println("Full Name:  "+fullName);

    }//method ends




}//class ends
