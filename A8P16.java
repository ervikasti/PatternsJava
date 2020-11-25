class A8P16
{
	public static void main(String[] args) 
	{
		int n=5;
		int x=1;
		char y = 'a';
		for (int i=0;i<n ;i++ )
		{
			int a = x;
			char b = y;
			for (int j =0;j<n ;j++ )
			{
				if(i+j>=n-1)
				{
					if (i%2==0)
					{
						System.out.print(a++);
					}
					else
					{
						System.out.print((char)(b++));
					}
				}
				else
				{
					System.out.print(" ");
				}
			}
			for (int k = 0;k<n ;k++ )
			{
				if (i>=k+1)
				{
					if(i%2==0)
					{
						System.out.print((a--)-2);
					}
					else
					{
						System.out.print((char)((b--)-2));
					}
						
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();

		}
	}
}
