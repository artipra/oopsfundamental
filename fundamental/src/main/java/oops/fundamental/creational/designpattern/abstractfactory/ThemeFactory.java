package oops.fundamental.creational.designpattern.abstractfactory;

//Step 3 - Factory interface
public interface ThemeFactory {

	Button createButton(Double border, Double length, Double radius);

    Radio createRadio();
    
}
