class A8P8 
{
	public static void main(String[] args) 
	{
		int n=5;
		char k=5;
		for (int i =0;i<n ;i++ )
		{
			char l = k;
			for (int j=0;j<n ;j++ )
			{
				if (i>=j)
				{
					System.out.print(l++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			k--;
			System.out.println();
		}
	}
}
