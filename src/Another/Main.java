package Another;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(3);
//        System.out.println(integers.get(5));

        Person p = null;
        System.out.println(p.getName());
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
        } catch (FileNotFoundException e) {
//
        }
        Scanner sc = new Scanner(System.in);
        Person vince = new Person();
        System.out.print("Name: ");
//        vince.name = sc.nextLine();
//        String str_age = sc.nextLine();
//        int age = Integer.parseInt(str_age);
        boolean okay = false;
        do {
            System.out.print("Age: ");
            try {
                int age = sc.nextInt();
                System.out.println("Success in parsing");
                vince.setAge(age);
                System.out.println("Success in setting age");
//                int array[] = {1,2,3};
//                int b = array[5];
//                int a = 13/0;
                okay = true;
            } /*catch (InputMismatchException e) {
                System.out.println("I caught an InputMismatch");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println("Before");
                System.err.println(e.getMessage());
                System.err.println("After");
            } */catch (Exception e) {
                if (e instanceof InputMismatchException) {
                    System.out.println("I caught an InputMismatch");
                } else if (e instanceof IllegalArgumentException) {
                    System.err.println(e.getMessage());
                }
                e.printStackTrace();
                sc.nextLine();
            } catch (Error e) {
                System.err.println("CAUGHT AN ERROR");
            }
        } while (!okay);
//        System.out.println(vince.name + "'s age is " + vince.age);
//        vince.eat();
//        vince.eat("Ginaling");
//        vince.eat(5, "Ice Cream");
//        vince.eat( "Burger", 20);
//        vince.age = 100;

        System.out.println("My age: " + vince.getAge());
    }
}
