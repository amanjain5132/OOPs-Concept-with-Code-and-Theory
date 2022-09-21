package Inheritance;

public class Animal// Inheritance //first we will create a Single inheritance
{
    void eat()
    {
        System.out.println("i am Eating...");
    }
}
class Dog extends Animal {
    void Bark() {
        System.out.println("i am Dog and i Am Barking...");
    }
}
class TestInheritance{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.Bark();
        d.eat();
        }
}

//When a class inherits another class, it is known as a single inheritance.
// In the example given below, Dog class inherits the Animal class, so there is the single inheritance.