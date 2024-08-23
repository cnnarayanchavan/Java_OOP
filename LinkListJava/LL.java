package LinkListJava;
public class LL {

    private Node head;
    private Node tail;

    private class Node{
        int data;
        Node next; //for reference of next node

        public Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    //method for inserting into Linklist
    public void insertTo (int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    //method for displaying this data
    public void displayNode () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }
}
