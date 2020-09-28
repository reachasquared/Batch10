package Karthika;

import org.junit.Test;

public class Shopping {//class begins
//1. Parking lot
    @Test
    public void parkingLot(){//method parkingLot beings
        System.out.println("In parking LOT");
        mainEntrance();//calling main entrance
        ToysAisle();//calling toy aisle
         selectToy();//calling select toy
         }// method parkingLot ends

//2. Main Entrance
    public void mainEntrance() {//method mainEntrance begins
System.out.println("At main Entrance");
    }//method mainEntrance close


//3. Toys aisle
    public void ToysAisle(){//method ToyS Aisle begins
        System.out.println("In toys aisle");
    }//method Toys Aisle ends


//4. select toy
    public void selectToy(){//method select toys begins
       System.out.println("In  select toy");
    }// method select toy ends


//5. billing
    public void billing(){//method billing begins
        System.out.println("In the billing section");
        billing();//calling billing
    }//method billing ends


//6. parking lot
public void parkinglot(){//method parking lot begins
        System.out.println("In the parking lot");
    parkinglot();//calling parking
    }//method parking lot ends

}//class ends
