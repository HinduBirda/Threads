package Threads;

public class Demo1 {

	public static void main(String[] args) {
		ImplementingRunnableInterface obj=new ImplementingRunnableInterface();
		Thread t1=new Thread(obj);
		t1.start();

	}

}
