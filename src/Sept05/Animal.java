package Sept05;

public abstract class Animal {
    String name;
    int age;
    boolean gender;

    public Animal(String name) {
        this.name = name;
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
}
