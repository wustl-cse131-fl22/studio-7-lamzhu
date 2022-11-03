package studio7;
import edu.princeton.cs.introcs.StdDraw;

public class Rectangle1 {
		private int length;
		private int width;
		
		public Rectangle1 (int theLength, int theWidth) {
			length = theLength;
			width =theWidth;
		}

		
		public int getLength() {
			return length;
		}

		public void setLength(int length) {
			this.length = length;
		}

		public int getWidth() {
			return width;
		}

		public void setWidth(int width) {
			this.width = width;
		}

		public void main(String[] args) {
			// TODO Auto-generated method stub
			area(getLength(),getWidth());
			perimeter(getLength(),getWidth());
			
			StdDraw.setPenColor(0,0,0);
			StdDraw.rectangle(0.5,0.5,getLength(),getWidth());
		}
		
		public int area(int length, int width) {
			return length*width;
		}
		
		public int perimeter(int length, int width) {
			return 2*length+2*width;
		}
	}
		

	

