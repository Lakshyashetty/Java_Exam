package q20;

public class Main {
public static double Divide(int a,int b) throws ArithmeticException{
	return a/b;
}
public static void calDiv(int a,int b,String operation ) throws ArithmeticException {
		try {
			if (operation.equals("/")) {
				double result=Divide(a, b);
				System.out.println(result);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	

public static void main(String[] args) {
	try {
		calDiv(10, 0, "/");
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}
}
}

