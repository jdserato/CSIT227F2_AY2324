package Sept05;

public class Tiger extends Cat {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return super.toString() + " is a Tiger";
    }
}
