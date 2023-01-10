package StarPattern;

//Write a function to reverse a number in Java?

public class FunctionToReverseNumber {

//Program 1
	public static void main(String[] args) {
		int no = 12345;
		int rev = 0;
		System.out.println("Original Number is : " + no);

		while (no != 0) {
			int remainder = no % 10;
			rev = rev * 10 + remainder;
			no = no / 10;
		}
		System.out.println("The reverse number is: " + rev);

		System.out.println("-------------------------------------------------");

//Program 2
		int num = 879656;
		System.out.println("Original Number is : " + num);
		String org = Integer.toString(num);
		int revNumber;
		String reverse = "";

		for (int i = org.length() - 1; i >= 0; i--) {
			reverse = reverse + org.charAt(i);
		}

		revNumber = Integer.parseInt(reverse);
		System.out.println("The reverse number is: " + revNumber);

	}

}


/*
Output

Original Number is : 12345
The reverse number is: 54321
-------------------------------------------------
Original Number is : 879656
The reverse number is: 656978


*/