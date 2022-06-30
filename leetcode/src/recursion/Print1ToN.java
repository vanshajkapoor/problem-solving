package recursion;

import java.util.Scanner;

public class Print1ToN {
	
	public static void print(int n) {
		if(n==0) return;
		
		print(n-1);
		System.out.println(n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		print(n);

	}

}
