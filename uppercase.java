package wipro.com.java;
import java.util.Scanner;

public class uppercase {
	 public static void main(String[] args) {
         System.out.print("i/p:");
        Scanner sc=new Scanner(System.in);
        char character= sc.next().charAt(0);
        char convertedCharacter;
        if (Character.isLowerCase(character)) {
            convertedCharacter = Character.toUpperCase(character);
        } else {
            convertedCharacter = Character.toLowerCase(character);
        }
        System.out.println("o/p:" + character + "->" + convertedCharacter);
    }

}
