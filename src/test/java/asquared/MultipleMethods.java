package asquared;

import org.junit.Test;

public class MultipleMethods {//class begins

    /**
     * multiple methods
     */
    public void methodOne() {//methodOne begins
        System.out.println("I am in methodOne");
    }//methodOne ends

    @Test
    public void methodTwo(){//methodTwo begins
        methodOne();//calling methodOne
        System.out.println("I am in methodTwo");
    }//methodTwo Ends

}//class ends
