package creational.designpattern.factorymethod;
//Step 2 - Create the concrete product classes
public class SquareButton extends Button{
	
	private Double length;
	
	 public SquareButton(Double border, Double length) {
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
