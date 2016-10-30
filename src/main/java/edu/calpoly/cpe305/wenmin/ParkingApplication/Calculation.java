package edu.calpoly.cpe305.wenmin.ParkingApplication;

import java.util.ArrayList;

public class Calculation implements Observer {

  public int[][] adj;
  public boolean[] visited;
  public Geoloc userLoc;
  public int row;
  public int col;
  public int numVertices;
  public ArrayList<Geoloc> parkingLoc;

  /**
   * Constructor.
   * 
   * @param adj the 2d array corresponding to the grid
   * @param visited used for whether each grid is been visited
   * @param userLoc user location is used to calculated the nearest partking structure
   * @param row
   * @param col
   * @param numVertices
   * @param parkingloc
   */
  public Calculation(int[][] adj, boolean[] visited, Geoloc userLoc, int row, int col,
      int numVertices, ArrayList<Geoloc> parkingloc) {
    this.adj = adj;
    this.visited = visited;
    this.userLoc = userLoc;
    this.row = row;
    this.col = col;
    this.numVertices = numVertices;
    this.parkingLoc = parkingLoc;
  }

  public int locToint(Geoloc loc) {
    return loc.getX() + loc.getY() * col;
  }

  public void updateUserPos(Geoloc pos) {
    // TODO Auto-generated method stub
    userLoc = pos;
  }

  public void addEdge(Geoloc loc1, Geoloc loc2) {
    int loc1Num = locToint(loc1);
    int loc2Num = locToint(loc2);
    adj[loc1Num][loc2Num] = 1;
    adj[loc2Num][loc1Num] = 1;
  }

  public void visit(int ver) {
    visited[ver] = true;
    for (int idx = 0; idx < numVertices; idx++) {
      if (adj[ver][idx] != 0 && visited[idx] == false) {
        visit(idx);
      }
    }
  }


  /**
   * @param start referring to the User location.
   * @param stop Parking location
   * @return number of steps from start to stop
   */
  public int fewestEdgePath(int start, int stop) {
    int[] path = new int[numVertices];

    for (int i = 0; i < numVertices; i++) {
      visited[i] = false;
    }

    LinkedList queue = new LinkedList();
    queue.addLast(start);
    visited[start] = true;
    int p = start;
    while (queue.isEmpty() == false) {
      p = (Integer) queue.removeLast();
      for (int i = 0; i < numVertices; i++) {
        if (adj[p][i] == 1 && visited[i] == false) {
          queue.addFirst(i);
          visited[i] = true;
          path[i] = path[p] + 1;
        }
      }
    }
    return path[stop];
  }

}
