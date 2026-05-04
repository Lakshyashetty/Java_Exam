package q27;
class Emp{
	int id;
	String name;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Data Deleted..");
	}
	
}
public class Main {
public static void main(String[] args) {
	Emp emp=new Emp(101, "Laksh");
	System.out.println(emp);
	emp=null;
	System.gc();
	
}
}
