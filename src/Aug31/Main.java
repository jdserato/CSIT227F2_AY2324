package Aug31;

import Another.Person;

public class Main {
    public static void main(String[] args) {
        Person cherry = new Person();
        Person person = new Person();
        Person leah = new Person("Leah"), cathy = new Person("Catherine", 1);
//        person.name = "Hi";
        cherry.setName("Cherry");
        cherry.setAge(25);
        person.setAge(30);
        Person.number_of_people = 5;
        System.out.println(leah.getName());
        System.out.println(leah.getAge());
        System.out.println(cathy.getName());
        System.out.println(cathy.getAge());
        System.out.println(person.getAge());
        System.out.println(cherry.getAge());
        System.out.println(person.number_of_people);
    }
}
