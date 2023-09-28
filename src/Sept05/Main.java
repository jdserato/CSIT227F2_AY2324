package Sept05;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        Collections.sort(numbers);
        Collections.reverse(numbers);
        for (Integer i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println();

        Dog blacky = new Dog("Blacky", 10, "Askal");
        System.out.println(blacky);
        blacky.setBreed("Askal");
        System.out.println(blacky.getBreed());
        Cat neko = new Tiger("Siomeow", 8);
        System.out.println(neko);
        neko.makeSound();
        Animal browny = new Dog("Browny", 2, "Hotdog");
//        System.out.println(browny.getBreed());
        browny.makeSound();
        Tiger lion = new Tiger("Lion", 40);
        System.out.println(lion);
        Animal nemo = new Fish("Nemo", 5);
        Swimmer pengwing = new Penguin("Pengwing", 1);
        System.out.println(((Animal)pengwing).getName());
        lion.makeSound();
        Diver fishball = new Whale("Fishball", 500);
        Bird tweety = new Bird("Tweety", 21);

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(nemo);
        animals.add((Animal) fishball);
        animals.add(lion);
        animals.add((Animal) pengwing);
        animals.add(blacky);
        animals.add(neko);
        animals.add(tweety);
        animals.add(browny);
        // uses the comparable
//        Collections.sort(animals);
        // uses the comparator
//        animals.sort(new Animal.AnimalNameComparator());
        animals.sort(new Animal.AnimalAgeComparator());
        System.out.println("ANIMALS SWIMMING HERE:");
        for (Animal a : animals) {
            System.out.println(a);
//            a.makeSound();
//            if (a instanceof Swimmer) {
//                ((Swimmer) a).swim();
//                ((Swimmer) a).dive();
//            }
        }
        System.out.println("ANIMALS DIVING HERE:");
        for (Animal a : animals) {
//            a.makeSound();
            if (a instanceof Diver) {
                ((Diver) a).dive(100);
            }
        }
    }
}
