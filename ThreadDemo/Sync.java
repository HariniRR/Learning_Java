package ThreadDemo;

class Table{  
	Synchronized printTable(int n){//method not synchronized
		for(int i=1;i<=5;i++){  
			System.out.println(n*i);  
			try{  
				Thread.sleep(400);  
			}
			catch(Exception e)
			{System.out.println(e);}
        	}
		}
	} 

class MyThread1 extends Thread{  
	Table t;  
	MyThread1(Table t)   {  
		this.t=t;     }  
	public void run(){  
		t.printTable(5);       
		}   
	}  


class MyThread2 extends Thread{  
	Table t;  
	MyThread2(Table t){  
		this.t=t;  }  
	public void run(){  
		t.printTable(100);  
		}  
	}

public class Sync {
	public static void main(String[] args) {
		Table obj = new Table();
		MyThread1 t1=new MyThread1(obj); 
		MyThread2 t2=new MyThread2(obj); 
		t1.start();  
		t2.start(); 
		// TODO Auto-generated method stub

	}

}


/*From Java 5 the package java.util.concurrent.locks contains several lock implementations.
Synchronization in java is the capability to control the access of multiple threads to any shared resource*/