package patterns;

public class Pyramid {
	static void Pyramid()
	{
//		int k = 0;
//		for(int i =1 ; i <= 4; i++)
//		{
//			for(int j = 1 ; j<=7; j++)
//			{	k = i+j;
//				if((i+j>=5) || ((i + j) == k - i) )
//				{
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}System.out.println();
//		}
//		int n = 11;
//
//		for (int i = 1; i <= n; i++) {
//		    for (int j = 1; j <= n - i; j++) {
//		        System.out.print(" ");
//		    }
//		    for (int k = 1; k <= 2 * i - 1; k++) {
//		        System.out.print("*");
//		    }
//		    System.out.println();
//		}
//
//	}
//		---------------------------------------------------------------------
		int n = 5 ;
		for(int i = 1 ; i <= n ; i++)
		{
			for(int j = 1 ; j <= n * 2; j++)
			{
				if(j >= n - i + 1 && j <= n + i - 1)
				{					
					System.out.print("*");
				}
				else {
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
		
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pyramid();
	}

}
