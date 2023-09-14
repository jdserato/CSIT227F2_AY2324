package Aug31;

import Sept05.Animal;

public class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        setAge(5);
        System.out.println("Fish " + getName() + ": bloop bloop");
    }
}
