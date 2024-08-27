package ObjClass;

public class HavingReferenceOfSubclass {
    public static void main(String[] args) {
        // B obj1 = new B();
        // obj1.show();

       

    }
}
 
class A {
    public void show(){
        System.out.println("I am in show A");
    }
}

class B extends A {
    // public void show(){
    //     System.out.println("I am in show B");
    // }
}
