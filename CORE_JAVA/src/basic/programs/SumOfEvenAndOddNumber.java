package basic.programs;

public class SumOfEvenAndOddNumber {

	public static void main(String[] args) {
		int evenSum = 0;
		int oddSum = 0;
		for(int i = 2 ; i <= 10 ; i+=2)
		{
			evenSum += i;
		}
		System.out.println(evenSum);
		for(int i = 1 ; i <= 10 ; i+=2)
		{
			oddSum += i;
		}
		System.out.println(oddSum);

	}

}
