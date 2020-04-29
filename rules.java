package Buttongame;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class rules implements ActionListener {
	JFrame jfr;
	JButton rexit,rnext,rpre;
	userdetails ud;
	String type;
	JTextArea rls;
	rules(userdetails ud,String ty)
	{
		this.ud=ud;
		type=ty;
		jfr=new JFrame();
		jfr.setSize(684,528);
		jfr.setBounds(100, 100, 684, 526);
		jfr.setLayout(null);
		jfr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rls = new JTextArea();
		rls.setFont(new Font("Monospaced", Font.BOLD, 18));
		rls.setText("Rules\r\n1. If a button is surrounded by 4 buttons\r\nif you press that button then those 5\r\nbuttons will dissaper.\r\n2. If a button is surrounded by 3 buttons\r\nif you press that button then those 4\r\nbuttons will dissaper.\r\n3. If a button is surrounded by 2 buttons\r\nif you press that button then those 3\r\nbuttons will dissaper.\r\n4. If a button have only 1 adjacent\r\nbutton if you press that button then\r\nthat button will dissaper.\r\n5. If you left with no button visible\r\nthen you are the WINNER.");
		rls.setBounds(12, 13, 642, 400);
		rls.setBackground(Color.blue);
		rls.setEditable(false);
		jfr.getContentPane().add(rls);
		
		rexit= new JButton("EXIT");
		rexit.setBounds(54, 424, 97, 25);
		jfr.add(rexit);
		rexit.addActionListener(this);
		
		rnext=new JButton("NEXT");
		rnext.setBounds(478, 424, 97, 25);
		rnext.addActionListener(this);
		jfr.add(rnext);
		
		rpre=new JButton("pre");
		rpre.setBounds(270, 424, 97, 25);
		jfr.add(rpre);
		rpre.addActionListener(this);
		
		jfr.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		
		String str=ae.getActionCommand();
		if(str.equalsIgnoreCase("EXIT"))
		{
			jfr.dispose();
		}
		else if(str.equalsIgnoreCase("pre"))
		{
			jfr.dispose();
			information info=new information();
		}
		else if(str.equalsIgnoreCase("NEXT"))
		{
			jfr.dispose();
			loading lo=new loading(ud,type);
		}
	}

}
