package wipro.com.java;
import java.util.Scanner;

public class pnz {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		if(s1>0) {
			System.out.println("Positive");
		}
		if(s1==0) {
			System.out.println("Zero");
		}
		if(s1<0) {
			System.out.println("Negative");
		}
	}

}

