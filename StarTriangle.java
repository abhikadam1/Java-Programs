import java.util.Scanner;
class StarTriangle{
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		
		for(int i=1; i<n; i++)
		{
			for(int j=1; j<=i;j++)
			{
				if(i%2==0)
				{
					if(j%2==0)
					{
						System.out.print("*    ");
					}
					else
					{
						System.out.print("    ");
					}
					//break;
				}
				if(i%2!=0)
				{
					if(j%2!=0)
					{
					 	System.out.print("*    ");
					}
					else
					{
						System.out.print("    ");
					}
				}
			}
			
			System.out.println("");
			
		}
		
	}
}
