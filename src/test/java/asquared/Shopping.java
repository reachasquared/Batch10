package asquared;

import org.junit.Test;

public class Shopping {//Class begins
    @Test
    public void atStore(){
        parkingLot();
        mainEntrance();//calling mainEntrance method
        toysAisle();//calling toysAisle
        parkingLot();
    }

    //1. Parking lot
    public void parkingLot(){//method parkingLot begins
        System.out.println("In Parking lot");
        //mainEntrance();//calling mainEntrance method
        //toysAisle();//calling toysAisle
    }//method parkingLot ends

    //2. Main Entrance
    public void mainEntrance(){//method mainEntrance begins
        System.out.println("At main Entrance");
    }//method mainEntrance close

    //3. Toys aisle
    public void toysAisle(){//method toysAisle begins
        System.out.println("In Toys aisle");
    }//method toysaisle ends

    //4. select toy
    //5. billing
    //6. parking lot

}//Class ends
