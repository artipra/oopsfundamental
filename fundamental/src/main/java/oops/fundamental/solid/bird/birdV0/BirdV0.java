package oops.fundamental.solid.bird.birdV0;

//SRP
public class BirdV0 {
    private Integer weight;
    private String colour;
    private String size;
    private String beakType;
    private BirdType type;
//OCP --- modified the existing class prone to bug in existing functionality, class explosive  
    public void fly() {
        if (type == BirdType.Eagle) {
            System.out.println("Eagle is flying");
        } else if (type == BirdType.Penguin) {
            System.out.println("Penguin is swimming");
        } else if (type == BirdType.Parrot) {
            System.out.println("Parrot is flying");
        }
    }
}