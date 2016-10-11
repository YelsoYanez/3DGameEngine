package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {
	
	public Game(){
		
	}
	
	public void input(){
		if(Input.getKey(Keyboard.KEY_UP))
			System.out.println("we ' just pressed up!");
		if(Input.getKey(Keyboard.KEY_UP))
			System.out.println("we've just released up!");
		
		if(Input.getMouseDown(1))
			System.out.println("we ' right clicked at" + Input.getMousePosition().toString());
		if(Input.getMouseUp(1))
			System.out.println("we've just released right mouse button!");
	}
	
	public void update(){
		
	}
	
	public void render(){
		
	}

}
