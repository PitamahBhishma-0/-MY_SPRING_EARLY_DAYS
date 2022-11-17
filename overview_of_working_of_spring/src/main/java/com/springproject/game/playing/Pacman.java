package com.springproject.game.playing;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pacman implements Gaming_Console {
	@Override
	public void up() {
		System.out.println("Jump_Pacman");

	}
	@Override
	public void down() {
		System.out.println("go to hole_pacman");

	}
	@Override
	public void left() {
		System.out.println("attack_pacman");

	}
	@Override
	public void right() {
		System.out.println("go faster_pacman");

	}
}
