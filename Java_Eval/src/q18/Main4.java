package q18;

import java.io.File;

public class Main4 {
public static void main(String[] args) {
	File file=new File("demo.txt");
	try {
		if (file.delete()) {
			System.out.println("File Deleted Successfully:"+file.getName());
		}
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
}
}
