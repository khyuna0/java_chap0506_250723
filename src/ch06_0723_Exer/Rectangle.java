package ch06_0723_Exer;

public class Rectangle {
	
	int iWeight;
	int iHeight;
	double dWeight;
	double dHeight;
	
	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int iWeight, int iHeight) {
		super();
		this.iWeight = 2*iWeight;
		this.iHeight = 2*iHeight;
	}

	public Rectangle(double dWeight, double dHeight) {
		super();
		this.dWeight = 2*dWeight;
		this.dHeight = 2*dHeight;
	}

}
