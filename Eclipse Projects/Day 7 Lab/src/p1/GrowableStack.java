package p1;

public class GrowableStack implements Stack {
	private Employee[] emp;
	int top;
	public GrowableStack() {
		emp=new Employee[STACK_SIZE];
		top=-1;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void push(Employee e) {
		// TODO Auto-generated method stub
		
		if(top==emp.length-1)
		{
			System.out.println("Doubling the size of array\n");
	
			Employee[] empNew=new Employee[2*emp.length];
			for(int i=0;i<emp.length;i++)
			{
				empNew[i]=emp[i];
			}
			emp=empNew;
			
			
			
		}
		
			top++;
			emp[top]=e;
		
			
		
	}

	@Override
	public Employee pop() {
		// TODO Auto-generated method stub
		
		if(top==-1)
		{
			System.out.println("Stack Empty!!!");
			return null;
		}
		return emp[top--];
	}

}
