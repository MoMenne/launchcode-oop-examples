package com.launchcode;

import java.lang.*;

public class Encapsulation {

	public static void main(String[] varargs) {
		Rectangle myShape = new Rectangle(10, 15);
		System.out.println(String.format("Width %d, Height %d, Size %d, Perimeter %d", myShape.getWidth(), myShape.getHeight(), myShape.getSize(), myShape.getPerimeter()));
	}

	
	private static class Rectangle {
		private int width;
		private int height;
		
		public Rectangle (int width, int height) {
			this.width = width;
			this.height = height;
		}
		
		public int getWidth() {
			return this.width;
		}
		
		public int getHeight() {
			return this.height;
		}
		
		public int getSize() {
			return this.height * this.width;
		}	
		
		public int getPerimeter() {
			return this.height * 2 + this.width * 2;
		}
	}
	
}