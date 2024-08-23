package CLASSES.AbstractClasses.AbsJava;

public class Main {
    public static void main(String[] args) {
        // A.printInfor();
        // B.printInfor();
        A obj1 = new B();
    }
}

abstract class A{

    public static void printInfor(){
        System.out.println("I am a static and default method from class 'A' ");
    }

    public void inConfig(){
        System.out.println("i am in config 'A'");
    }

    //so we can have the constructor of abstract classes 
    public A(){
        System.out.println("This is random check for the constrctor of abstract class");
    }

    public A(String name){
        System.out.println("My name is: "+name);
    }
}

class B extends A{

    public static void printInfor(){
        System.out.println("I am a static and default method from class 'B' ");
    }

    public void inConfig(){
        System.out.println("i am in config 'B'");
    }

    public B (int num){
        super("Narayana");
        System.out.println("I am in class 'B': "+num);
    }

    public B () {
        this(89);
        System.out.println("I am a default behaviour!!");

    }
}

