public class Dog {

    // Properties
    private String name;
    private int age;
    private String color;
    private int weight;
    private String breed;


    //constructor
    public Dog(String name, int age, String color, int weight, String breed){
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.breed = breed;
    }

    // methods
    public void bark(){
        System.out.println(name + " says: bark!");
    }

    public void sleep() {
        System.out.println(name + " is sleeping.");
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public void walk() {
        System.out.println(name + " is walking.");
    }

    public void sit() {
        System.out.println(name + " is sitting.");
    }

    // getters and setters
    public String getName()  {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge()  {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor()  {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight()  {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // main method (for testing)
    public static void main(String[] args) {
        Dog myDog = new Dog("Chloe",5,"Yellow");
        myDog.bark();
        myDog.eat();
        myDog.sleep();
        myDog.walk();
        myDog.sit();
    }



}
