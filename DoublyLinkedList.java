/**
 * DoublyLinkedList
 */
public class DoublyLinkedList {
    class Node {
        int data;
        Node next;
        Node prev;
        
        public Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    
        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add - first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    //add - last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.prev = curr;
        tail = newNode;
    }


    //print
    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data +"<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    //remove - fast
    public int removeFirst() {
        if(head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;

    }
    //remove - last
    public void removeLast(){
        if(head == null) {
            System.out.println("DLL is empty");
        }
        if(size == 1) {
            head = tail = null;
            size--;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
        size--;
    }

    //reverse DoublyLinkedList
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        if(head == null || head.next == null) {
            System.out.println(head);
        }
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        dll.print();
        System.out.println(size);

        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);

        dll.removeLast();
        dll.print();
        System.out.println(size);

        dll.addLast(20);
        dll.print();
        System.out.println(dll.size);
        System.out.println(tail.data);

        dll.print();
        dll.reverse();
        dll.print();
    }    
}