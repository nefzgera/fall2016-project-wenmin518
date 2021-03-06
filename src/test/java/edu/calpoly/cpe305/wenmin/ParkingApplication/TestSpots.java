package test.java.edu.calpoly.cpe305.wenmin.ParkingApplication;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.edu.calpoly.cpe305.wenmin.ParkingApplication.Geoloc;
import main.java.edu.calpoly.cpe305.wenmin.ParkingApplication.ParkingSpot;

public class TestSpots {

  @Test
  public void parkingSpotTest1() {
    ParkingSpot ps = new ParkingSpot(9, 3, true);
    assertTrue(ps.getNum() == 9);
    assertEquals(ps.getType(), 3);
    assertEquals(ps.isAvailable(), true);
  }

  @Test
  public void parkingSpotTest2() {
    ParkingSpot ps = new ParkingSpot(3, 3, false);
    assertTrue(ps.getNum() == 3);
    assertEquals(ps.getType(), 3);
    assertEquals(ps.isAvailable(), false);
  }

  @Test
  public void parkingSpotTest3() {
    ParkingSpot ps = new ParkingSpot(20, 3, true);
    assertFalse(ps.getNum() == 10);
    assertEquals(ps.getType(), 3);
    assertEquals(ps.isAvailable(), true);
  }

}
