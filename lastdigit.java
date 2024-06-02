package wipro.com.java;
import java.util.Scanner;

public class lastdigit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		if(s1%10==s2%10) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

}

}
