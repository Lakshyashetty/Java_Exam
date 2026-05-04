package q1;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorex {
public static void main(String[] args) {
	ArrayList< String> list=new ArrayList<String>();
	list.add("robin");
	list.add("steve");
	list.add("dustin");
	ListIterator<String> l=list.listIterator();
	while (l.hasNext()) {
		System.out.println( l.next());
		
	}
	System.out.println();
	while (l.hasPrevious()) {
		System.out.println( l.previous());
		
	}
}
}
