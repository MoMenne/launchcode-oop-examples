package com.launchcode.encapsulation;

import java.lang.*;

public class NoEncapsulation {

	public static void main(String[] varargs) {
		Rectangle myShape = new Rectangle(10, 15);
		System.out.println(String.format("Super sale on TV's %d by %d", myShape.width, myShape.height));
		System.out.println(String.format("Width %d, Height %d, Size %d, Perimeter %d", myShape.width, myShape.height, myShape.getSize(), myShape.getPerimeter()));
	}

	
	private static class Rectangle {
		public int width;
		public int height;
		
		public Rectangle (int width, int height) {
			this.width = width;
			this.height = height;
		}
		public int getSize() {
			return this.height * this.width;
		}	
		
		public int getPerimeter() {
			return this.height * 2 + this.width * 2;
		}
	}
	
}