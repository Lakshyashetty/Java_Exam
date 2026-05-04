package q3;

class Bank{
	public double  rateOfinterest() {
		return 3.0;
		// TODO Auto-generated method stub

	}	
}
class Axix extends Bank{
	public double  rateOfinterest() {
		return 4.0;
		// TODO Auto-generated method stub

	}
}
class ICIC extends Bank{
	public double  rateOfinterest() {
		return 5.0;
		// TODO Auto-generated method stub

	}
}

public class Main {
public static void main(String[] args) {
	Bank bank=new Bank();
	bank=new Axix();
	System.out.println("Axix Bank:"+bank.rateOfinterest());
	bank=new ICIC();
	System.out.println("ICIC Bank:"+bank.rateOfinterest());
	
}
}
