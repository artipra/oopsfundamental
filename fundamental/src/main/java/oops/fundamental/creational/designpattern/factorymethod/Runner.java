package oops.fundamental.creational.designpattern.factorymethod;


// factory method design pattern implementation
// create factory method for button object, class explosion as creating factoy for every button type.
// need to provide unwanted parameter for different button as createButton method is only one.
public class Runner {

	public static void main(String[] args) {
		        ButtonFactory buttonFactory = new RoundButtonFactory();
		        Button button = buttonFactory.createButton(10.0, 0.4, null);

	}

}
