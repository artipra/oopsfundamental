package creational.designpattern.simplefactory;


// Simple factory design pattern implementation
// create factory for button object, still OCP is voliated as open for modification if new screensize come later.
// need to provide unwanted parameter for different button as createButton method is only one.
public class Runner {

	public static void main(String[] args) {
		        Button button = ButtonFactory.createButton(ScreenSize.PHONE, 10.0, 1.0, null);
		        Button button1 = ButtonFactory.createButton(ScreenSize.DESKTOP, 10.0, null, 10.0);
	}

}
