package p1;

public class Employee {
	private int id;
	private String name;
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID of the employee : "+id+"\nName of the employee : "+name+"\n";
	}

}
