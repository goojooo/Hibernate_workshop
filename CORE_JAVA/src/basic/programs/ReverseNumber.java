package basic.programs;

public class ReverseNumber {

	public static void main(String[] args) {
		int num = 123456789;
		int rev = 0;
		System.out.println("The original number is : " + num);
		for(; num != 0 ; num /= 10)
		{
			int digit = num % 10;
			rev = rev * 10 + digit ;
		}
		System.out.println("The reverse number is : " + rev);

	}

}
