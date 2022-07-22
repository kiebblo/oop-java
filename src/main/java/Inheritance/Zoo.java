package Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal1 = new Animal(12, "M", 450);
        animal1.eat();

        Bird bird1 = new Bird(1,"F", 6);
        bird1.fly();
        bird1.eat();

        Fish fish1 = new Fish(16,"M",15);
        fish1.swim();
        fish1.eat();
    }
}
