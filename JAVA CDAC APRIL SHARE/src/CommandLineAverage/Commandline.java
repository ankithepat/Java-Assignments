public class Commandline{

     public static void main(String []args){
        if(args.length<2)
        {
            System.out.println("The number of arguments should be greater than or equal to 2\n");
        }
        else
        {
	double sum=0;
                
            for(int i=0;i<args.length;i++)
            {
        
	        sum+=Double.parseDouble(args[i]);
                
            }
                   System.out.println("The Average Of The Arguments Passed is : " + sum/args.length);
        }
        
        }
     }
