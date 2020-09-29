package RP;

import org.junit.Test;

public class TestVariables {//class starts
   @Test
    public void testVariables(){//method starts

        String fullName;
        int age=10;
        char gender;
        boolean status;

        fullName="Priyanka";
        age=35;
        System.out.println(fullName);
        System.out.println(age);
        gender='F';
        System.out.println(gender);


        //with variables

        System.out.println("Full Name:"+fullName);
        System.out.println("Age:"+age);
        gender='F';
        System.out.println("Gender:"+gender);

    }


}
