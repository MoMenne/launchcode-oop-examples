import java.io.*;
import java.lang.*;

public class EncapsulationOops {

	public static void main(String[] varargs) {
		Rectangle myShape = new Rectangle(5);
		System.out.println(String.format("Width %d, Height %d, Size %d, Perimeter %d", myShape.getWidth(), myShape.getHeight(), myShape.getSize(), myShape.getPerimeter()));
	}

	
	private static class Rectangle {
		private int diagonal;
		
		public Rectangle (int diagonal) {
			this.diagonal = diagonal;
		}
		
		public int getWidth() {
			return (int)(this.diagonal / 5.0) * 4;
		}
		
		public int getHeight() {
			return (int)((this.diagonal / 5.0) * 3);
		}
		
		public int getSize() {
			return this.getWidth() * this.getHeight();
		}	
		
		public int getPerimeter() {
			return this.getWidth() * 2 + this.getHeight() * 2;
		}
	}
	
}