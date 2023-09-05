package Another;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person vince = new Person();
        System.out.print("Name: ");
        vince.name = sc.nextLine();
        System.out.print("Age: ");
        vince.setAge(sc.nextInt());
//        System.out.println(vince.name + "'s age is " + vince.age);
        vince.eat();
        vince.eat("Ginaling");
        vince.eat(5, "Ice Cream");
        vince.eat( "Burger", 20);
//        vince.age = 100;
        System.out.println(vince.getAge());
    }
}
