package Dharti;

import org.junit.Test;

public class Shopping {//class begins
    //1. Parking lot
    @Test
    public void parkingLot(){//method parkingLot begins
       System.out.println("In parking lots");
       mainEntrance();//calling main enterance method
        toyAisle();//calling toys aisle method
        selectToy();//calling select Toy method
        billing();//calling billing method
        parkinglot();//calling parkinglot method

        }//parking lot ends
//2. Main Entrance
    public void mainEntrance(){//method main enterance begins
      System.out.println("At main Enterance");
      }//main enterance ends
    //3. Toys aisle
    public void toyAisle(){//method toys aisle begins
       System.out.println("In toysAisle");
    }//toys aisle ends
        //4. select toy
    public void selectToy(){//method select Toys begins
      System.out.println("select Toy");
    }//select Toys ends
//5. billing
    public void billing(){//method billing begins
     System.out.println("billing");
    }//method billing ends
//6. parking lot
    public void parkinglot(){//method parking lot begins
     System.out.println("parking lot");
    }


}//class ends
