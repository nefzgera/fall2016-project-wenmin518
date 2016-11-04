package main.java.edu.calpoly.cpe305.wenmin.ParkingApplication;


public class User implements Subject {

  private Geoloc position;
  private int carType;

  public User(Geoloc position, int carType) {
    this.position = position;
    this.carType = carType;
  }

  public Geoloc getPosition() {
    return position;
  }

  public int getCarType() {
    return carType;
  }

  public void notifyObs(Geoloc loc) {
    // TODO Auto-generated method stub
    System.out.println("Update");
  }
  
  public void setPosition(Geoloc loc) {
    position = loc;
  }
  
  public void setcarType(int type) {
    carType = type;
  }
}
