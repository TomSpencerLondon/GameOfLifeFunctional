package com.codurance;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class GameShould {

  @Test
  void return_game_state_for_start() {
    Game game = new Game();
    game = game.nextGeneration();
    assertThat(game.state()).isEqualTo(new Game());
  }
}
