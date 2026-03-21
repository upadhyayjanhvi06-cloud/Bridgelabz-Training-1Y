package Inheritence;

public class Main {
    public static void main(String args[]){
        Dog d=new Dog();
        d.name="Maxx";
        d.age=2;
        d.makeSound();
        Cat c= new Cat();
        c.name="kitty";
        c.age=3;
        c.makeSound();
        Bird b=new Bird();
        b.name="piku";
        b.age=1;
        b.makeSound();
    }
}
