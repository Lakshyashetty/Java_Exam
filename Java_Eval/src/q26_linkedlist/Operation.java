package q26_linkedlist;

import java.util.LinkedList;


interface Operation {
void insertData(LinkedList<EmpPojo> linkedList);
void updateData(int id ,String name);
void deleteData(int id);
void searchData(int id);
void showData();
}

