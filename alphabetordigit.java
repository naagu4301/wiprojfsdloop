package wipro.com.java;
import java.util.Scanner;

public class alphabetordigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        Scanner scanner = new Scanner(System.in);
	                System.out.print("Enter a character: ");
	                char ch = scanner.next().charAt(0);
	        if (Character.isLetter(ch)) {
	            System.out.println("Alphabet");
	        }
	        else if (Character.isDigit(ch)) {
	            System.out.println("Digit");
	        }
	         
	 else {
	            System.out.println("Special Character");
	        }
	    }
	}
