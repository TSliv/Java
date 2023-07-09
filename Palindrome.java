public class Palindrome {
	private static boolean isPalindrome(int number) {
		String inNumber = String.valueOf(number);
	
		String compareNumber = "";		

		for(int i = inNumber.length()-1; i >= 0; i--) {
			compareNumber += inNumber.charAt(i);                                                                                                                                                                                                                                          			
		}

		return compareNumber.equals(inNumber);
	}	

	private static void run() {
		int number = 10;

		System.out.println(isPalindrome(number)?"Is A Palindrome":"Is not a Palindrome");		
	}

	public static void main(String[] args) {
		run();
	}
}