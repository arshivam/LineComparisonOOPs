package com.bridgelabz.linecomparisonoops;
import java.util.*;

class LineComparisonUC4 {
	Scanner sc = new Scanner(System.in);
	static int x1,x2,x3,x4,y1,y2,y3,y4;
	public static Double length1, length2;

	public void line1() {
		System.out.println("Enter the Co-ordinates of x1 and y1 : ");
		x1 = sc.nextInt();
		y1 = sc.nextInt();

		System.out.println("Enter the Co-ordinates of x2 and y2 : ");
		x2 = sc.nextInt();
		y2 = sc.nextInt();

		length1 = Math.sqrt((x2 - x1)^2  +  (y2 - y1)^2);
		System.out.println("Length of the given Line1 is : " + length1 + " units" );
	}
	public void line2() {
		System.out.println("Enter the Co-ordinates of x3 and y3 : ");
		x3 = sc.nextInt();
		y3 = sc.nextInt();

		System.out.println("Enter the Co-ordinates of x4 and y4 : ");
		x4 = sc.nextInt();
		y4 = sc.nextInt();

		length2 = Math.sqrt((x4 - x3)^2  +  (y4 - y3)^2);
		System.out.println("Length of the given Line2 is : " + length2 + " units" );
	}
	public void compare () {
		if(length1.compareTo(length2) == 1)
			System.out.println("Length of Line 1 is greater than Line 2 ");
		else if (length1.compareTo(length2) == -1)
			System.out.println("Length of Line 1 is less than Line 2 ");
		else
			System.out.println("Both lines are equal in length");
	}
}
public class LineComaprison {
	public static void main(String[] args) {
		LineComparisonUC4 a = new LineComparisonUC4();
		a.line1();
		a.line2();
		a.compare();
	}
}
