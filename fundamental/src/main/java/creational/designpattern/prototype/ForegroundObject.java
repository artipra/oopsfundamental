package creational.designpattern.prototype;

public class ForegroundObject implements GraphicalObject {

	@Override
	public ForegroundObject cloneObject() {
		return new ForegroundObject();
	}
	
	

}
