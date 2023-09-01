public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Chloe",5,"Yellow", 10, "German Shepard");
        myDog.bark();
        myDog.eat();
        myDog.sleep();
        myDog.walk();
        myDog.sit();

        System.out.println("name: " + myDog.getName());
        System.out.println("age: " + myDog.getAge());
        System.out.println("color: " + myDog.getColor());
        System.out.println("breed: " + myDog.getBreed());
    }

}
