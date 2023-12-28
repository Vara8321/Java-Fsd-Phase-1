package PracticeProject1;

public class ExtendingThreadClass extends Thread {
	public void run()
 	{
  		System.out.println("concurrent thread started running..");
  			for(int i=0;i<10;i++) {
  				System.out.println(Thread.currentThread().getName() + " i="+i);
  				
  				try {
  					Thread.sleep(100);
  				} catch (InterruptedException e) {				
  				}
  		}
}
 	public static void main( String args[] )
 	{
 		ExtendingThreadClass mt = new  ExtendingThreadClass();
 		mt.setName("city");
  		mt.start();
 	}

}
