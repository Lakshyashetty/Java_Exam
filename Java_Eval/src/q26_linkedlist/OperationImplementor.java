package q26_linkedlist;

import java.util.Iterator;
import java.util.LinkedList;



public class OperationImplementor implements Operation {
	LinkedList<EmpPojo> db=new LinkedList<EmpPojo>();
	@Override
	public void insertData(LinkedList<EmpPojo> linkedList) {
		// TODO Auto-generated method stub
		db.addAll(linkedList);
		System.out.println("Data Inserted");
	}

	@Override
	public void updateData(int id, String name) {
		// TODO Auto-generated method stub
		Iterator<EmpPojo> iterator=db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId()==id) {
				empPojo.setName(name);
				System.out.println("Data Updated");
			}
			
		}
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		Iterator<EmpPojo> iterator=db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId()==id) {
				iterator.remove();
				System.out.println("data Deleted");
			}
		}
	}

	@Override
	public void searchData(int id) {
		// TODO Auto-generated method stub
		Iterator<EmpPojo> iterator=db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			if (empPojo.getId()==id) {
				System.out.println(empPojo);
				System.out.println("found");
			}
		}
	}

	@Override
	public void showData() {
		// TODO Auto-generated method stub
		Iterator<EmpPojo>iterator=db.iterator();
		while (iterator.hasNext()) {
			EmpPojo empPojo = (EmpPojo) iterator.next();
			System.out.println(empPojo);
		}
		
	}

}
