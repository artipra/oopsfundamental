package oops.fundamental.solid.bird.birdV2;

//Now problem is special case, if pengiun has to extends bird and implement bird then it flaw in design
//solutions
//1 return null, return error but these are flaw in design
//2 Abstract class, interface - never tie the behaviour to hierachy 
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
        public void eat() {System.out.println("I eat");}
        public void sleep() {System.out.println("I sleep");}
}
