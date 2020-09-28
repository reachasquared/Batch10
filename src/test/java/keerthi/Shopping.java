package keerthi;

import org.junit.Test;

public class Shopping {//calss shopping begins
    @Test
        //parkingLot
        public void parkingLot(){//method parkingLOt begins//////calling methods inside methods/////

            System.out.println("In parking Lot");
            mainEntrance();//calling mainEntrance method//
            toysAisle();//calling toysAisle method//
            selectToy();//calling selectToy method//
            billing();//calling billing method//
            parkingLot2();//caling parkingLot method//
        }  //method parkingLOt ends

        public void mainEntrance(){//method  mainEntrance begins
           System.out.println("At main Entrance");
        }//method  mainEntrance ends
        public void toysAisle(){//method  Toysaisle begins
            System.out.println("In Toys Aisle");
        }//method  toysaisle ends
        public void selectToy(){//method  select Toy begins
            System.out.println("In select Toy");
    }//method  select Toy ends
    public void billing() {//method  billing begins
        System.out.println("In  billing");
    }//method billing ends
    public void parkingLot2() {////method parkingLot begins

     System.out.println("In parking lot 2");
 }//method parkingLot ends

}//class shopping ends
