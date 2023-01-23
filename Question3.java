//Aman Toor 219323724

package javascript;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Input = new Scanner(System.in);
		
		//variable storage//
		int r;
		double A, V;
		//input/ outputs//
		System.out.print("enter the radious of the sphere: ");
		r = Input.nextInt();
		//calculation//
		//Area formula of sphere//
		A = 4*(Math.PI * (Math.pow(r, 2)));
		//volume formula for sphere//
		V = (4*(Math.PI * (Math.pow(r, 3)))/3);
		//Decimal formating//
		DecimalFormat fmt = new DecimalFormat("0.##");
		//output//
		System.out.println("The Area of the sphere is: "+fmt.format(A));
		System.out.println("The Volume of the sphere is: "+fmt.format(V));
		
	}

}
