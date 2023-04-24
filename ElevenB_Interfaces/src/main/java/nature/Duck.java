package nature;

public class Duck extends Animal {
    public Duck() {
        super();
    }
    public Duck(String name, String foodConsumed) {
        super(name, foodConsumed);
    }
    @Override
    public void makeSound() {
        System.out.println("Quack");
    }
}
