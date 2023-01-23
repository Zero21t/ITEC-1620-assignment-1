//Aman Toor 219323724//

package javascript;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		//integer/double storage location
		int x1;
		int y1;
		int x2;
		int y2;
		double a;
		double b;
		int xA, yA;
		double aP;
		double bP;
		double Fx, Fy;
		
		//gather coordinates for point 1 and 2 
		System.out.print("Enter the x coordinates of point 1: ");
		x1 = input.nextInt(); //user input//
		System.out.print("Enter the y coordinates of point 1: ");
		y1 = input.nextInt(); //user input//
		System.out.print("Enter the x coordinates of point 2: ");
		x2 = input.nextInt(); //user input//
		System.out.print("Enter the y coordinates of point 2: ");
		y2 = input.nextInt(); //user input//
		
		//calculation//
		//first calculate slope (a) using a = (y2 - y1)/(x2 - x1)
		a = (y2 - y1)/(x2 - x1);
		//second calculate slope-intercept (b) using b = y2 - a*x2
		b = y2 - a*x2;
		int aa = (int)Math.round(a);
		int bb = (int)Math.round(b);

		//output calculation//
		System.out.println("\n"+"The slope of the line is: " + a);
		System.out.println("The slope intercept of the line is: " + b);
		System.out.println("\n"+"The line equation is: y = " +a + "x + " + b+"!!");
		System.out.println("\n here is the line equation with integer format: Y = " + aa +"x + " + bb+"!! \n");
		
		//Gather coordinates of Point A//
		System.out.print("Enter the x coordinates of point A: ");
		xA = input.nextInt(); //user input//
		System.out.print("Enter the y coordinates of point A: ");
		yA = input.nextInt(); //user input//
		
		//calculation//
		//perpendicular calculation
		aP = -1/a;
		//intercept of perpendicular calculation
		bP = yA - (aP*xA);
		//find x and y of intersection point of original line and perpendicular//
		Fx = (bP - b)/(a - aP);
		Fy = (a*Fx) +b;
		//Distance from A to line//
		double P1 = (xA - Fx);
		double P2 = Math.pow(P1, 2);
		double P3 = (yA - Fy);
		double P4 = Math.pow(P3, 2);
		double P5 = P2 +P4;
		double D = Math.sqrt(P5);
		
		//output//
		System.out.print("\n"+ "the slope of the perpendicular line is: " + aP);
		System.out.print("\n"+"the slope intercept of th eperpendicular line is: " +bP);
		System.out.print("\n\n"+ "the coordinates of the intersection point are x = "+Fx + " and y = "+ Fy );
		System.out.print("The distnace from point A to the line is: " + D);
	}

}
