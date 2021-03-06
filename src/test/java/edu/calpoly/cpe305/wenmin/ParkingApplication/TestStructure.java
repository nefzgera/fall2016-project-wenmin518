package test.java.edu.calpoly.cpe305.wenmin.ParkingApplication;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.edu.calpoly.cpe305.wenmin.ParkingApplication.Geoloc;
import main.java.edu.calpoly.cpe305.wenmin.ParkingApplication.ParkingSpot;
import main.java.edu.calpoly.cpe305.wenmin.ParkingApplication.ParkingStructure;

import java.util.ArrayList;

public class TestStructure {

  @Test
  public void structureTest1() {
    ParkingSpot ps1 = new ParkingSpot(10, 3, true);
    ParkingSpot ps2 = new ParkingSpot(5, 1, false);
    ParkingStructure ps = new ParkingStructure(new Geoloc(4, 4));
    ps.addtoSpotArr(ps1);
    ps.addtoSpotArr(ps2);
    assertEquals(ps.getPosition().getX(), 4);
    assertEquals(ps.getPosition().getY(), 4);
    assertEquals(ps.getNumavailable(), 1);
    assertEquals(ps.getNumoccupied(), 1);
    assertEquals(ps.getspotArr().get(1).getType(), 1);
    assertEquals(ps.getspotArr().get(1).isAvailable(), false);
  }

  @Test
  public void structureTest2() {
    ParkingSpot ps1 = new ParkingSpot(10, 2, false);
    ParkingStructure ps = new ParkingStructure(new Geoloc(3, 3));
    ps.addtoSpotArr(ps1);
    assertEquals(ps.getNumavailable(), 0);
    assertEquals(ps.getNumoccupied(), 1);
    assertEquals(ps.getspotArr().get(0).getType(), 2);
    assertEquals(ps.getspotArr().get(0).isAvailable(), false);
  }
}
