package q18;

import java.io.File;

public class Main {
public static void main(String[] args) {
	File file=new File("demo.txt");
	try {
		file.createNewFile();
		System.out.println("File Created successfully");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
