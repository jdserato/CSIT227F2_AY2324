package Sept05;

import Aug31.Fish;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Dog blacky = new Dog("Blacky");
        System.out.println(blacky);
        blacky.setBreed("Askal");
        System.out.println(blacky.getBreed());
        Cat neko = new Cat("Siomeow");
        System.out.println(neko);
        neko.makeSound();
        Animal browny = new Dog("Browny", "Hotdog");
//        System.out.println(browny.getBreed());
        browny.makeSound();
        Tiger lion = new Tiger("Lion");
        System.out.println(lion);
        Fish nemo = new Fish("Nemo");
        lion.makeSound();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(nemo);
        animals.add(lion);
        animals.add(blacky);
        animals.add(browny);
        animals.add(neko);
        System.out.println("ANIMALS MAKING SOUNDS HERE:");
        for (Animal a : animals) {
            a.makeSound();
            if (a instanceof Dog) {
                Dog d = (Dog) a;
                System.out.println("Breed of " +a.getName() + " is " + d.getBreed());
            }
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                System.out.println(c.getName() + " is a good cat");
            }
        }
    }
}
