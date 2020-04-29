package Buttongame;

import java.io.*;
import java.util.*;

public class userdetails implements Serializable{

	String name;
	String fbid;
	int steps=0;
	userdetails(String nam,String id)
	{
		name=nam;
		fbid=id;
	}	
}
