//Aman Toor 219323724//

package javascript;

import java.util.Scanner;

public class Quesion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in);
		
		//variable storage holder//
		String N1, N2, N3, N4;
		int L1, L2, L3, L4;
		int B1, B2, B3, B4;
		int T1, T2, T3, T4;
		
		
		//Print lines and ASCII//
		System.out.println("Let's do some printing :) \n");
		System.out.println("  * \n *** \n***** \n ***\n  * \n");
		
		System.out.println("////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("                          Enter info");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////");
		
		//take user input//
		System.out.println("\nEnter students names:");
		N1 = Input.next();
		N2 = Input.next();
		N3 = Input.next();
		N4 = Input.next();
		
		System.out.println("\nEnter students Lab Marks:");
		L1 = Input.nextInt();
		L2 = Input.nextInt();
		L3 = Input.nextInt();
		L4 = Input.nextInt();
		
		System.out.println("\nEnter students bonus Marks:");
		B1 = Input.nextInt();
		B2 = Input.nextInt();
		B3 = Input.nextInt();
		B4 = Input.nextInt();
		//calculations//
		T1 = L1+B1;
		T2 = L2+B2;
		T3 = L3+B3;
		T4 = L4+B4;
		// ASCII//
		System.out.println("////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("                          Student Info");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////////////////////");
		System.out.println("\nName \t\t Lab \t\t Bonus \t\t Total");
		System.out.println("---- \t\t --- \t\t ---- \t\t -----");
		//output information//
		System.out.println(N1 + " \t\t " +L1 + " \t\t " + B1 +" \t\t "+ T1);
		System.out.println(N2 + " \t\t " +L2 + " \t\t " + B2 +" \t\t "+ T2);
		System.out.println(N3 + " \t\t " +L3 + " \t\t " + B3 +" \t\t "+ T3);
		System.out.println(N4 + " \t\t " +L4 + " \t\t " + B4 +" \t\t "+ T4);
		System.out.println("\n   *   \n  * *  \n *   * \n*     *\n *   * \n  * *  \n   *   ");
		System.out.println("\n \\ 'Enjoy the term!' \\\\\\\\\\");
	}

}
