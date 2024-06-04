package wipro.com.java;
import java.util.*;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		boolean isPrime=true;
		if(s1<2) {
			isPrime=false;
		}
		else {
			for(int i=2;i<=Math.sqrt(s1);i++) {
				if(s1%i==0) {
					isPrime=false;
					break;
				}
			}
		}
		if(isPrime) {
			System.out.println(s1+"is a prime number.");
		}
		else {
			System.out.println(s1+"is not a prime number.");
		}
		sc.close();
	
}
}
