package oops.fundamental.solid.bird.birdV2;

public class Eagle extends Bird implements Flyable{
    
	Eagle(Integer weight,String colour,String size,String beakType,BirdType type ){
		super(weight,colour,size,beakType,type);
	}

    public void fly() {
            System.out.println("Eagle is flying");
    }
    
    
}