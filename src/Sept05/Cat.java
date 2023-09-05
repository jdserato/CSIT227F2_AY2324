package Sept05;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Cat";
    }
}
