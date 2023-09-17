package oops.fundamental.creational.designpattern.abstractfactory;
//Step 2 - Create the concrete product classes
public class DarkButton extends Button{

	  private Double radius;

	    public DarkButton(Double border, Double radius) {
	        super(border);
	        this.radius = radius;
	    }

	    @Override
	    public void onClick() {
	        System.out.println("Round Btn was clicked!");
	    }

	    @Override
	    public void render() {
	        System.out.println("Rendered!");
	    }

}
