import java.util.Scanner;
class DemoFibo
{
	static int n1=0, n2=1, n3=0;
	static void fibo(int c)
	{
		if(c>0)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fibo(c-1);
		}
	}
	
	public static void main(String args [])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter No. To print Fibonacci Series up to");
		int c=sc.nextInt();
		System.out.println(n1+"\n"+n2);
		fibo(c);
	}
	
}