public class CircularLinkedList {
    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }
//--------Insertion---------------
    public void insert(int val) {
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void display() {
        Node temp = head;
        if(head != null) {
            do { 
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            } while(temp != head);
        }
        System.out.println("HEAD");
    }
//----------deletion---------------
    public void delete(int val) {
        Node curr = head;
        if(curr == null) {
            return;
        }
        //check for head
        if(curr.val == val) {
            head = head.next;
            tail.next = head;
            return;
        }
        //for other element
        do {
            Node temp = curr.next;
            if(temp.val == val) {
                curr.next = temp.next;
                break;
            }
            curr = curr.next;
        } while(curr != head);

    }
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.insert(23);
        list.insert(3);
        list.insert(19);
        list.insert(75);

        list.display();
        list.delete(19);
        list.display();
    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
