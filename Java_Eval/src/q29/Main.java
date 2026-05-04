package q29;
class Test implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread is running");		
	}
	
}
public class Main {
public static void main(String[] args) {
	Test test =new Test();
	test.run();
	Thread thread=new Thread(test);
    thread.start();
  new Thread() {
	
	public void run() {
		System.out.println("Thread2 is Running...");
	};
}.start();
new Thread(new Runnable() {
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread3 is running...");
	}
}).start();	
}
}
