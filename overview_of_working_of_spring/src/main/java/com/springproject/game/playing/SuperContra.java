package com.springproject.game.playing;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class SuperContra implements Gaming_Console {
	public void up() {
		System.out.println("UP");

	}
	public void down() {
		System.out.println("down");

	}
	public void left() {
		System.out.println("left");

	}
	public void right() {
		System.out.println("right");

	}
}
