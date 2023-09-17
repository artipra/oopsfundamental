package oops.fundamental.solid.bird.birdV2;


public class Runner {

	public static void main(String[] args) {
		
		Flyable e = new Eagle(1,"grey","L","sharp",BirdType.Eagle);
		Flyable p = new Parrot(1,"grey","L","sharp",BirdType.Parrot);
		NonFlyable pe = new Penguin(1,"grey","L","sharp",BirdType.Penguin);
        e.fly();p.fly();
	}

}
