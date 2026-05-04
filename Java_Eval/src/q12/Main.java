package q12;
class Emp{
	String task;
	
	public Emp(String task) {
		System.out.println("Parent Constructor");
		this.task = task;
	}

	@Override
	public String toString() {
		return "Emp [task=" + task + "]";
	}
	 public String displayInfo() {
		// TODO Auto-generated method stub
   return task;
	}

}
class Acc extends Emp{

	public Acc(String task) {
		super(task);
		// TODO Auto-generated constructor stub
	}
	void displayCompInfo() {
		// TODO Auto-generated method stub
System.out.println("task:"+super.displayInfo());
System.out.println(super.task);
	}
	
	
}
public class Main {
public static void main(String[] args) {
	Acc acc=new Acc("Hello");
	acc.displayCompInfo();
}
}
