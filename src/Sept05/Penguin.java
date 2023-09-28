package Sept05;

public class Penguin extends Bird implements Swimmer{


    public Penguin(String name, int age) {
        super(name, age);
    }

    public void swim() {
        System.out.println("Penguin " + name + " is swimming yey");
    }

    @Override
    public void dive() {
        System.out.println("Penguin " + name + " is diving shallow yey");
    }
}
