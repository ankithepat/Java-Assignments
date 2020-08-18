package p1;

public class FixedStack implements Stack {
	private Employee[] emp;
	private int top;
	public FixedStack() {
		// TODO Auto-generated constructor stub
		emp=new Employee[STACK_SIZE];
		top=-1;
	}
	@Override
	public void push(Employee e) {
		// TODO Auto-generated method stub
		if(top==STACK_SIZE-1)
		{
			System.out.println("Stack Full\n");
		}
		else
		{
		top++;
		emp[top]=e;
		
		}
	}

	@Override
	public Employee pop() {
		// TODO Auto-generated method stub
		if(top==-1)
		{
			System.out.println("Stack Empty\n");
			return null;
		}
		else
		{
		return emp[top--];
		}
	}
	

}
