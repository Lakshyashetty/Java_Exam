package q1;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class Enumex {
public static void main(String[] args) {
	Vector< String> vector=new Vector<String>();
	vector.add("Ram");
	vector.add("Shyam");
	vector.add("gagan");
	
	Enumeration<String> e=vector.elements();
	while (e.hasMoreElements()) {
		System.out.println( e.nextElement());
		
	}
}
}
