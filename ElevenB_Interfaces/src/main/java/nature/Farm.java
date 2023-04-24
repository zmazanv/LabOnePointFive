package nature;

public class Farm {
    public static void main(String[] args) {
        Animal cerdo = new Pig("cerdo", "rastrojo");
        Animal pato = new Duck("pato", "semilla");

        cerdo.eat();
        cerdo.makeSound();
        System.out.println(cerdo.getName());
        System.out.println(cerdo.getFoodConsumed());

        pato.eat();
        pato.makeSound();
        System.out.println(pato.getName());
        System.out.println(pato.getFoodConsumed());
    }
}
