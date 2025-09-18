package ThreadDemo;

public class MyThreadMethOne extends Thread 
{ 
public void run()// overriding run method
 { 
System.out.println("thread is running..."); 
 } 
public static void main(String[] args) 
{ 
	MyThreadMethOne obj = new MyThreadMethOne ();
	//Thread obj = new Thread(new MyThreadMethOne ());
	obj.start();//calls the run()
 }
}
