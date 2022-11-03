package studio7;

import edu.princeton.cs.introcs.StdDraw;

public class Rectangle {
	private double length;
	private double width;
	
	public Rectangle (double theLength, double theWidth) {
		length = theLength;
		width =theWidth;
	}

	
	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(1,1) ; 
		Rectangle r2 = new Rectangle(2,2) ; 
		StdDraw.setPenColor(0,200,0);
		StdDraw.rectangle(0.5,0.5,(.5)* r1.getLength(),(.5)*r1.getWidth());
		
	}
	
	public int area(int length, int width) {
		return length*width;
	}
	
	public int perimeter(int length, int width) {
		return 2*length+2*width;
	}
}
	

