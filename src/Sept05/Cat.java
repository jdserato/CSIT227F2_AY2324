package Sept05;

public class Cat extends Mammal{


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Cat";
    }

    @Override
    public void makeSound() {
        setAge(9);
        System.out.println("Cat " + name + ": MEow");
    }
}
