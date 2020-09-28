package Chaitra;

import org.junit.Test;

public class MultipleMethods {// class begins
    /**
     * Multiple methods
      */
    public void methodOne(){//methodOne begins
       System.out.println("I'm in methodone!!");
    }//methodOne ends

 @Test
    public void methodTwo(){//methodTwo begins
        methodOne();//calling methodOne
        System.out.println("I'm in MethodTwo!!");
         }//methodTwo ends
}//class ends
