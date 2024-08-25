package LinkListJava;

public class DLL {
    
    Node head;
    //Strecture of doubly linklist
    class Node {
        
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            // this.next = next;
            // this.prev = prev;  //no need to define object type bydefault is 'null';
        }
    }

    //method for inserting element in dobly link list
    public void insertFirst (int data) {
        Node navin = new Node(data);
        navin.next = head;
        navin.prev = null;
        // head.prev = navin;
        // head = navin;
        if (head != null) {
            head.prev = navin;
        }
        head = navin;
    }

    //method for displaying node from list
    public void display () {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data +" <--> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    //method for just inserting node into the list.
    public void insertLast (int data) {
        Node navin = new Node(data);
        if (head == null) {
            head = navin;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = navin;
        navin.prev = temp;
        navin.next = null;

    }

    //reversing the list;
    public void reverse() {
        Node temp = null;
        Node current = head;
    
        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;  // Move to the next node (which is prev due to the swap)
        }
    
        // Adjust the head to point to the new first node
        if (temp != null) {
            head = temp.prev;
        }
    }
    
}
