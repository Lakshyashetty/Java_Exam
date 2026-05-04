package q6;
class Message{
String message="";
}
public class Main {
public static void main(String[] args) {
	Message message=new Message();
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			synchronized (message) {
				try {
					System.out.println("Wait for the Message");
					message.wait();
					System.out.println("Got the Message");
				} catch (InterruptedException e) {
					// TODO: handle exception
					System.out.println(e);
				}
			}
			
		}
	}).start();
	new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				// TODO: handle exception
			e.printStackTrace();
			}
			synchronized (message) {
				System.out.println("Sending the message");
				message.notify();
				
			}
		}
	}).start();
}
}
