package Sept05;

import java.util.Comparator;

public abstract class Animal implements Comparable<Animal>{
    String name;
    int age;
    boolean gender;

    @Override
    public int compareTo(Animal other) {
        return this.name.compareTo(other.name);
    }
//    public Animal(String name) {
//        this.name = name;
//    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    protected void setAge(int age) {
        if (age > 0 && age < 150) {
            this.age = age;
        }
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

    public abstract void makeSound();

    public static class AnimalNameComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return o2.name.compareTo(o1.name);
        }
    }

    public static class AnimalAgeComparator implements Comparator<Animal> {
        @Override
        public int compare(Animal o1, Animal o2) {
            return Integer.compare(o1.age, o2.age);
        }
    }
}
