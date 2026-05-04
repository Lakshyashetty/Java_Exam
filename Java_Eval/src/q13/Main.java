package q13;

class Emp{
	void meth() {
		
	}
}
class Outer{
	class Inner{
		void show( Emp emp) {   
			emp.meth();
		}
	}
}
public class Main {
public static void main(String[] args) {
	Outer outer=new Outer();
	Outer.Inner inner= outer.new Inner();
	
	Emp emp=new Emp(){
		 @Override
		void meth() {
			// TODO Auto-generated method stub
			System.out.println("Hello Lakshya");
		}
	};
	inner.show(emp);
}
}

