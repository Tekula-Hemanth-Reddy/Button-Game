package Buttongame;

import java.util.Comparator;

public class sortbysteps implements Comparator<userdetails> {

	
	public int compare(userdetails ud1, userdetails ud2) {
		if(ud1.steps<ud2.steps)
		{
			return -1;
		}
		if(ud1.steps>ud2.steps)
		{
			return 1;
		}
		return 0;
	}

}
