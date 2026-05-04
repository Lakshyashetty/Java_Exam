package q5;
//comparable& comparator

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class  Emp implements Comparable<Emp>{

	String name;
	int id;
	double salary;
	
	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + salary + "]";
	}

	@Override
	public int compareTo(Emp o) {
		// TODO Auto-generated method stub
		if (this.id<o.id) {
			return -1;
		}
		return 0;
		
	}
	
}

public class Main {
public static void main(String[] args) {
	Emp emp=new Emp("Laksh", 102, 68000);
	Emp emp2=new Emp("Rahul", 103, 54000);
	Emp emp3=new Emp("Ashraf", 101, 34000);
	Emp emp4=new Emp("Laksh", 104, 24000);
	
ArrayList<Emp> list=new ArrayList<Emp>();
list.add(emp);
list.add(emp2);
list.add(emp3);
list.add(emp4);
System.out.println("Before");
Iterator<Emp> iterator=list.iterator();
while (iterator.hasNext()) {
	Emp emp5 = (Emp) iterator.next();
	System.out.println(emp5);
	
}
System.out.println("After");
Collections.sort(list);
Iterator<Emp> iterator2=list.iterator();
while (iterator2.hasNext()) {
	Emp emp5 = (Emp) iterator2.next();
	System.out.println(emp5);
	
}
System.out.println("------------------------");
Collections.sort(list,new SalaryComparator());
Iterator<Emp> iterator3=list.iterator();
while (iterator3.hasNext()) {
	Emp emp5 = (Emp) iterator3.next();
	System.out.println(emp5);
	
}
}

}
