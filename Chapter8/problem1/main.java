/**
Jacob Haig
Chapter 8 
problem 1 (pg490 problem2)
 */

package problem1;

import java.util.Scanner;

public class main {

	final static int LENGTH = 7;
	static int[] employeeid = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489 };
	static double[] hours = new double[LENGTH];
	static double[] payRate = new double[LENGTH];
	static double[] wage = new double[LENGTH];

	static Scanner kb = new Scanner(System.in);

	public static void main(String[] args) {
		init();
		print();
	}

	public static void print() {
		System.out.println();
		for (int i = 0; i < LENGTH; i++)
			System.out.println("Employee " + employeeid[i] + " worked " + hours[i] + " hours and earned " + wage[i]);
		System.out.println();
	}

	public static void init() {
		for (int i = 0; i < LENGTH; i++) {
			System.out.print("How many hours did employee " + employeeid[i] + " work: ");
			hours[i] = kb.nextDouble();
			System.out.print("How much did employee " + employeeid[i] + " work: ");
			payRate[i] = kb.nextDouble();
			wage[i] = hours[i] * payRate[i];
			// System.out.println("$" + wage[i]);
		}
	}

}