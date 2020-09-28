package keerthi;

import org.junit.Test;

public class MultipleMethods {//class begins

    /**
     * multiple methods
     */
   public void methodsOne()
   {
       //methodsOne begins
       System.out.println("I am in methodOne");
   }//methodsOne ends
    @Test
 public void methodTwo()
 {
     methodsOne();//calling methodsone
       //methodtwo begins
 System.out.println("I am in methodTwo");
 }//methodtwo ends
}//class ends
