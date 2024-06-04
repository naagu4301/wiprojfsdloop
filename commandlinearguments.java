package wipro.com.java;
import java.util.Scanner;

public class commandlinearguments {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		int len1 = str1.length();
		int len2 = str2.length();
		if(len1==0&&len2==0)
		{
			System.out.println("no values");
		}
		else
		{
			System.out.println(str1+","+str2);
		}
		
	}
}
