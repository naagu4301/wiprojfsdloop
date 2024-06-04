package wipro.com.java;
import java.util.Scanner;

public class colorcode {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char c1=sc.next().charAt(0);
		switch(Character.toLowerCase(c1)){
		case 'r':System.out.println("R->Red");break;
		case 'b':System.out.println("B->Blue");break;
		case 'g':System.out.println("G->Green");break;
		case 'o':System.out.println("O->Orange");break;
		case 'y':System.out.println("Y->Yellow");break;
		case 'w':System.out.println("W->White");break;
		default:
			System.out.println("Invalid Code");
			
	}
	}
}
