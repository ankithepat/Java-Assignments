package utils.conversion;
import java.util.*;
public class Converter{
        public static Double convertptk(Double a)
        {
            return a*0.4536;
        }
        public static Double convertctf(Double a)
        {
            double cs=(a*9)/5;
            return cs+32;
        }
        public static void convertsec(long a)
        {
            long hour,min,sec;
            hour=a/3600;
            long temp=(a-(hour*3600));
            min=temp/60;
            sec=(temp-(min*60));
            System.out.println(hour+"h"+min+"m"+sec+"secs");
        }
        public static void main(String[] args)
        {
            int choice;
            System.out.println("Enter the choice : \n 1.Covert Pounds to Kilograms \n 2. Convert Celcius to Fahrenheit \n 3.Covert Seconds to a Formatted Manner.");
            Scanner sc=new Scanner(System.in);
            choice=sc.nextInt();
            do
            {
                switch(choice)
                {
                    case 1:
                        Double pounds;
                        System.out.println("Enter the pounds to be converted");
                        pounds=sc.nextDouble();
                        Double k=convertptk(pounds);
                        System.out.println(pounds+" in kilograms = "+k);
                        break;
                    case 2:
                        Double celcius;
                        System.out.println("Enter the Celcius to be converted");
                        celcius=sc.nextDouble();
                        Double f=convertctf(celcius);
                        System.out.println(celcius+" in Fahrenheit = "+f);
                        break;
                    case 3:
                        long sec;
                        System.out.println("Enter the seconds to be converted in formatted manner :");
                        sec=sc.nextLong();
                        convertsec(sec);
                        break;
                }
                choice=sc.nextInt();
            }while(choice!=0);
        }
}