package q9;
class Emp{
	String name="Laksh";
	int id=101;
	double sal=43000;
	String address="Mirard";
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

	void displaInfo(){
		System.out.println("Name"+name);
		System.out.println("Id"+id);
		System.out.println("Salary"+sal);
		System.out.println("Address"+address);
	}
}
public class Main {
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.displaInfo();
}
}
