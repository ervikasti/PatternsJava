class A8G
{
	public static void main(String[] args) 
	{
		int n = 5;
		// Printing G pattern
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 || (i==4 && j<4) || j==0 || (j==3 && i>=2) || (i==2 && (j>1 && j<=4)))
				{	
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
}