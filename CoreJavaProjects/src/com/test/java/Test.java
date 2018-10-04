package com.test.java;

import java.util.Comparator;
//1 import com.test.exercise.FactorialTest1;
//2 import static com.test.exercise.FactorialTest1.getFactorialValue;
import java.util.Iterator;
import java.util.TreeSet;

import com.test.java.Nav.Direction;

/*abstract class Shape {
	private int x;
	private int y;

	public abstract void draw();

	public void setAnchor(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Circle extends Shape {
	private int radius;
    public void draw();	
}*/

class Nav {
	public enum Direction {
		NORTH,SOUTH
	}
}

public class Test {

	public static void main(String[] args) {

		String str = "deabcdefde";
		Direction d = Direction.NORTH;
		Nav.Direction d1 = Direction.NORTH;

		// 1 System.out.println(FactorialTest1.getFactorialValue(5));
		// 2 System.out.println(getFactorialValue(5));
		// System.out.println(com.test.exercise.FactorialTest1.getFactorialValue(5));

		// System.out.println(replaceString(str, "de", "xy"));
	}

	public static String replaceString(String input, String source, String dest) {

		int sourceIndex = input.indexOf(source);
		String firstString = input.substring(0, sourceIndex);
		String lastString = input.substring(sourceIndex + source.length());

		System.out.println(sourceIndex);
		System.out.println(input.substring(0, sourceIndex));
		System.out.println(input.substring(sourceIndex + source.length()));

		String output = firstString + dest + lastString;

		if (output.contains(source)) {
			output = replaceString(output, source, dest);
		}

		return output;
	}
}

/*
 * class compareEmployee implements Comparator {
 * 
 * @Override public int compare(Object o1, Object o2) { Employee e1 = (Employee)
 * o1; Employee e2 = (Employee) o2;
 * 
 * if(e1.id == e2.id) return 0; else if(e1.id < e2.id) return -1; else return 1;
 * }
 */
