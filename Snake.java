class Snake 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 1;
		for (int i=0;i<n ;i++ )
		{
			int l=0;

			if (i%2==0)
			{
				k=k+i;
			}
			else
			{
				 l = k+i;
			}

			for (int j=0;j<n ;j++ )
			{
				if(i>=j)
				{
					if(i%2==0)
					{
						System.out.print(k++);
					}
					else
					{
						System.out.print(l--);
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
