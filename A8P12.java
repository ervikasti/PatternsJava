class A8P12
{
	public static void main(String[] args) 
	{
		int n=5;
		for (int i =0;i<n ;i++ )
		{

			for (int j=0;j<n ;j++ )
			{
				if (!(i>=j+3||i<=j-3||i+j<=n-4||i+j>=n+2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(j%2);
				}
			}
			System.out.println();
		}
	}
}
