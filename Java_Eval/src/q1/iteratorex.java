package q1;

import java.util.ArrayList;
import java.util.Iterator;


public class iteratorex {
public static void main(String[] args) {
ArrayList<String> list=new ArrayList<String>();
list.add("laksh");
list.add("rahul");
list.add("Adriel");
Iterator iterator=list.iterator();
while (iterator.hasNext()) {
	System.out.println( iterator.next());
	
}
}
}
