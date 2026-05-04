package q18;

import java.io.File;
import java.io.FileWriter;

public class Main2 {
public static void main(String[] args) {
	File file=new File("demo.txt");
	try {
		FileWriter fileWriter=new FileWriter(file);
		fileWriter.write("Hello World");
		fileWriter.close();
		System.out.println("File written Successfully");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
