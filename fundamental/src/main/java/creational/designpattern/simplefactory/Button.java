package creational.designpattern.simplefactory;
//scp + opc voliation
//complex code construction
//reduce usage of subclass

public abstract class Button {

	
	private Double border;
	
	Button(double border){this.border=border;}

    public abstract void render();

    public abstract void onClick();
    
}
