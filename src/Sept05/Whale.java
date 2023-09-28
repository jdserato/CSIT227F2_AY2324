package Sept05;

public class Whale extends Mammal implements Swimmer, Diver {


    public Whale(String name, int age) {
        super(name, age);
    }


    @Override
    public void makeSound() {
        System.out.println("Whale " + name + ": WooooOOOOOooo");
    }

    @Override
    public void swim() {
        System.out.println("Whale " + name + " is happily swimming.");
    }

    @Override
    public void dive() {
        System.out.println("Whale " + name + " is happily diving.");
    }

    @Override
    public void dive(int meters) {
        System.out.println("Whale " + name + " is happily diving "+ meters + " down out of " + max_meters);
    }
}
