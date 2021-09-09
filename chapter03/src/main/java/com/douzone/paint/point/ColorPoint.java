package com.douzone.paint.point;

import java.util.*;

public class ColorPoint extends Point {

	private String color;

	public ColorPoint(int x, int y, String color) {
		super(x,y);
		//setX(x);
		//setY(y);
		
		List l = new ArrayList();
		
		this.color = color;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void show() {
		
		System.out.println("점[x=" + getX() + " , y= " + getY() + ", color= "+ color + "]을 그렸습니다.");
	}
	
	
	
}
