package RP;

import org.junit.Test;

public class Shopping {//Class begins
    // 1. Parking lot
      public void parkingLot(){//method parkingLot begins
     System.out.println("In Parking Lot");
     }//method parkingLot ends
   //2. Main Entrance
    public  void mainEntrance(){//method mainEntrance begins
        System.out.println("At main Entrance");
     }//method mainEntrance ends
    //3. Toys aisle
    public void toysAisle(){//method toysAisle begins
        System.out.println("In Toys Aisle");
    }//method toysAisle ends
    //4. select toy
    public void selectToy(){//method selectToy starts
        System.out.println("Select a toy");
    }//method selectToy ends
    //5. billing
    public void billing(){//method billing starts
        System.out.println("Pay the bill");
    }//method billing ends
    @Test
    public void atStore() {//method atStore starts
          parkingLot();//calling parkingLot method
        mainEntrance();//calling mainEntrance method
        toysAisle();//calling toysAisle method
        selectToy();//calling selectToy method
        billing();//calling billing method
        parkingLot();//calling parkingLot method
    }//method atStore ends

}//Class ends
