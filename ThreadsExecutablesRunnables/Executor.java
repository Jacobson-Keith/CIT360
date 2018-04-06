package Threads;
import java.util.concurrent.*;

public class Executor {

	public static void main(String args[])
	{
		ExecutorService pool = Executors.newFixedThreadPool(3);
		PrintRunnable []vec = { 
						new PrintRunnable("Margoux", 1),
				        new PrintRunnable("Theo"   , 2),
						new PrintRunnable("Oliver" , 3),
						new PrintRunnable("Sophia" , 4),
						new PrintRunnable("Morgane", 23),
						new PrintRunnable("Keith"  , 28)
							};
		for(int i=0; i<vec.length; i++)
		{
			pool.submit(vec[i]);
		}	
	}
}