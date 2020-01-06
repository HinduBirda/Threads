package Threads;

public class Demo {

	public static void main(String[] args) {
				ExtendingThreadClass obj=new ExtendingThreadClass();
				obj.start();
				for(int i=0;i<3;i++){
					System.out.println("hi");
				}
			}
	
			

	}

