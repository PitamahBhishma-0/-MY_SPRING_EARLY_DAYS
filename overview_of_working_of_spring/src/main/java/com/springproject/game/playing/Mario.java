package com.springproject.game.playing;

import org.springframework.stereotype.Component;

@Component
public class Mario implements Gaming_Console {
	@Override
	public void up() {
		System.out.println("Jump");

	}
	@Override
	public void down() {
		System.out.println("go to hole");

	}
	@Override
	public void left() {
		System.out.println("attack");

	}
	@Override
	public void right() {
		System.out.println("go faster");

	}
}
