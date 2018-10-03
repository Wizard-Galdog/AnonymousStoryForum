package model;

import java.util.ArrayList;

public class UserMessages extends SmartSerializable
{
	private static final long serialVersionUID = 1L;
	
	public long TimeStamp;
	
	public String Username;
	public ArrayList <String> messagesSent = new ArrayList<String>();
	public ArrayList <String> messagesRecieved = new ArrayList<String>();
	

}
