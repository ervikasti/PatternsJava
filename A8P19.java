class A8P19 
{
	public static void main(String[] args) 
	{
		int n = 5;
		int k = 0;
		int l = 0;
		for (int i=0;i<n ;i++ )
		{
			if(i%2==0)
			{
				k = 0;
			}
			else
			{
				l = k+4;
			}
			

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
