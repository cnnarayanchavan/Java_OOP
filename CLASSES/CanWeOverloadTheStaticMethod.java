package CLASSES;

public class CanWeOverloadTheStaticMethod {
    public static void main(String[] args) {
        Calculator obj1 = new Calculator();
        double result = obj1.operations(12.5,12);
        System.out.println(result);
    }
}

class Calculator {
    public int operations(int a, int b){
        return a + b;
    }

    public double operations(double a, int b){
        return a + b;
    }

    public int operations(int a, int b, int c){
        return a+b+c;
    }
}
