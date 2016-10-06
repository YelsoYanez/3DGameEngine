package com.base.engine;

public class Time {
	
	//show how long the seconds
	public static final long SECOND = 1000000000L;
	
	private static double delta;
	
	
	public static long getTime(){
		return System.nanoTime();
	}
	
	//get time that passes with in frames
	public static double getDelta(){
		return delta;
	}
	
	public static void setDelta(Double Delta){
		Time.delta = delta;
	}
}
