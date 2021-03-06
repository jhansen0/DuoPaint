package com.wilsongateway.DuoPaint;

import java.util.ArrayList;

public class Stroke {
	
	private static ArrayList<Stroke> allStrokes = new ArrayList<Stroke>();
	
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	public Stroke(int x1, int x2, int y1, int y2){
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		
		allStrokes.add(this);
	}
	
	public ArrayList<Stroke> getStrokes(){
		return allStrokes;
	}
}
