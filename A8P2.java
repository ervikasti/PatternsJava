class A8P2
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 1;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if ((i<=j && i+j<=n-1)||(i>=j && i+j>=n-1))
				{
				    System.out.print((j+1)%2);
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
