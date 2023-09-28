package Sept05;

import Sept05.Animal;

public class Fish extends Animal implements Swimmer{


    public Fish(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println("The fish " + name + " is swimming also");
    }

    @Override
    public void dive() {
        System.out.println("The fish " + name + " is diving also");
    }

    @Override
    public void makeSound() {
        setAge(5);
        System.out.println("Fish " + getName() + ": bloop bloop");
    }
}
