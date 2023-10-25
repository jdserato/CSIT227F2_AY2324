package Another;

public class Person {
    public static final int AGE_OF_DEATH = 100;
    // FIELDS
    protected String name;
    String eye_color;
    private int age;
    public static int number_of_people=0;

    public Person() {
        age = 5;
    }

    public Person(String name){
        this(name, 5);
    }



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // METHODS
    // GETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    // SETTER
    public void setAge(int age) {
        setAge(age);
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be less than zero.");
        }
        if (age > 150) {
            throw new IllegalArgumentException("Age cannot be greater than 150.");
        }
        this.age = age;
    }
    void eat() {
        System.out.println(name + " is eating");
    }
    // Method Overloading
    void eat(String food) {
        System.out.println(name + " is eating " + food);
    }
    void eat(String food, int quantity) {
        System.out.println(name + " is eating " + food + " " + quantity + " times");
    }
    void eat(int carbs, String food) {
        System.out.println(name + " is eating " + food + " that has "+ carbs + " calories");
    }
}
