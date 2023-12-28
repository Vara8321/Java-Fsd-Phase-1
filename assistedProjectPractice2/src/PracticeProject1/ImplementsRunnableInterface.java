package PracticeProject1;



class ThreadClass implements Runnable{
	Thread thread;
	String threadname;
	ThreadClass(String name){
		this.threadname=name;
		System.out.println("creating thread " + this.threadname);
	}
	public void run() {
		System.out.println("Running thread is " + this.threadname);
		try {
			for(int i=5;i>0;i--) {
				System.out.println("Thread name " + this.threadname + " " + i);
				Thread.sleep(50);
			}
		}catch(InterruptedException e) {
			System.out.println("thread is stopped");
		}
		System.out.println("Thread with thread name " + this.threadname + " exited ");
	}
	public void start() {
		System.out.println("starting thread with thread name: " + this.threadname);
		if(thread==null) {
			thread=new Thread(this,this.threadname);
			thread.start();
		}
	}
	
}

public class ImplementsRunnableInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass t1=new ThreadClass("thread 1");
		t1.start();
		ThreadClass t2=new ThreadClass("thread 2");
		t2.start();
		
	}
}
