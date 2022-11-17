package com.springproject.game.playing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
	  @Autowired
      private Gaming_Console game;
	  
    //  public GameRunner(Gaming_Console game) {
    //	  this.game=game;
    //  }
      
      public void setGame(Gaming_Console game) {
		this.game = game;
	}

	public void runGame() {
    	  game.up();
    	  game.down();
    	  game.left();
    	  game.right();
      }
}
