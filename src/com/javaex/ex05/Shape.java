package com.javaex.ex05;

public abstract class Shape {
	
	//추상클래스
	
	//필드
	
	private int countSides; //변의 수


	//생성자
	public Shape() {}

	public Shape(int countSides) {
		this.countSides = countSides;
	}

	//메소드 g/s
	
	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
	
	//일반메소드
	
	public abstract double getArea(); //넓이
	
	public abstract double getPerimeter(); //둘레 길이
	
	

}
