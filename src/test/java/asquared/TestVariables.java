package asquared;

import org.junit.Test;

public class TestVariables { //class begins
    @Test
    public void testVariables(){//method begins
        //Local Variable declaration
        String fullName;
        int age = 10;
        char gender = 'F';
        boolean status;

        fullName = "Asquared LLC";
        age = 15;

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(gender);

        //Displaying values with labels
        System.out.println("Full Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);

    }//method ends
}//class ends
