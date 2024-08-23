package LinkListJava;
public class Main {
    public static void main(String[] args) {
        // Dog german = new Dog(2, 1, 4);
        LL myList = new LL();
        myList.insertTo(13);
        myList.insertTo(14);
        myList.insertTo(15);
        myList.displayNode();
    }
}

// class Dog {
//     int eyes;
//     int nose;
//     int legs;

//     public Dog(int eyes, int nose, int legs){
//         this.eyes = eyes;
//         this.nose = nose;
//         this.legs = legs;
//         m1_Info();
//     }

//     public void m1_Info () {
//         System.out.println("I am dog and have "+"Eyes: "+eyes +" : "+"Nose: "+nose+" : "+"Legs: "+legs);
//     }
// }
