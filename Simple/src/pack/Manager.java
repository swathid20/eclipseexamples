package pack;

public class Manager extends Employee {
	private int empCount;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, int age, int empCount) {
		super(name, age);
		this.empCount = empCount;
	}

	public int getEmpCount() {
		return empCount;
	}

	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}

	@Override
	public String toString() {
		return super.toString()+"Manager empCount=" + empCount; 
				
	}

	
}
