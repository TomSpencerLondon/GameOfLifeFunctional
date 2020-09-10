package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GameShould {

  @Test
  void remain_empty_if_it_starts_empty() {
    Game game = new Game();
    Game nextGeneration = game.nextGeneration();
    assertThat(nextGeneration).isEqualTo(new Game());
  }

  @Test
  void become_empty_if_it_starts_with_one_cell() {
    Game game = new Game(new Cell(0, 0));
    Game nextGeneration = game.nextGeneration();
    assertThat(nextGeneration).isEqualTo(new Game());
  }
}
