class A8P1 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 'a';
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if ((i<=j && i+j<=n-1)||(i>=j && i+j>=n-1))
				{
				    System.out.print((char)(k+i));
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
