class A8P6v1
{
	public static void main(String[] args) 
	{
		int n=5;
		int k=1;
		for (int i =0;i<n ;i++ )
		{
			int l = k;
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
			k++;
			System.out.println();
		}
	}
}
