class A8C 
{
	public static void main(String[] args) 
	{
		int n = 5;
		// Printing C pattern
		for (int i=0;i<n ;i++ )
		{
			for (int j=0;j<n ;j++ )
			{
				if (i==0 ||  j==0 || i==4)
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