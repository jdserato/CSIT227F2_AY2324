package Sept05;

public class Bird extends Animal{


    public Bird(String name, int age) {
        super(name, age);
    }

    void fly() {
        System.out.println("Bird " + name + " is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird " +name + ": X x");
    }
}
