package Buttongame;

 import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.*;

public class game implements ActionListener{

	JFrame jf;
	JPanel jp;
	JButton[] jb=new JButton[24];
	JButton exit,restart;
	JLabel txt,msg,win,pos;
	userdetails ud,wd;
	String type;
	int n=0,nosteps=0;
	JDialog jdg;
	ArrayList <userdetails> al=new ArrayList<userdetails>();
	game(userdetails detail,String ty)
	{
		ud=detail;
		type=ty;
		msg=new JLabel(ud.name+"\n"+"  you lost"+"\n"+"  try again");
		create();
	}
	public void create()
	{
		jf=new JFrame();
		jf.setSize(684,528);
		jf.setBounds(100, 100, 684, 526);
		jf.setLayout(null);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		txt=new JLabel();
		txt.setText("Make your move carefully");
		txt.setBounds(130,16,170,30);
		jf.add(txt);
		jp=new JPanel();
		jp.setBounds(121, 56, 367, 329);
		jf.add(jp);
		jp.setLayout(new GridLayout(6,4));
		jp.setSize(200, 200);
		for(int i=0;i<24;i++)
		{
			jb[i]=new JButton(""+(i+1));
			jp.add(jb[i]);
			jb[i].setVisible(true);
			jb[i].addActionListener(this);
		}
		exit= new JButton("EXIT");
		exit.setBounds(54, 424, 97, 25);
		jf.add(exit);
		exit.addActionListener(this);
		restart=new JButton("RE-START");
		restart.setBounds(478, 424, 97, 25);
		restart.addActionListener(this);
		jf.add(restart);
		jf.setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		
		String str=ae.getActionCommand();
		if(str.equalsIgnoreCase("EXIT"))
		{
			jf.dispose();
		}
		else if(str.equalsIgnoreCase("RE-START"))
		{
			jf.dispose();
			//jdg.dispose();
			rules r=new rules(ud,type);
		}
		if(str.equalsIgnoreCase("1"))
		{
			
			nosteps=nosteps+1;
			if(jb[1].isVisible())
			{
				n=n+1;
			}
			if(jb[4].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[1].setVisible(false);
				jb[4].setVisible(false);
				jb[0].setVisible(false);
				
			}
			if(n==1)
			{
				jb[0].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("2"))
		{
			nosteps=nosteps+1;
			if(jb[0].isVisible())
			{
				n=n+1;
			}
			if(jb[2].isVisible())
			{
				n=n+1;
			}
			if(jb[5].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[1].setVisible(false);
				jb[2].setVisible(false);
				jb[0].setVisible(false);
				jb[5].setVisible(false);
				
			}
			if(n==1)
			{
				jb[1].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("3"))
		{
			nosteps=nosteps+1;
			if(jb[1].isVisible())
			{
				n=n+1;
			}
			if(jb[6].isVisible())
			{
				n=n+1;
			}
			if(jb[3].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[1].setVisible(false);
				jb[3].setVisible(false);
				jb[6].setVisible(false);
				jb[2].setVisible(false);
				
			}
			if(n==1)
			{
				jb[2].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("4"))
		{
			nosteps=nosteps+1;
			if(jb[2].isVisible())
			{
				n=n+1;
			}
			if(jb[7].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[2].setVisible(false);
				jb[7].setVisible(false);
				jb[3].setVisible(false);
				
			}
			if(n==1)
			{
				jb[3].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("5"))
		{
			nosteps=nosteps+1;
			if(jb[0].isVisible())
			{
				n=n+1;
			}
			if(jb[5].isVisible())
			{
				n=n+1;
			}
			if(jb[8].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[0].setVisible(false);
				jb[5].setVisible(false);
				jb[8].setVisible(false);
				jb[4].setVisible(false);
				
			}
			if(n==1)
			{
				jb[4].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("6"))
		{
			nosteps=nosteps+1;
			if(jb[4].isVisible())
			{
				n=n+1;
			}
			if(jb[1].isVisible())
			{
				n=n+1;
			}
			if(jb[6].isVisible())
			{
				n=n+1;
			}
			if(jb[9].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[1].setVisible(false);
				jb[4].setVisible(false);
				jb[6].setVisible(false);
				jb[9].setVisible(false);
				jb[5].setVisible(false);
				
			}
			if(n==1)
			{
				jb[5].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("7"))
		{
			nosteps=nosteps+1;
			if(jb[2].isVisible())
			{
				n=n+1;
			}
			if(jb[10].isVisible())
			{
				n=n+1;
			}
			if(jb[5].isVisible())
			{
				n=n+1;
			}
			if(jb[7].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[10].setVisible(false);
				jb[2].setVisible(false);
				jb[5].setVisible(false);
				jb[6].setVisible(false);
				jb[7].setVisible(false);
				
			}
			if(n==1)
			{
				jb[6].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("8"))
		{
			nosteps=nosteps+1;
			if(jb[6].isVisible())
			{
				n=n+1;
			}
			if(jb[3].isVisible())
			{
				n=n+1;
			}
			if(jb[11].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[6].setVisible(false);
				jb[3].setVisible(false);
				jb[11].setVisible(false);
				jb[7].setVisible(false);
				
			}
			if(n==1)
			{
				jb[7].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		//
		if(str.equalsIgnoreCase("9"))
		{
			nosteps=nosteps+1;
			if(jb[9].isVisible())
			{
				n=n+1;
			}
			if(jb[4].isVisible())
			{
				n=n+1;
			}
			if(jb[12].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[12].setVisible(false);
				jb[4].setVisible(false);
				jb[9].setVisible(false);
				jb[8].setVisible(false);
				
			}
			if(n==1)
			{
				jb[8].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("10"))
		{
			nosteps=nosteps+1;
			if(jb[5].isVisible())
			{
				n=n+1;
			}
			if(jb[13].isVisible())
			{
				n=n+1;
			}
			if(jb[10].isVisible())
			{
				n=n+1;
			}
			if(jb[8].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[13].setVisible(false);
				jb[5].setVisible(false);
				jb[10].setVisible(false);
				jb[8].setVisible(false);
				jb[9].setVisible(false);
				
			}
			if(n==1)
			{
				jb[9].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("11"))
		{
			nosteps=nosteps+1;
			if(jb[11].isVisible())
			{
				n=n+1;
			}
			if(jb[9].isVisible())
			{
				n=n+1;
			}
			if(jb[14].isVisible())
			{
				n=n+1;
			}
			if(jb[6].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[11].setVisible(false);
				jb[14].setVisible(false);
				jb[9].setVisible(false);
				jb[6].setVisible(false);
				jb[10].setVisible(false);
				
			}
			if(n==1)
			{
				jb[10].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("12"))
		{
			nosteps=nosteps+1;
			if(jb[7].isVisible())
			{
				n=n+1;
			}
			if(jb[15].isVisible())
			{
				n=n+1;
			}
			if(jb[10].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[15].setVisible(false);
				jb[7].setVisible(false);
				jb[10].setVisible(false);
				jb[11].setVisible(false);
				
			}
			if(n==1)
			{
				jb[11].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		//
		if(str.equalsIgnoreCase("13"))
		{
			nosteps=nosteps+1;
			if(jb[13].isVisible())
			{
				n=n+1;
			}
			if(jb[16].isVisible())
			{
				n=n+1;
			}
			if(jb[8].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[13].setVisible(false);
				jb[16].setVisible(false);
				jb[8].setVisible(false);
				jb[12].setVisible(false);
				
			}
			if(n==1)
			{
				jb[12].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("14"))
		{
			nosteps=nosteps+1;
			if(jb[17].isVisible())
			{
				n=n+1;
			}
			if(jb[12].isVisible())
			{
				n=n+1;
			}
			if(jb[14].isVisible())
			{
				n=n+1;
			}
			if(jb[9].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[12].setVisible(false);
				jb[14].setVisible(false);
				jb[17].setVisible(false);
				jb[9].setVisible(false);
				jb[13].setVisible(false);
				
			}
			if(n==1)
			{
				jb[13].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("15"))
		{
			nosteps=nosteps+1;
			if(jb[10].isVisible())
			{
				n=n+1;
			}
			if(jb[18].isVisible())
			{
				n=n+1;
			}
			if(jb[15].isVisible())
			{
				n=n+1;
			}
			if(jb[13].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[13].setVisible(false);
				jb[15].setVisible(false);
				jb[18].setVisible(false);
				jb[10].setVisible(false);
				jb[14].setVisible(false);
				
			}
			if(n==1)
			{
				jb[14].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("16"))
		{
			nosteps=nosteps+1;
			if(jb[14].isVisible())
			{
				n=n+1;
			}
			if(jb[19].isVisible())
			{
				n=n+1;
			}
			if(jb[11].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[11].setVisible(false);
				jb[19].setVisible(false);
				jb[14].setVisible(false);
				jb[15].setVisible(false);
				
			}
			if(n==1)
			{
				jb[15].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		//
		if(str.equalsIgnoreCase("17"))
		{
			nosteps=nosteps+1;
			if(jb[20].isVisible())
			{
				n=n+1;
			}
			if(jb[17].isVisible())
			{
				n=n+1;
			}
			if(jb[12].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[17].setVisible(false);
				jb[20].setVisible(false);
				jb[12].setVisible(false);
				jb[16].setVisible(false);
				
			}
			if(n==1)
			{
				jb[16].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("18"))
		{
			nosteps=nosteps+1;
			if(jb[13].isVisible())
			{
				n=n+1;
			}
			if(jb[21].isVisible())
			{
				n=n+1;
			}
			if(jb[18].isVisible())
			{
				n=n+1;
			}
			if(jb[16].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[16].setVisible(false);
				jb[18].setVisible(false);
				jb[21].setVisible(false);
				jb[13].setVisible(false);
				jb[17].setVisible(false);
				
			}
			if(n==1)
			{
				jb[17].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("19"))
		{
			nosteps=nosteps+1;
			if(jb[22].isVisible())
			{
				n=n+1;
			}
			if(jb[14].isVisible())
			{
				n=n+1;
			}
			if(jb[19].isVisible())
			{
				n=n+1;
			}
			if(jb[17].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[14].setVisible(false);
				jb[22].setVisible(false);
				jb[19].setVisible(false);
				jb[17].setVisible(false);
				jb[18].setVisible(false);
				
			}
			if(n==1)
			{
				jb[18].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("20"))
		{
			nosteps=nosteps+1;
			if(jb[15].isVisible())
			{
				n=n+1;
			}
			if(jb[23].isVisible())
			{
				n=n+1;
			}
			if(jb[18].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[15].setVisible(false);
				jb[23].setVisible(false);
				jb[18].setVisible(false);
				jb[19].setVisible(false);
				
			}
			if(n==1)
			{
				jb[19].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("21"))
		{
			nosteps=nosteps+1;
			if(jb[16].isVisible())
			{
				n=n+1;
			}
			if(jb[21].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[21].setVisible(false);
				jb[16].setVisible(false);
				jb[20].setVisible(false);
				
			}
			if(n==1)
			{
				jb[20].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("22"))
		{
			nosteps=nosteps+1;
			if(jb[20].isVisible())
			{
				n=n+1;
			}
			if(jb[22].isVisible())
			{
				n=n+1;
			}
			if(jb[17].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[17].setVisible(false);
				jb[20].setVisible(false);
				jb[22].setVisible(false);
				jb[21].setVisible(false);
				
			}
			if(n==1)
			{
				jb[21].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("23"))
		{
			nosteps=nosteps+1;
			if(jb[21].isVisible())
			{
				n=n+1;
			}
			if(jb[18].isVisible())
			{
				n=n+1;
			}
			if(jb[23].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[21].setVisible(false);
				jb[23].setVisible(false);
				jb[18].setVisible(false);
				jb[22].setVisible(false);
				
			}
			if(n==1)
			{
				jb[22].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		
		if(str.equalsIgnoreCase("24"))
		{
			nosteps=nosteps+1;
			if(jb[22].isVisible())
			{
				n=n+1;
			}
			if(jb[19].isVisible())
			{
				n=n+1;
			}
			if(n>1)
			{
				jb[22].setVisible(false);
				jb[19].setVisible(false);
				jb[23].setVisible(false);
				
			}
			if(n==1)
			{
				jb[23].setVisible(false);
				
			}
			if(n==0)
			{
				lost();
			}
			n=0;
		}
		check();

	}
	public void lost()
	{
		nosteps=nosteps-1;
		if(type.equalsIgnoreCase("Guest"))
		{
			jdg=new JDialog(jf,"RESULT");
			jdg.add(msg);
			jdg.setSize(200, 200);
			jdg.setVisible(true);
		}
		else if(type.equalsIgnoreCase("Facebook"))
		{
			jdg=new JDialog(jf,"RESULT");
			jdg.add(msg);
			jdg.setSize(200,200);
			jdg.setVisible(true);
		}
	}
	public void check()
	{
		int ck=0;
		for(JButton bttn:jb)
		{
			if(bttn.isVisible())
			{
				ck=ck+1;
				break;
			}
		}
		if(ck==0)
		{
			ud.steps=nosteps;
			if(type.equalsIgnoreCase("Facebook")) {
			wd=result();
			if(wd.steps<ud.steps)
			{
				win=new JLabel(ud.name+" you won");
				jdg=new JDialog(jf,"RESULT");
				jdg.add(win);//pos
				jdg.setSize(200, 200);
				jdg.setVisible(true);
			}
			else
			{
				win=new JLabel(ud.name+" you won");
				win.setBounds(5, 5, 100, 100);
				pos=new JLabel("you took "+nosteps+" steps");
				pos.setBounds(5, 20, 100, 100);
				jdg=new JDialog(jf,"RESULT");
				jdg.add(win);
				jdg.add(pos);
				jdg.setSize(200, 200);
				jdg.setVisible(true);
			}
			}
			else
			{
				win=new JLabel(ud.name+" you won");
				win.setBounds(5, 5, 100, 100);
				pos=new JLabel("you took "+nosteps+" steps");
				pos.setBounds(5, 20, 100, 100);
				jdg=new JDialog(jf,"RESULT");
				jdg.add(win);
				jdg.add(pos);
				jdg.setSize(200, 200);
				jdg.setVisible(true);
			}
		}
	}
	public userdetails result()
	{
		try {
			FileOutputStream fi=new FileOutputStream("D:\\game.txt",true);
			//true means we are appending objects in files
			ObjectOutputStream ob=new ObjectOutputStream(fi);
			ob.writeObject(ud);
			ob.close();
			fi.close();
		}
		catch(IOException e)
		{
			//not handeled
		}
		try
		{
			boolean cont=true;
			FileInputStream fo=new FileInputStream("D:\\game.txt");
			ObjectInputStream oi=new ObjectInputStream(fo);
			while(cont){
                userdetails obj=null;
              try {
                  obj = (userdetails) oi.readObject();
              } catch (ClassNotFoundException e) {
                  e.printStackTrace();
              }
                if(obj != null)
                   al.add(obj);
                else
                   cont = false;
             }
		}
		catch(IOException e)
		{
			//not handeled
		}
		Collections.sort(al, new sortbysteps());
		return al.get(0);
		
	}
}
