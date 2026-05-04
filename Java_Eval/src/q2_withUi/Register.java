package q2_withUi;


import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Register extends JFrame  {

	
	JLabel  l1,l2,l3;
	JTextField t1,t2,t3;
	JButton btn1,btn2,btn3,btn4;
	TextArea ta1;
	
	public Register() {
		// TODO Auto-generated constructor stub
		setLayout(new FlowLayout());
		l1=new JLabel("Name");
		t1=new JTextField(20);
		l2=new JLabel("Id");
		t2=new JTextField(20);
		l3=new JLabel("contact");
		t3=new JTextField(20);
		btn1=new JButton("Insert");
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=t1.getText();
				int id=Integer.parseInt(t2.getText());
				String contact=t3.getText();
				
				Pojo pojo=new Pojo();
				pojo.setName(name);
				pojo.setId(id);
				pojo.setContact(contact);
  Operation operation=new Operation();
  			operation.InsertData(pojo);
  			t1.setText("");
  			t2.setText("");
  			t3.setText("");
			}
		});
		btn2=new JButton("update");
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name=t1.getText();
				int id=Integer.parseInt(t2.getText());
				String contact=t3.getText();
				
				Pojo pojo=new Pojo();
				pojo.setName(name);
				pojo.setId(id);
				pojo.setContact(contact);
				
				
				Operation operation=new Operation();
				operation.UpdateData(pojo);
				t1.setText("");
				t2.setText("");
				t3.setText("");
				
			}
		});
		 btn3=new JButton("Delete");
		 btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int id=Integer.parseInt(t2.getText());
				Pojo pojo=new Pojo();
				pojo.setId(id);
				
				Operation operation=new Operation();
				operation.DeleteData(pojo);
				t1.setText("");
			
			}
		});
		btn4=new JButton("Show");
		btn4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int id=Integer.parseInt(t2.getText());
				
				Pojo pojo=new Pojo();
				pojo.setId(id);
				Operation operation=new Operation();
				operation.ShowData(pojo);

			}
		});
		ta1=new TextArea(10,40);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(ta1);
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Register();
	}
}
