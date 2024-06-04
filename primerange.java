package wipro.com.java;

public class primerange {
	 public static void main(String[] args) {
	        int n = 99; // Change 'n' to the desired range
	        System.out.println("Prime numbers from 10 to " + n + ":");
	        
	        for (int i = 2; i <= n; i++) {
	            boolean isPrime = true;
	            for (int j = 2; j < 10; j++) {
	                if (i % j == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(i + " ");
	            }
	        }
	    }
}
