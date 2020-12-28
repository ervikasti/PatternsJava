/*
*.
***
*****
using single loop statement
*/

class pattern2 
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
				  	if (i==0 && j==1)
					{
						System.out.print(".");
					}
					if (i>=j)
					{
						System.out.print("*");
					}
					
				}
				System.out.println();
				pattern2.i=pattern2.i+2;
				pat(pattern2.i);
			}
		}
}
