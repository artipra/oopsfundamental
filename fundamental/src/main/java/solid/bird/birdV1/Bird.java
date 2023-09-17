package solid.bird.birdV1;

import solid.bird.birdV0.BirdType;

public abstract class Bird {

	   private Integer weight;
	    private String colour;
	    private String size;
	    private String beakType;
	    private BirdType type;
	    
	    Bird(Integer weight,String colour,String size,String beakType,BirdType type ){
	    	this.weight = weight;
	    	this.colour = colour;
	    	this.size = size;
	    	this.beakType = beakType;
	    	this.type = type;
		}

	    public abstract void fly();
	    
}
