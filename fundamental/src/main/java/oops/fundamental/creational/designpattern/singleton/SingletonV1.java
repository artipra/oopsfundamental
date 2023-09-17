package oops.fundamental.creational.designpattern.singleton;


// Not Thread safe & implement singleton correctly
public class SingletonV1 {

	static SingletonV1 instance = null;
	private SingletonV1() {}
	
	public static synchronized SingletonV1 getInstance() {
		if(instance == null) instance = new SingletonV1();
		return instance;
	}
	
}
