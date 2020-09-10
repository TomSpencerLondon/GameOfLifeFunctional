package com.codurance;

public class Cell {

  private final int x;
  private final int y;

  public Cell(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString() {
    return "X: " + x + ", Y: " + y;
  }
}
