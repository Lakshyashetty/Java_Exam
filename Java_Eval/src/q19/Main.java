package q19;
class CalSalPolicy{
	public   CalSalPolicy calSal(double salary) {
		// TODO Auto-generated constructor stub
		return this;
	}
	public   CalSalPolicy calSal(double salary,double bonus) {
		// TODO Auto-generated constructor stub
		return this;
	}
}
class Emp extends CalSalPolicy{
	public Emp calsal(double salary) {
		// TODO Auto-generated constructor stub
		System.out.println("Emp salary:"+salary);
		return this;
	}
	public Emp calsal(double salary,double bonus) {
		// TODO Auto-generated constructor stub
		System.out.println("Emp salary with bonus:"+(salary+bonus));
		return this;
	}
}
public class Main {
public static void main(String[] args) {
	Emp emp=new Emp();
	emp.calsal(32000);
	emp.calsal(3200, 4300);
}
}
