package Buttongame;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class welcome implements ActionListener{
	JFrame jfw;
	JButton wexit,next;
	JLabel jl1,jl2,jl3;
	welcome()
	{
		jfw=new JFrame();
		jfw.setSize(684,528);
		jfw.setBounds(100, 100, 684, 526);
		jfw.setLayout(null);
		jfw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jl1 = new JLabel("Welcome");
		jl1.setForeground(Color.RED);
		jl1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		jl1.setBounds(200, 74, 174, 56);
		jfw.getContentPane().add(jl1);
		
		jl2 = new JLabel("to");
		jl2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		jl2.setForeground(Color.RED);
		jl2.setBounds(245, 142, 56, 33);
		jfw.getContentPane().add(jl2);
		
		jl3 = new JLabel("Button Game");
		jl3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		jl3.setForeground(Color.RED);
		jl3.setBounds(171, 188, 224, 45);
		jfw.getContentPane().add(jl3);
		 
		wexit=new JButton("EXIT");
		wexit.addActionListener(this);
		wexit.setBounds(54, 424, 97, 25);
		jfw.add(wexit);
		next=new JButton("NEXT");
		next.addActionListener(this);
		next.setBounds(478, 424, 97, 25);
		jfw.add(next);
		jfw.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equalsIgnoreCase("EXIT"))
		{
			jfw.dispose();
		}
		if(str.equalsIgnoreCase("NEXT"))
		{
			jfw.dispose();
			information info=new information();
		}
		
	}

}
