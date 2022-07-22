package AbstractClasses;

public class Fish extends Animal {
    public Fish(int age, String gender, int weight) {
        super(age, gender, weight);
    }

    public void move() {
        System.out.println("The fish is swimming...");
    }

    public void swim(){
        System.out.println("swimming...");
    }
}
