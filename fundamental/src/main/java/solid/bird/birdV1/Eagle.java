package solid.bird.birdV1;
import solid.bird.birdV0.BirdType;

public class Eagle extends Bird{
    
	Eagle(Integer weight,String colour,String size,String beakType,BirdType type ){
		super(weight,colour,size,beakType,type);
	}

    public void fly() {
            System.out.println("Eagle is flying");
    }
    
    
}