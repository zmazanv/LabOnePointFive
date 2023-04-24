package nature;

public class Pig extends Animal {
    public Pig() {
        super();
    }
    public Pig(String name, String foodConsumed) {
        super(name, foodConsumed);
    }
    @Override
    public void makeSound() {
        System.out.println("Oink");
    }
}
