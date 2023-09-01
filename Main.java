public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Chloe", 5, "Yellow", 70, "German Shepard");
        myDog.bark();
        myDog.eat();
        myDog.sleep();
        myDog.walk();
        myDog.sit();

        System.out.println("name: " + myDog.getName());
        System.out.println("age: " + myDog.getAge());
        System.out.println("color: " + myDog.getColor());
        System.out.println("breed: " + Breed.Shepard);


        Dog myDog2 = new Dog("Scoobie",3,"Orange", 10, "Lab Mix");
        myDog2.bark();
        myDog2.eat();
        myDog2.sleep();
        myDog2.walk();
        myDog2.sit();

        System.out.println("name: " + myDog2.getName());
        System.out.println("age: " + myDog2.getAge());
        System.out.println("color: " + myDog2.getColor());
        System.out.println("breed: " + Breed.Lab);

        Dog myDog3 = new Dog("Hidie",7,"Black and White", 30, "Huskey");
        myDog3.bark();
        myDog3.eat();
        myDog3.sleep();
        myDog3.walk();
        myDog3.sit();

        System.out.println("name: " + myDog3.getName());
        System.out.println("age: " + myDog3.getAge());
        System.out.println("color: " + myDog3.getColor());
        System.out.println("breed: " + Breed.Husky);

    }

}
