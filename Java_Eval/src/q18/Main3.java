package q18;

import java.io.File;
import java.util.Scanner;

public class Main3 {
public static void main(String[] args) {
	File file=new File("demo.txt");
	try {
		Scanner scanner=new Scanner(file);
		while (scanner.hasNext()) {
			String string = (String) scanner.next();
			System.out.println(string);
			
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
