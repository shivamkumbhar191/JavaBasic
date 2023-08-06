package pattern;

public class CombiAlphaNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print((char)(j+64));
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j);
				}
			}
			System.out.println();
		}

	}

}
