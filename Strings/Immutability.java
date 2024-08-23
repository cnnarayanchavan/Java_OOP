package Strings;

public class Immutability {
    public static void main(String[] args) {
        String name = "naru";
        String name2 = "Chavan";
        String name3 = "naru";
        
        System.out.println(name == name2);
        System.out.println(name == name3 );
    }
}
