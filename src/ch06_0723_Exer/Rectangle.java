package ch06_0723_Exer;

import java.sql.ResultSet;

public class Rectangle {
	
	double width; // 더 큰 범위로 설정
	double height;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public Rectangle(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}


	public void recRound () {
		System.out.println((width + height) * 2);
	}
}
