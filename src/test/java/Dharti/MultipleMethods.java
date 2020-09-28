package Dharti;

import org.junit.Test;

public class MultipleMethods {//class begins

    /**
     * multiplemethods
     */
    public void methodOne() {//methodOne begins
        System.out.println("I am in methodOne");
    }//methodOne ends

    @Test
public void methodTwo() {//methodTwo begins
    methodOne();//calling methodone
    System.out.println("i am in methodTwo");
}//methodTwo ends
}//class ends
