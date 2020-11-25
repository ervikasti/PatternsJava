class A8P3 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 'a';
		int m = 1;
		for (int i = 0;i<n ;i++ )
		{
			for (int j = 0;j<n ;j++ )
			{
				if (i>=j)
				{
					if (i%2==0)
					{
						System.out.print(m++);
					}
					else
					{
						System.out.print((char)(k++));
					}
				    
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
