package creational.designpattern.singleton;

public class Runner {

	public static void main(String[] args) {
		 for(int i=0; i<100; i++) {
		 Thread t1 = new Thread(() -> {System.out.println("Thread1 " +SingletonV1.getInstance().hashCode());});
		 Thread t2 = new Thread(() -> {System.out.println("Thread2 " +SingletonV1.getInstance().hashCode());});
		 t1.start();t2.start();
		 Thread t3 = new Thread(() -> {System.out.println("Thread3 " +SingletonV1.getInstance().hashCode());});
		 t3.start();
		 }
	}

	
	 
	
}
