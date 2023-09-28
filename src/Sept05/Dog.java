package Sept05;

public class Dog extends Mammal{
    String breed;


    public Dog(String name,int age, String breed) {
        super(name, age);
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
