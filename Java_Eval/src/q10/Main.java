package q10;

import java.util.Objects;

class Emp implements Cloneable {
	int id;
	String name;
	double Salary;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", Salary=" + Salary + "]";
	}
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		Salary = salary;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public int hashCode() {
		return Objects.hash(Salary, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return Double.doubleToLongBits(Salary) == Double.doubleToLongBits(other.Salary) && id == other.id
				&& Objects.equals(name, other.name);
	}
}
public class Main {
public static void main(String[] args) throws CloneNotSupportedException {
	Emp emp=new Emp(101, "tom", 43000);
	System.out.println(emp);
	Emp emp2=  (Emp) emp.clone();
	Emp emp3=new Emp(101, "tom", 43000);
	System.out.println(emp.equals(emp3));
}
}
