package fibo;

public class fib {

	public static void main(String[] args) {
		System.out.println("Fibonnaci series");
		fibonaci(100);
	}
	protected  static void  fibonaci(int n)
	{
		int a=0,b=1,i;
		int c=0;
		int odd,sum=0;
		System.out.print(a+" ");
		System.out.print(b+" ");
		for(i=1;c<=n;i++)
		{
			c=a+b;
			if(c>n)
			{
				break;
			}	
			if(c%2!=0)
			{
			 odd = c;
			sum=sum+odd;
				
			}
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		System.out.print(sum+" ");
	}
}
