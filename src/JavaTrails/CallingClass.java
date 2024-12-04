package JavaTrails;

public class CallingClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        dog.speak();
        animal.speak();
    }
}
