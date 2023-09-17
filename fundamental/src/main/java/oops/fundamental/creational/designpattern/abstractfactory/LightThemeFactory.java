package oops.fundamental.creational.designpattern.abstractfactory;

//Step 4 - Create concrete factory classes
public class LightThemeFactory implements ThemeFactory {
 @Override
 public Button createButton(Double border, Double length, Double radius) {
     return new LightButton(border, length);
 }

 @Override
 public Radio createRadio() {
     return new LightRadio();
 }
}