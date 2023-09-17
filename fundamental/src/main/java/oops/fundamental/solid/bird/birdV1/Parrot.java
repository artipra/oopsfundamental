package oops.fundamental.solid.bird.birdV1;
import oops.fundamental.solid.bird.birdV0.BirdType;

public class Parrot extends Bird{
    
	Parrot(Integer weight,String colour,String size,String beakType,BirdType type ){
		super(weight,colour,size,beakType,type);
	}

    public void fly() {
            System.out.println("Parrot is flying");
    }
    
    
}