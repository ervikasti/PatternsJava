class A8P5
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 'a';

		for (int i = 0;i<n ;i++ )
		{
			
			for (int j = 0;j<n ;j++ )
			{
				
				if (i>=j)
				{
					System.out.print((char)(k+i+j));
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
