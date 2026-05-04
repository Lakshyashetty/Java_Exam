package q24;

class Acc{
	 void calSal(double salary) {
			// TODO Auto-generated method stub
		 System.out.println("Acc sal:"+salary);

		}
	 void calSal(double salary,double bonus) {
			// TODO Auto-generated method stub
		 System.out.println("Acc sal with bonus:"+(salary+bonus));

		}
	}
	
	public class Main {
	public static void main(String[] args) {
		Acc acc=new Acc();
		acc.calSal(34000);
		acc.calSal(34000, 23000);

	}
	}