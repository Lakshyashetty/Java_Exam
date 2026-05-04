package q1;

import java.util.ArrayList;

public class foreachex {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<String>();
	list.add("Laksh");
	list.add("Rahul");
	list.add("Ashraf");
	
	for (String name : list) {
	System.out.println(name);	
	}
	
}
}
