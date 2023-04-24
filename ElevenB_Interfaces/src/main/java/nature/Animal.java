package nature;

public abstract class Animal {
    private String name;
    private String foodConsumed;
    public Animal() {
        this.name = "Unnamed";
        this.foodConsumed = "Unknown";
    }
    public Animal(String name, String foodConsumed) {
        StringBuilder nameTitled = new StringBuilder(name);
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                nameTitled.setCharAt(i, Character.toUpperCase(nameTitled.charAt(i)));
            } else {
                nameTitled.setCharAt(i, Character.toLowerCase(nameTitled.charAt(i)));
            }
        }
        this.name = nameTitled.toString();
        StringBuilder foodConsumedTitled = new StringBuilder(foodConsumed);
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                foodConsumedTitled.setCharAt(i, Character.toUpperCase(foodConsumedTitled.charAt(i)));
            } else {
                foodConsumedTitled.setCharAt(i, Character.toLowerCase(foodConsumedTitled.charAt(i)));
            }
        }
        this.foodConsumed = foodConsumedTitled.toString();
    }
    public String getName() {
        return this.name;
    }
    public String getFoodConsumed() {
        return this.foodConsumed;
    }
    public void setName(String name) {
        StringBuilder nameTitled = new StringBuilder(name);
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                nameTitled.setCharAt(i, Character.toUpperCase(nameTitled.charAt(i)));
            } else {
                nameTitled.setCharAt(i, Character.toLowerCase(nameTitled.charAt(i)));
            }
        }
        this.name = nameTitled.toString();
    }
    public void setFoodConsumed(String foodConsumed) {
        StringBuilder foodConsumedTitled = new StringBuilder(foodConsumed);
        for (int i = 0; i < name.length(); i++) {
            if (i == 0) {
                foodConsumedTitled.setCharAt(i, Character.toUpperCase(foodConsumedTitled.charAt(i)));
            } else {
                foodConsumedTitled.setCharAt(i, Character.toLowerCase(foodConsumedTitled.charAt(i)));
            }
        }
        this.foodConsumed = foodConsumedTitled.toString();
    }
    public void eat() {
        System.out.println(this.name + " has eaten " + this.foodConsumed.toLowerCase() + '.');
    }
    public abstract void makeSound();
}
