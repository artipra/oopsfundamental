package oops.fundamental.solid.bird.birdV2;

public class Parrot extends Bird implements Flyable{
    
	Parrot(Integer weight,String colour,String size,String beakType,BirdType type ){
		super(weight,colour,size,beakType,type);
	}

    public void fly() {
            System.out.println("Parrot is flying");
    }
    
    
}