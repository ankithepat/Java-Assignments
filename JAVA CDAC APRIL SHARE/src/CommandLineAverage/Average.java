import java.util.*;
public class Average{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of inputs : ");
        n=sc.nextInt();
        Double[] arr=new Double[n];
        if(n<2)
        {
            System.out.println("The number of inputs should be greater than or equal to 2\n");
        }
       else
        {
            double sum=0;
            int flag=0;
            for(int i=0;i<n;i++)
            {
                flag=0;
                boolean isnum=sc.hasNextDouble();
                if(isnum)
                {
                arr[i]=sc.nextDouble();
                sum+=arr[i];
                }
                else
                {
                    System.out.println("You did not enter a number.");
                    flag=1;
                    break;
                }
            }
                   if(flag==0)System.out.println("The Average Of The Arguments Passed is : " + sum/n);
        }
        
        }
     }
