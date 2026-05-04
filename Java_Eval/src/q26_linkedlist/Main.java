package q26_linkedlist;

import java.util.LinkedList;



public class Main {
public static void main(String[] args) {
	EmpPojo empPojo=new EmpPojo(1, "Rahul", 45000);
	EmpPojo empPojo2=new EmpPojo(2, "Adriel", 43000);
	EmpPojo empPojo3=new EmpPojo(3, "Kaif", 45000);
	EmpPojo empPojo4=new EmpPojo(4, "Laksh", 54000);
	LinkedList<EmpPojo> linkedList=new LinkedList<EmpPojo>();
	linkedList.add(empPojo);
	linkedList.add(empPojo2);
	linkedList.add(empPojo3);
	linkedList.add(empPojo4);
	OperationImplementor implementor=new OperationImplementor();
	implementor.insertData(linkedList);
	implementor.showData();
	System.out.println("------------------------");
	implementor.updateData(4, "Lakshya");
	implementor.showData();
	System.out.println("------------------------");
	implementor.deleteData(3);
	implementor.showData();
	System.out.println("------------------------");
implementor.searchData(4);
	
	System.out.println("------------------------");
implementor.showData();
}
}
