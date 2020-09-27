package YESHA;

import org.junit.Test;

public class Shopping {//class begins
   //1.Parking lot
    @Test
   public void parkingLot(){//method parkinglot begins
      System.out.println("In Parking lot");
      mainEntrance();//calling mainEntrance
        toysAisle();//callind toysaisle
        selecttoy();//calling select Toy method
        billing();//calling select billing method
        parkinglot();//calling select parkinglot method
    }//method parkingLot ends

       //2.Main Entrance
       public void mainEntrance() {//method mainentrance begins
           System.out.println("At main Entrance");
       }//method mainentrance close

       //3.Toys aisle
       public void toysAisle() {//method toysAisle begins
           System.out.println("In toys aisle");
       }// method toysaisle ends

     // 4.select toy

     public void selecttoy(){//method selecttoy begins
        System.out.println("select toy");
    }// method selecttoy ends


     //5.billing
    public void billing() {//method billing begins
        System.out.println("At billing");
    }// method billing ends

     //6.parking lot
        public void parkinglot(){//method parkinglot begins
        System.out.println("At parkinglot");
       }//method parkinglot ends


}//class ends
