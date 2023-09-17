package oops.fundamental.creational.designpattern.abstractfactory;
//Step 2 - Create the concrete product classes
public class LightButton extends Button{
	
	private Double length;
	
	 public LightButton(Double border, Double length) {
	        super(border);
	        this.length = length;
	    }

	    public void onClick() {
	        System.out.println("Square Btn was clicked!");
	    }

	    public void render() {
	        System.out.println("Rendered!");
	    }
}
