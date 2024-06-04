package wipro.com.java;
import java.util.Scanner;

public class reverse {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int r,sum=0;
		while(s>0) {
			r=s%10;
			sum=sum*10+r;
			s=s/10;
		}
		System.out.println(sum);
	}
}
