import java.util.Scanner;
class Vowel
{
	public static void main(String[] args)
	{
	int countVowel=0,countConsonant=0;
	int length=args[0].length();
		for(int i=0;i<length;i++)
		{
			if(args[0].charAt(i)=='a' || args[0].charAt(i)=='e' || args[0].charAt(i)=='i' || 
args[0].charAt(i)=='o' || args[0].charAt(i)=='u' || args[0].charAt(i)=='A' || args[0].charAt(i)=='E' || 
args[0].charAt(i)=='I' || args[0].charAt(i)=='O' || args[0].charAt(i)=='U')
			{	
				System.out.println("Vowel in the string : "+args[0].charAt(i));
				countVowel++;		
			}		
			else
			{
				countConsonant++;
			}
		}
	System.out.println("\nTotal number of vowels : " + countVowel);
	System.out.println("\nTotal number of Consonants : " + countConsonant);
	
	}
}