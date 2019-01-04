package com;

public class Rectangle extends Shape implements Resize {

	public Rectangle() {

	}

	public Rectangle(int width, int height, String color) {
		super(width, height, color);
	}

	@Override
	public double getArea() {
		double d =(getWidth() * getHeight());
		return d;
	}

	@Override
	public void setResize(int size) {
		this.setWidth(getWidth()+size);
	}
	
	

}
