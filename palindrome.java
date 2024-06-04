package wipro.com.java;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int s=0,r;
		int b=n;
		while(n>0) {
			r=n%10;
			s=s*10+r;
			n=n/10;
		}
		if(s==b) {
			System.out.println(b+" is a palindrome");
		}
		else {
			System.out.println(b+" is not a palindrome");
		}
	}
}
