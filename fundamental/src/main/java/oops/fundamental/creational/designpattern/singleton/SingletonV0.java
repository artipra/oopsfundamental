package oops.fundamental.creational.designpattern.singleton;


// Not Thread safe and not implement singleton correctly instance variable should be check before creating
public class SingletonV0 {

	static SingletonV0 instance = new SingletonV0();
	private SingletonV0() {}
	
	public static SingletonV0 getInstance() {
		return instance;
	}
	
}
