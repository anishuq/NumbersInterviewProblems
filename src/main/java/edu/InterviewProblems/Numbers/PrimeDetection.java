package edu.InterviewProblems.Numbers;

import java.util.Scanner;

public class PrimeDetection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number for Prime check");
		
		int input = Integer.parseInt(scanner.nextLine());
		System.out.println(isPrime(input));
	}

	/**
	 * https://practice.geeksforgeeks.org/tracks/DSASP-Mathematics/?batchId=154
	 * @param n
	 * @return
	 * Complexity: Big-Oh(Math.sqrt(n))
	 */
	public static boolean isPrime(int n) {
		int upperLimit = (int) Math.ceil(Math.sqrt(n));
		for(int i = 2; i <= upperLimit; i++) {
			if(n % i == 0) return false; 
		}
			
		return true;
	}
}
