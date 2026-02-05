package patterns;

public class TopRight {
	static void TopRight() {
		for(int i = 1 ; i <=5 ; i++)
		{
			for(int j = 1 ; j <= 5 ; j++)
			{
				if(i + j <= 6)
					System.out.print("*");
				else
					System.out.print(" ");
			}System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TopRight();
	}

}
