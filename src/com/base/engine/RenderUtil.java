package com.base.engine;

import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL30.*;

public class RenderUtil {
	
	public static void clearScreen(){
		//todo stencil buffer
		glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
	}
	
	public static void initGraphics(){
		//changing the numbers in glClearColor give different color effect 
		glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
		
		glFrontFace(GL_CW);
		glCullFace(GL_BACK);
		glEnable(GL_CULL_FACE);
		glEnable(GL_DEPTH_TEST);
		
		//Depth clamp for later
		
		glEnable(GL_FRAMEBUFFER_SRGB);
	}
	
	//shaders
	public static String getOpenGLVersion(){
		return glGetString(GL_VERSION);
	}
}
