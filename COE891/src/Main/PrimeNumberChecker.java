package Main;

public class PrimeNumberChecker {
	
	public static boolean checkNumber(int number) {
		 if (number <= 1) return false; 
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0) return false; 
	        }
	        return true; 
	}
}
