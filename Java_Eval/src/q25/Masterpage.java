
package q25;

//Create a Master page by using Swing(
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;



public class Masterpage extends JFrame {
JMenuBar bar;
JMenu menu1,menu2,menu3,menu4;
JMenuItem item1,item2,item3,item4,item5,item6, item7,item8,item9,item10,item11,item12;
JToolBar tl1;

public Masterpage() {
//TODO Auto-generated constructor stub
setLayout(new FlowLayout());
tl1=new JToolBar();
tl1.setRollover(true);
bar=new JMenuBar();
menu1=new JMenu("Home");
menu2=new JMenu("Doctor");
menu3=new JMenu("Patients");

item1=new JMenuItem("About Us");
item2=new JMenuItem("Service");

item4=new JMenuItem("Exit");
item4.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(ABORT);
	}
});
item5=new JMenuItem("Doctor_Info");
item5.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
});
item6=new JMenuItem("Doctor_Registration");
item8=new JMenuItem("Patient_Detail");

item9=new JMenuItem("Billing");
item7=new JMenuItem("Exit");
item7.addActionListener(new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(ABORT);
	}
});
item11=new JMenuItem("With_GST");
item12=new JMenuItem("Payment_Details");
add(tl1);	
tl1.add(bar);
bar.add(menu1);
bar.add(menu2);
bar.add(menu3);


menu1.add(item1);
menu1.add(item2);
menu1.add(item4);
menu2.add(item5);
menu2.add(item6);
menu3.add(item8);
menu3.add(item9);
menu3.add(item7);


setSize(400,400);
setVisible(true);
setDefaultCloseOperation(EXIT_ON_CLOSE);
}
public static void main(String[] args) {
new Masterpage();
}
}


