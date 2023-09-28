package Sept05;

public class Tiger extends Cat {


    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Tiger";
    }
}
