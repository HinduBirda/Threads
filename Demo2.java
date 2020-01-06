package Threads;

public class Demo2 {

	public static void main(String[] args) {
		ThreadPriority t=new ThreadPriority();
		System.out.println(Thread.currentThread().getPriority());
		t.start();
		System.out.println(t.getPriority());
		t.setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(t.getPriority());
		System.out.println("hello");

	}

}
