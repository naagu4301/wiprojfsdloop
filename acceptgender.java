package wipro.com.java;
import java.util.Scanner;
public class acceptgender {
	public static void main(String[] args) {
		System.out.println("Enter gender Male or Female");
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		int age=sc.nextInt();
		if(s1.equalsIgnoreCase("Female")) {
			if(age>=1 && age<=58) {
				System.out.println("percentage of interest is 8.2%");
			}else if(age>=59 && age<=100) {
				System.out.println("percentage of interest is 9.2%");
			}
			
		}
		else if(s1.equalsIgnoreCase("Male")) {
			if(age>=1 && age<=58) {
				System.out.println("percentage of interest is 8.4%");
			}
			else if(age>=59 && age<=100) {
				System.out.println("percentage of interest is 10.5%");
			}
		}
		sc.close();
	}
}
