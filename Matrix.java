class Matrix
{
	public static void main(String [] args)
	{
		int m=3, n=3;
		int a[][]={ {12,15,13},{65,11,79},{16,13,79} };
		
		int i=0;
		while(i<m)
		{
			int j=0;
			while(j<n)
			{
				System.out.print(" "+a[i][j]+" ");
				j++;
			}
			i++;
			System.out.println();
		}
		
		
		// for(int i=0; i<n; i++)
		// {
			// for(int j=0; j<m; j++)
			// {
				// System.out.print(" "+a[i][j]+" ");
			// }
		// System.out.println();
		// }
	 }
}