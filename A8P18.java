class A8P18 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 1;
		int l;
		for (int i=0;i<n ;i++ )
		{

				 l = k+4;
			

			for (int j=0;j<n ;j++ )
			{

					if(i%2==0)
					{
						System.out.print(k);
					}
					else
					{
						System.out.print(l--);
					}	
					k++;

			}

		System.out.println();

		}
	}
}
