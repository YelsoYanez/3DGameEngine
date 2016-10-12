package com.base.engine;

import static org.lwjgl.opengl.GL20.*;
import static org.lwjgl.opengl.GL32.*;

public class Shader {
	
	//storing shader using pointer ()
	private int program;
	
	public Shader(){
		program = glCreateProgram();
		
		if(program == 0){
			
			System.err.println("Shader creation faild: could not find valid memory location in constructor");
			System.exit(1);
		}
		
	}
	
	public void bind(){
		glUseProgram(program);
	}
	
	//adding code to shader
	public void addVertexShader(String text){
		addProgram(text, GL_VERTEX_SHADER);
	}
	
	public void addGeometryShader(String text){
		addProgram(text, GL_GEOMETRY_SHADER);
	}
	public void addFrameShader(String text){
		addProgram(text, GL_FRAGMENT_SHADER);
	}
	
	public void compileShader(){
		glLinkProgram(program);
		
		if(glGetShaderi(program, GL_LINK_STATUS) == 0){
			System.err.println(glGetShaderInfoLog(program, 1024));
			System.exit(1);
		}
		
		//the problem with the code was the word glGetShader, it needs to be change to glGetShaderi
		glValidateProgram(program);
		if(glGetShaderi(program, GL_VALIDATE_STATUS) == 0){
			System.err.println(glGetShaderInfoLog(program, 1024));
			System.exit(1);
		}
	}
	
	private void addProgram(String text, int type){
		//implementing code
		int shader = glCreateShader(type);
		
		if(shader == 0){
			System.err.println("Shader creation faild: could not find valid memory location in constructor");
			System.exit(1);
		}
		glShaderSource(shader, text);
		glCompileShader(shader);
		
		//testing if compile correctly
		if(glGetShaderi(shader, GL_COMPILE_STATUS) == 0){
			System.err.println(glGetShaderInfoLog(shader, 1024));
			System.exit(1);
		}
		
		//attaching this code to our program
		glAttachShader(shader, program);
	}
	
}
