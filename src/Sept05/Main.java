package Sept05;

public class Main {
    public static void main(String[] args) {
        Dog blacky = new Dog("Blacky");
        System.out.println(blacky);
        blacky.setBreed("Askal");
        System.out.println(blacky.getBreed());
        Cat neko = new Cat("Siomeow");
        System.out.println(neko);
        Dog browny = new Dog("Browny", "Hotdog");
        System.out.println(browny.getBreed());
        Tiger lion = new Tiger("Lion");
        System.out.println(lion);
    }
}
