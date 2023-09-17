package oops.fundamental.solid.bird.birdV2;


public class Penguin extends Bird implements NonFlyable{

	Penguin(Integer weight, String colour, String size, String beakType, BirdType type) {
		super(weight, colour, size, beakType, type);
	}

}
