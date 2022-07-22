package Interfaces;

public class Animal {
    int age;
    String gender;
    int weight;

    public Animal(int age, String gender, int weight){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public void eat(){
        System.out.println("Hello, the animal age is : " + age + " years old.");
        System.out.println("The gender is : " + gender + ".");
        System.out.println("The registered weight is : " + weight + " pounds.");
        System.out.println("The animal is eating...");
    }

    public void sleep(){
        System.out.println("The animal is sleeping...");
    }
}
