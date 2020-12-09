package com.javaex.ex05;

public class Rectangle extends Shape implements Resizeable {
	
	//필드
	private double width;
	private double height;
	
	
	//생성자
	public Rectangle() {
		super();
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//메소드 g/s

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	//일반메소드
	
	public double getArea() {
		return width*height;
	}
	
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	public void resize(double s) {
		width = width*s;
		height = height*s;
	}
	
	
	

	
	
}
