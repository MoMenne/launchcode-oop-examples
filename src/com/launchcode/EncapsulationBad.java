package com.launchcode;

import java.lang.*;


/**
 *  When objects do not employ encapsulation, other objects are able to
 *  access whatever they like within the object.
 *
 *  These "public" fields can create coupling between classes,
 *      which makes can make it very difficult to modify in the future.
 *
 *  For example, this class below has a "public" width and height.
 *      If in the future you decided to change the way you store
*       the size of the square to diagonal, all of the
 *      referencing classes would have to change as well
 */

public class EncapsulationBad {

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