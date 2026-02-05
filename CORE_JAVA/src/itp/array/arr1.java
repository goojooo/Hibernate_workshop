package itp.array;

import java.util.Arrays;
import java.util.Scanner;

public class arr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array...");
		int size = sc.nextInt();
		double arr[] = new double[size];
//		for(int i = 0; i < size ; i++)
//		{
//			System.out.print(arr[i] + " ");
//		}
		for(int i = 0; i < size ; i++)
		{
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < size ; i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		for(double i : arr)
		{
			System.out.print(i + " ");
		}
		System.out.print(Arrays.toString(arr));
		sc.close();
	}
	

}
