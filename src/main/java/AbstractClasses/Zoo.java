package AbstractClasses;

public class Zoo {
    public static void main(String[] args) {
        Bird bird1 = new Bird(1,"F", 6);
        bird1.info();
        bird1.eat();
        System.out.println("----------");

        Chicken chicken1 = new Chicken(1,"F",2);
        chicken1.eat();
        System.out.println("----------");

        Sparrow sparrow1 = new Sparrow(2,"M",1);
        sparrow1.eat();
        sparrow1.fly();
        System.out.println("----------");
    }
}
