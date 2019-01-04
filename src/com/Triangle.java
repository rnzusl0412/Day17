package com;

public class Triangle extends Shape implements Resize {

	public Triangle(){
		super();
	}
	
	public Triangle(int width, int height, String color) {
		super(width, height, color);
	}
	
	@Override
	public double getArea() {
		
		double d = (getWidth() * getHeight()) / 2f;
		return d;
	}

	@Override
	public void setResize(int size) {
		this.setHeight(getHeight()+size);
	}
	
	

}
