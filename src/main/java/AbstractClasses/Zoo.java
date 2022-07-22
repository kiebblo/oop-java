package AbstractClasses;

public class Zoo {
    public static void main(String[] args) {

        Flyable flyingBird = new Sparrow(1, "F", 5);
        flyingBird.fly();

        System.out.println("----------");
        Animal sparrow1 = new Sparrow(2,"M",1);
        //sparrow1.move();
        moveAnimal(sparrow1);

        System.out.println("----------");
        Animal fish1 = new Fish(1,"F",1);
        //fish1.move();
        moveAnimal(fish1);
    }

    public static void moveAnimal(Animal animal) {
        animal.move();
    }
}
