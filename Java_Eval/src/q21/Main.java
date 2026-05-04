package q21;

public class Main extends Thread {
@Override
public void run() {
	// TODO Auto-generated method stub
	try {
		System.out.println("Hi");
		Thread.sleep(5000);
		System.out.println("Good Morning");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	};
}
public static void main(String[] args) {
	Main main=new Main();
//	Thread thread=new Thread(main); for Runnable 
	main.start();
}
}

