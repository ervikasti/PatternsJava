/* 
1
2*2
3*3*3
3*3*3
2*2
1
 */

class patter1 
{
	public static void main(String[] args) 
	{
		int n=12;
		int x=1;
		int y=3;
		for (int i=0;i<n ;i++ )
		{
			if (i%2==0 && i<6)
			{
				for (int j=0;j<n;j++ )
				{
					if (i>=j)
					{
						if (j%2==0)
						{
							System.out.print(x);
						}
						else
						{
							System.out.print('*');
						}
					}
					
				}
				x++;
				System.out.println();
			}
			else if (i%2==0)
			{
				for (int j=0;j<n;j++ )
					{
						if (i+j<=n-2)
						{
							if (j%2==0)
							{
								System.out.print(y);
							}
							else
							{
								System.out.print('*');
							}
						}

					}
				System.out.println();
				y--;
			}
		}

	}
}
