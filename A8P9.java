class A8P9
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 1;
		char c = 'a';
		for (int i=0;i<n ;i++ )
		{
			int m = k;
			char c1 = c;

			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					if (i%2==0)
					{
						System.out.print(m++);
					}
					else
					{
						System.out.print(c1++);
					}
				}
			}
			System.out.println();
			if (i%2==0)
			{
				k++;
			}
			else
			{
				c++;
			}
		}
	}
}
