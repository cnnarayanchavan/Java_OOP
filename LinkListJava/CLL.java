package LinkListJava;
public class CLL {

    Node head;
    Node tail;  //both are initially null

    class Node {
        int data;
        Node next;

        Node (int data){
            this.data = data;
        }
    }

    //method for inserting into CLL.
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            //means the list is empty
            head = newNode;
            tail = newNode;
        }
        newNode.next = head;
        tail.next = newNode;
        tail = newNode;
    }

    //method for displaying list
    public void display () {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to the head)");
    }

}
