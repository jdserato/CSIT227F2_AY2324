package Sept05;

public class Dog extends Animal{
    String breed;
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void makeSound() {
        System.out.println("Dog " + name + ": Arf Arf");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
