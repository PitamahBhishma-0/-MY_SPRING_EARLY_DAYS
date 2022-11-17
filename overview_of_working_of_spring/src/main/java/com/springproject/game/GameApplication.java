package com.springproject.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springproject.game.playing.GameRunner;
import com.springproject.game.playing.Gaming_Console;
import com.springproject.game.playing.Mario;
import com.springproject.game.playing.SuperContra;

@SpringBootApplication
@ComponentScan({"package com.springproject.game","null"})
public class GameApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GameApplication.class, args);
		GameRunner runner = context.getBean(GameRunner.class);
		//Mario gameMario=new Mario();
		//SuperContra contra=new SuperContra();
		//Gaming_Console mario =new Mario();
		//GameRunner runner=new GameRunner(mario);
		//Gaming_Console contra =new SuperContra();
		//GameRunner runner0=new GameRunner(contra);
		runner.runGame();
		System.out.println("--------------------------------");
		//runner0.runGame();
	}

}
