package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {
	
	//putting to use the mesh class
	private Mesh mesh;
	
	public Game(){
		
		mesh = new Mesh();
		
		//creating a triangle for this example
		Vertex[] data = new Vertex[]{new Vertex(new Vector3f(-1,-1,0)),
									 new Vertex(new Vector3f(0,1,0)),
									 new Vertex(new Vector3f(1,-1,0)),};
		
		//adding data the mesh
		mesh.addVertices(data);
		
		
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
		mesh.draw();
	}

}
