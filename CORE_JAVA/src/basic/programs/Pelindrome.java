package basic.programs;

public class Pelindrome {

	public static void main(String[] args) {
		int num = 123456789;
		int rev = 0, ori;
		ori = rev;
		System.out.println("The original number is : " + num);
		for(; num != 0 ; num /= 10)
		{
			int digit = num % 10;
			rev = rev * 10 + digit ;
		}
		if(ori == rev){
			
			System.out.println("It is pelindrome : " + rev);
		}else {
			System.out.println("It is not pelindrome : " + rev);
		}

	}

}
