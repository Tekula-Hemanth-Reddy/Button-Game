package Buttongame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class loading implements Runnable {
	Thread t;
	JFrame jfl;
	JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5;
	userdetails ud;
	String type;
	loading(userdetails details,String ty)
	{
		ud=details;
		type=ty;
		jfl=new JFrame();
		jfl.setSize(684,528);
		jfl.setBounds(100, 100, 684, 526);
		jfl.setLayout(null);
		jfl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JButton b24 = new JButton("24");
		b24.setBounds(89, 67, 66, 25);
		jfl.getContentPane().add(b24);
		
		JButton b14 = new JButton("14");
		b14.setBounds(142, 193, 66, 25);
		jfl.getContentPane().add(b14);
		
		JButton b22 = new JButton("22");
		b22.setBounds(262, 87,66 , 25);
		jfl.getContentPane().add(b22);
		
		JButton b4 = new JButton("4");
		b4.setBounds(224, 154, 66, 25);
		jfl.getContentPane().add(b4);
		
		JButton b13 = new JButton("13");
		b13.setBounds(312, 193, 66, 25);
		jfl.getContentPane().add(b13);
		
		JButton b21 = new JButton("21");
		b21.setBounds(418, 67, 66, 25);
		jfl.getContentPane().add(b21);
		
		JButton b16 = new JButton("16");
		b16.setBounds(378, 129, 66, 25);
		jfl.getContentPane().add(b16);
		
		JLabel loadLabel = new JLabel("LOADING...");
		loadLabel.setBackground(Color.CYAN);
		loadLabel.setForeground(Color.ORANGE);
		loadLabel.setFont(new Font("Tahoma", Font.PLAIN, 48));
		loadLabel.setBounds(177, 254, 321, 62);
		jfl.getContentPane().add(loadLabel);

		jrb1=new JRadioButton("");
		jrb1.setBounds(177, 379, 47, 25);
		jfl.getContentPane().add(jrb1);
		
		jrb2=new JRadioButton("");
		jrb2.setBounds(224, 379, 47, 25);
		jfl.getContentPane().add(jrb2);
		
		jrb3=new JRadioButton("");
		jrb3.setBounds(275, 379, 47, 25);
		jfl.getContentPane().add(jrb3);
		
		jrb4=new JRadioButton("");
		jrb4.setBounds(326, 379, 47, 25);
		jfl.getContentPane().add(jrb4);
		
		jrb5=new JRadioButton("");
		jrb5.setBounds(378, 379, 47, 25);
		jfl.getContentPane().add(jrb5);
		jfl.setVisible(true);
		
		t=new Thread(this,"load");
		t.start();
	}
	
	public void run()
	{
		int i=1;
		while(i<=5)
		{
			if(i==1)
			{
				jrb1.setSelected(true);
			}
			else if(i==2)
			{
				jrb2.setSelected(true);
			}
			else if(i==3)
			{
				jrb3.setSelected(true);
			}
			else if(i==4)
			{
				jrb4.setSelected(true);
			}
			else
			{
				jrb5.setSelected(true);
				jfl.dispose();
				game g=new game(ud,type);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			i=i+1;
		}
	}

}
