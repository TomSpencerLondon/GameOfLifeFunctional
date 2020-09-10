package com.codurance;

import static org.apache.commons.lang.builder.EqualsBuilder.reflectionEquals;
import static org.apache.commons.lang.builder.HashCodeBuilder.reflectionHashCode;

import java.util.ArrayList;
import java.util.List;

public class Game {

  List<Cell> cells = new ArrayList<>();

  public Game() {
  }

  public Game(Cell cell) {
    cells.add(cell);
  }

  public Game nextGeneration() {
    return new Game();
  }

  @Override
  public String toString() {
    return "Cells: " + cells.toString();
  }

  @Override
  public boolean equals(Object other) {
    return reflectionEquals(this, other);
  }

  @Override
  public int hashCode() {
    return reflectionHashCode(this);
  }
}
