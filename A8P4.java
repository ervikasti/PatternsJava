class A8P4 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 'a';

		for (int i = 0;i<n ;i++ )
		{
			int m = 0;
			for (int j = 0;j<n ;j++ )
			{
				
				if ((i<=j&& i+j<=n-1)||(i>=j && i+j>=n-1))
				{
					System.out.print((char)(k+(m++)));
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
