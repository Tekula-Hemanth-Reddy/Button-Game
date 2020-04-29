package Buttongame;

import java.awt.*;
import javax.swing.*;

import jxl.write.Colour;

import java.awt.event.*;
import java.io.*;


public class information implements ActionListener{

	JFrame jfi;
	JButton but,gam,iexit,inext,fb,gue;
	JTextField fbtxt,entxt;
	JLabel en,fbid;
	String name="";
	String id="";
	String type;
	information()
	{
		jfi=new JFrame();
		jfi.setSize(684,528);
		jfi.setBounds(100, 100, 684, 526);
		jfi.setLayout(null);
		jfi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		but = new JButton("BUTTON");
		but.setForeground(Color.MAGENTA);
		but.setBounds(125, 80, 97, 25);
		jfi.getContentPane().add(but);
		
		gam = new JButton("GAME");
		gam.setForeground(Color.MAGENTA);
		gam.setBounds(308, 80, 97, 25);
		jfi.getContentPane().add(gam);
		
		iexit = new JButton("EXIT");
		iexit.setBounds(53, 421, 97, 25);
		iexit.addActionListener(this);
		jfi.getContentPane().add(iexit);
		
		inext = new JButton("NEXT");
		inext.setBounds(461, 421, 97, 25);
		inext.addActionListener(this);
		inext.setVisible(false);
		jfi.getContentPane().add(inext);
		
		en = new JLabel("Enter Name");
		en.setForeground(Color.RED);
		en.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 20));
		en.setBounds(38, 193, 123, 25);
		jfi.getContentPane().add(en);
		
		entxt = new JTextField();
		entxt.setBounds(169, 193, 254, 25);
		jfi.getContentPane().add(entxt);
		entxt.setColumns(100);

		fb = new JButton("Facebook");
		fb.setBounds(139, 274, 97, 25);
		fb.addActionListener(this);
		jfi.getContentPane().add(fb);
		
		gue = new JButton("Guest");
		gue.setBounds(275, 274, 97, 25);
		gue.addActionListener(this);
		jfi.getContentPane().add(gue);
		
		fbtxt = new JTextField();
		fbtxt.setBounds(139, 329, 306, 22);
		jfi.getContentPane().add(fbtxt);
		fbtxt.setVisible(false);
		fbtxt.setColumns(30);
		
		fbid = new JLabel("fb_id");
		fbid.setFont(new Font("Tahoma", Font.PLAIN, 16));
		fbid.setBounds(92, 330, 47, 19);
		jfi.getContentPane().add(fbid);
		fbid.setVisible(false);

		 jfi.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		if(str.equalsIgnoreCase("EXIT"))
		{
			jfi.dispose();
		}
		else if(str.equalsIgnoreCase("NEXT"))
		{
			name=entxt.getText();
			id=fbtxt.getText();
			if(name.equalsIgnoreCase("") || id.equalsIgnoreCase(""))
			{
				if(name.equalsIgnoreCase(""))
				{
					entxt.setBackground(Color.red);
				}
				if(id.equalsIgnoreCase(""))
				{
					fbtxt.setBackground(Color.red);
				}
			}
			else if(!(name.equalsIgnoreCase("")) && !(id.equalsIgnoreCase("")) && type.equalsIgnoreCase("Facebook"))
			{
				name=entxt.getText();
				id=fbtxt.getText();
				userdetails fbud= new userdetails(name,id);
				jfi.dispose();
				rules ru=new rules(fbud,type);
			}
			if(type.equalsIgnoreCase("Guest"))
			{
				userdetails gud= new userdetails(name,id);
				jfi.dispose();
				rules r=new rules(gud,type);
			}
		}
		else if(str.equalsIgnoreCase("Facebook"))
		{
			type="Facebook";
			fbid.setVisible(true);
			fbtxt.setVisible(true);
			inext.setVisible(true);
		}
		else if(str.equalsIgnoreCase("Guest"))
		{
			type="Guest";
			inext.setVisible(true);
			fbid.setVisible(false);
			fbtxt.setVisible(false);
		}
		
	}
}
