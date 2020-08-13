import java.util.Scanner;
class Reverse
{
	public static void main(String[] args)
	{	
	int length=args[0].length();
	char[] rev = new char[length];
	int k=0;
		for(int i=length-1;i>=0;i--)
		{
			rev[k]=args[0].charAt(i);
			k++;
		}
	for(int i=0;i<length;i++)
		{
		System.out.print(rev[i]);
		}
	
	}
}