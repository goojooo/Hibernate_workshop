package patterns;

public class TopLeft {
	static void TopLeft(){
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int j = 1 ; j <=5 ; j++)
			{
				if(j>=i) 
					System.out.print("*");
				else
				System.out.print(" ");
				
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TopLeft();
	}

}
