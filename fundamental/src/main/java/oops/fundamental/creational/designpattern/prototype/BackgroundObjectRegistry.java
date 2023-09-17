package oops.fundamental.creational.designpattern.prototype;

import java.util.HashMap;
import java.util.Map;
//step 5 : create prototype registry
public class BackgroundObjectRegistry {

	 private Map<BackgroundObjectType, BackgroundObject> objects = new HashMap<>();

	    public void registerObject(BackgroundObject object) {
	        objects.put(object.getType(), object);
	    }

	    public BackgroundObject getObject(BackgroundObjectType type) {
	        return objects.get(type);
	    }
	    
}
