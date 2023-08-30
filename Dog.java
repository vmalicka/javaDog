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
        this. breed = breed;
    }

    // methods
    public void bark(){
        System.out.println(name + " says: bark!");
    }



}
