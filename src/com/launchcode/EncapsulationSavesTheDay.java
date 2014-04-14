package com.launchcode;

import java.lang.*;

/**
 *
 * Okay, the unimaginable happenned.....
 *
 * We have to now use our Rectangle class for TVs ...
 * ... and guess what... they want to store the rectangle by
 * diagonal.
 *
 * Good thing we used proper encapsulation.  Our width and height
 * are private, other classes can only access those by
 * getWidth() and getHeight().  That means we can change
 * how width and height is computed without anyone
 * noticing (aka breaking).
 *
 *
 */

public class EncapsulationSavesTheDay {

	public static void main(String[] varargs) {
		Rectangle myShape = new Rectangle(32);
        System.out.println(String.format("Super sale on TV's %d by %d", myShape.getWidth(), myShape.getHeight()));
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