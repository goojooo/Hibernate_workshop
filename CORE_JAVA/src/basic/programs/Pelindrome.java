package basic.programs;

public class Pelindrome {

	public static void main(String[] args) {
		int num, ori , rev = 0;
		num = 121;
		ori = num;
		
		System.out.println("The original number is : " + num);
		for(; num != 0 ; num /= 10)
		{
			int digit = num % 10;
			rev = rev * 10 + digit ;
		}
		if(ori == rev){
			
			System.out.println("It is pelindrome : " + ori);
		}else {
			System.out.println("It is not pelindrome : " + ori);
		}

	}

}
