package Threads;

public class PrintRunnable implements Runnable{

	private String name;
	private int length;
	public PrintRunnable(String str, int length)
	{
		this.name = str;
		this.length = length;
	}
	public void run()	
	{
	System.out.println(name+" started");
	for (int i=0; i<length; i++)
	{
		try{Thread.sleep(1000);}catch(Exception e){}
	}
	System.out.println(name+" completed");
	}
}