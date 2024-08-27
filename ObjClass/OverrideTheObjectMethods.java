package ObjClass;

public class OverrideTheObjectMethods {
    public static void main(String[] args){
        //object of class Laptop
        Laptop mac = new Laptop();
        mac.Model = "Imacbook";
        mac.price = 5886;
        System.out.println(mac.toString());
    }
}

class Laptop {
    String Model;
    int price;

    public void m1 () {
        System.out.println("I am a advance laptop..");
    }

    //but as by default all the classes in java extendes main Object class so we can have our own implimentation of Objects methods
    @Override
    public String toString () {
        return Model+" : "+price;
    }
}
