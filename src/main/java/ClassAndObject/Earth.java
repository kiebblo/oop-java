package ClassAndObject;

public class Earth {
    public static void main(String args[]){
        Human john;
        john = new Human();
        john.age = 15;
        john.eyeColor = "brown";
        john.height = 1.75;
        john.name = "John";

        john.speak();

        Human amy;
        amy = new Human();
        amy.age = 40;
        amy.eyeColor = "blue";
        amy.height = 1.65;
        amy.name = "Amy";

        amy.speak();
    }
}
