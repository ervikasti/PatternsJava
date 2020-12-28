/*
*.
***
*****
using single loop statement
*/

class pattern3 
{	
	static int i=0;
	public static void main(String[] args) 
	{	 
		pat(i);
	}
		//Recursive Method
		public static void pat(int i)
		{
			if (i<5)
			{
			  for (int j=0;j<5 ;j++ )
				{
					if (i>=j && i+j>=5-1)
					{
						System.out.print("*");
					}
					else
					{
						System.out.print(" ");
					}
					
				}
				System.out.println();
				pattern3.i=pattern3.i+1;
				pat(pattern3.i);
			}
		}
}
