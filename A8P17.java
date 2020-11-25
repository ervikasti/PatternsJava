class A8P17 
{
	public static void main(String[] args) 
	{
		int n = 5;
		char x = 'a';
		for (int i = 0;i<n ;i++ )
		{
			char a = x;
			for (int j =0;j<n ;j++ )
			{
				if (i+j>=n-1)
				{
					System.out.print(a--);
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (int k =0;k<n ;k++ )
			{
				if (i>=k+1)
				{
					System.out.print((char)((a++)+2));
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			x++;

		}
	}
}
