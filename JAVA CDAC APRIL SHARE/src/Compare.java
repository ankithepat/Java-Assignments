public class Compare{
        public static void main(String[] args)
        {
            if(args.length<2)
            {
                System.out.println("The number of arguments should be greater than 2");
            }
            else
            {
                if(Double.parseDouble(args[0])>Double.parseDouble(args[1]))
                {
                    System.out.println("The first argument "+ args[0]+" is greater than the second argument "+args[1]);
                }
                else
                {
                    
                    System.out.println("The first argument "+ args[0]+" is lesser than the second argument "+args[1]);
                }
            }
            
            
        }
     }