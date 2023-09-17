package solid.bird.birdV2;

import solid.bird.birdV0.BirdType;

public class Penguin extends Bird implements NonFlyable{

	Penguin(Integer weight, String colour, String size, String beakType, BirdType type) {
		super(weight, colour, size, beakType, type);
	}

}
