package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import wenmin.Geoloc;

public class TestGeoloc {

  @Test
  public void GeolocTest1() {
    Geoloc loc = new Geoloc(10, 10);
    assertTrue(loc.equals(new Geoloc(10, 10)));
  }

  @Test
  public void GeolocTest2() {
    Geoloc loc = new Geoloc(0, -1);
    assertEquals(loc.getxloc(), 0);
    assertEquals(loc.getyloc(), -1);
  }

  @Test
  public void GeolocTest3() {
    Geoloc loc = new Geoloc(5, 5);
    assertFalse(loc.equals(new Geoloc(4, 4)));
  }
}
