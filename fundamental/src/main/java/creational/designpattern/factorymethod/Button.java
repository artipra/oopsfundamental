package creational.designpattern.factorymethod;
//opc voliation
//// Step 1 - Create a common product interface
public abstract class Button {

	
	private Double border;
	
	Button(double border){this.border=border;}

    public abstract void render();

    public abstract void onClick();
    
}
