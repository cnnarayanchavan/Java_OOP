package CLASSES;

public class StaticMethodOverriding {
    public static void main(String[] args) {
        A obj1 = new A();
        obj1.printInfo();
        
    }
}

class A {
    
    private void printInfo(){
        System.out.println("i am in method A!");
    }
    
    public void printConfig(){
        System.out.println("i am in Config A!");
    }
}

class B extends A {

    @Override
    public void printConfig(){
        System.out.println("i am in Config B!");
    }
    
   private void printInfo(){
        System.out.println("i am in method B!");
    }
}
