package q4;

import java.io.FileInputStream;
import java.io.Serializable;

class Emp implements Serializable {
	int id;
	String name;
	double salary;
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class Main {
public static void main(String[] args) {
	Emp emp=new Emp(101, "Lakshya", 32000);
//	FileInputStream fileInputStream=new  ;
}
}
