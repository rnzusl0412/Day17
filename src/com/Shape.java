package com;

public abstract class Shape {
	private int width;
	private int height;
	private String color;

	public Shape() {
		this(0, 0, "color");
	}

	public Shape(int width, int height, String color) {
		super();
		
		this.width = width;
		this.height = height;
		this.color = color;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double getArea();
}
