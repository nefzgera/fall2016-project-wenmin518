package main.java.edu.calpoly.cpe305.wenmin.ParkingApplication;

import java.util.ArrayList;
import java.util.Random;



public class Driver {
  /**
   * @param args no reference.
   */
  public static void main(String[] args) {
    ArrayList<ParkingStructure> strList = new ArrayList<ParkingStructure>();
    Random ran = new Random();
    int type;
    int numStr = 8;
    int num;
    boolean available;

    for (int i = 0; i < numStr; i++) {
      ParkingStructure parkingStr = new ParkingStructure(new Geoloc(i, 1));

      for (int j = 0; j < 100; j++) {
        type = ran.nextInt(8) + 10;
        num = ran.nextInt();
        if (num % 2 == 1) {
          available = true;
        } else {
          available = false;
        }

        ParkingSpot ps = new ParkingSpot(j, type % 4, available);
        parkingStr.addtoSpotArr(ps);
      }
      
      strList.add(parkingStr);
    }

    for (int i = 0; i < numStr; i++) {

      System.out.print(
          "Parking " + i + " has " + strList.get(i).getNumavailable() + " spots available, ");
      System.out.print("and " + strList.get(i).getNumoccupied() + " spots occupied");
      System.out.println();
    }
  }

}

