import java.util.Scanner;

class FiboMethod
{
	static void Fibo(int c)
	{
		int n1=0, n2=1, n3;
		System.out.println("\n"+n1+"\n"+n2);
		for(int i=2; i<c; i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}
	
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Fibo(a);
	}
}