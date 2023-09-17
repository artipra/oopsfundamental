package creational.designpattern.singleton;


// thread safe and double locking check
public class SingletonV2 {

	static SingletonV2 instance = null;
	private SingletonV2() {}
	
	public static SingletonV2 getInstance() {
		if(instance == null) {
			synchronized(SingletonV2.class) {
				if(instance == null)
					instance = new SingletonV2();
			}
		}
		return instance;
	}
	
}
