package YESHA;

import org.junit.Test;

public class MultipleMethods {//class begins
    /**
     * Multiple methods
     */
    public void methodOne() {//methodOne begin
  System.out.println("I m in methodone");
    }//methodOne ends


@Test
    public void methodTwo() {//methodTwo begins
        methodOne();//calling methodOne
        System.out.println("i m in methodtwo");
    }// methodtwo Ends

}// class ends


