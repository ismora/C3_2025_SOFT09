public class Animal {
    private String name;
    public Animal(String name) {
        this.name = name;
    }
    public void speak() {
        System.out.println(name + " makes a sound.");
    }
}
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}