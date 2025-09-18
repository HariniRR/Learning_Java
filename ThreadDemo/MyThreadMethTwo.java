package ThreadDemo;

public class MyThreadMethTwo extends Thread {
	  public void run() 
	  { 
	 System.out.println("thread is running..");
	  } 
	 public static void main(String[] args) 
	 { 
	 MyThreadMethTwo t = new MyThreadMethTwo (); 
	 t.start(); 
	 }
}
