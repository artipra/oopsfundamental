package oops.fundamental.solid.bird.birdV1;

import oops.fundamental.solid.bird.birdV0.BirdType;

public class Runner {

	public static void main(String[] args) {
		
		Eagle e = new Eagle(1,"grey","L","sharp",BirdType.Eagle);
		Parrot p = new Parrot(1,"grey","L","sharp",BirdType.Parrot);
        e.fly();p.fly();
	}

}
