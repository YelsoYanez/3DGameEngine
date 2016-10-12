package com.base.engine;

import java.io.BufferedReader;
import java.io.FileReader;

public class ResourceLoader {
	
	public static String loadShader(String fileName){
		
		//load the file
		StringBuilder shaderSource = new StringBuilder();
		BufferedReader shaderReader = null;
		
		try{
			shaderReader = new BufferedReader(new FileReader("./res/shader/" + fileName));
			//adding string for every single line
			String line;
			while((line = shaderReader.readLine()) !=null){
				
				shaderSource.append(line).append("\n");
			} 
			
			shaderReader.close();
			
		} catch(Exception e){
			e.printStackTrace();
			System.exit(1);
		}
		
		return shaderSource.toString();
	}
}
