package creational.designpattern.prototype;
// game tree example
//step 1  create cloneable interface
//step 2  create implementation cloneable interface
//step 3  create prototype object
//step 4  modify prototype object
//step 5 - might be immediately not required prototype object but later required so create prototype 
//registery and get later when required


public class Runner {

	public static void main(String[] args) {
	        // Step 3 - Create a prototype object
	        BackgroundObject prototype = new BackgroundObject(100, 200, 100, 200, BackgroundObjectType.TREE);
	        BackgroundObject clone = prototype.cloneObject();
            // step 4 modify the clone object
	        clone.setX(200);
	        clone.setY(300);
	    }

	   
	    public void testCloneObjectWithRegistry() {

	        // Initialise registry
	        BackgroundObjectRegistry registry = new BackgroundObjectRegistry();

	        // Step 4 - Create a prototype object
	        BackgroundObject prototype = new BackgroundObject(100, 200, 100, 200, BackgroundObjectType.TREE);
	        registry.registerObject(prototype);

	        BackgroundObject clone = registry.getObject(BackgroundObjectType.TREE).cloneObject();

	        clone.setX(200);
	        clone.setY(300);
	    }

	

}
