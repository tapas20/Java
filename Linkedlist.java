// class Node{
//     int data;
//     Node next;
//     Node(int data1, Node next1){
//         this.data = data1;
//         this.next = next1;
//     }

//     Node(int data1){
//         this.data = data1;
//         this.next = null;
//     }
// }
// // public class Linkedlist {
// //     public static void main(String[] args){
// //         int[] arr = {2, 5, 6, 8};
// //         Node y = new Node(arr[3],null);
// //         System.out.println(y);
// //     }
// // }


// public class Linkedlist {
//     private static Node convertArr2LL(int[] arr){
//         Node head = new Node(arr[0]);
//         Node mover = head;
//         for(int i= 1; i<arr.length;i++){
//             Node temp = new Node(arr[i]);
//             mover.next = temp;
//             mover = temp;
//         }
//         return head;
//     }

//     //Length in LL
//     private static int lengthOfLL(Node head){
//         int count = 0;
//         Node temp = head;
//         while(temp != null){
//             temp = temp.next;
//             count++;
//         }
//         return count;
//     }

//     //Check if Present
//     private static int checkIfPresent(Node head, int val){
//         Node temp = head;
//         while(temp != null){
//             if(temp.data == val){
//                 return 1;
//             }
//             temp = temp.next;
//         }
//         return 0;
//     }

//     //Iterate in LL
//     public static void main(String[] args){
//         int[] arr = {12, 5, 6, 8};
//         Node head = convertArr2LL(arr);
//         // System.out.print(lengthOfLL(head));
//         System.out.println(checkIfPresent(head, 5));
        
//         // Node temp = head;
//         // while(temp != null){
//         //     System.out.print(temp.data+" ");
//         //     temp = temp.next;
//         // }
//     }
// }


//Traversing a singly Linkedlist

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data = x;
//         next = null;
//     }
// }
// class Linkedlist {
    // public static void main(String[] args) {
    //     Node head = new Node(10);
    //     head.next = new Node(20);
    //     head.next.next = new Node(30);
    //     head.next.next.next = new Node(40);
        //printList(head);
        // recursivePrint(head);
        // System.out.println(SearchInLL(head, 30));
        // System.out.println(SearchInRecursive(head, 30));;
    // }
    // public static void printList(Node head) {
    //     Node curr = head;
    //     while(curr != null){
    //         System.out.print(curr.data +" ");
    //         curr = curr.next;
    //     }
    // }


//------------------------------RecursiveTraversal--------------------------------
        // public static void recursivePrint(Node head) {
        //     if(head == null) {
        //         return;
        //     }
        //     System.out.print(head.data+" ");
        //     recursivePrint(head.next);
        // }

//---------------------------SearchInLL in Iterative method-------------------------
            // public static int SearchInLL(Node head, int target){
            //     int pos = 1;
            //     Node curr = head;
            //     while(curr != null){
            //         if(curr.data == target){
            //             return pos;
            //         } else {
            //             pos++;
            //             curr = curr.next;
            //         }
            //     }
            //     return -1;
            // }

//------------------------------SearchInRecursive Method-----------------------------
                // public static boolean SearchInRecursive(Node head, int target){
                //     if(head == null){
                //         return false;
                //     }
                //     if(head.data == target){
                //         return true;
                //     } else {
                //         return SearchInRecursive(head.next, target);
                //     }
                // }
// }
//--------------------------------Insert at the Begining--------------------------------
        

// class Node {
//     int data;
//     Node next;
//     Node(int x) {
//         data = x;
//         next = null;
//     }
// }

// public class Linkedlist {
//     public static void main(String[] args) {
//         Node head = null;
//         head = insertBegin(head, 30);
//         head = insertBegin(head, 20);
//         head = insertBegin(head, 10);
//         System.out.println(head.data);
//         // return 0;
//     }
//     public static Node insertBegin(Node head, int x){
//         Node temp = new Node(x);
//         temp.next = head;
//         head = temp;
//         return head;
//     }
// }


//-------------------------------Insert at the End--------------------------------
// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data = x;
//         next = null;
//     } 
// }
// class Linkedlist{
//     public static void main(String[] args){
//         Node head = null;
//         head = insertLast(head, 10);
//         head = insertLast(head, 20);
//         head = insertLast(head, 30);
//         System.out.println(head.data);
        
//     }
//     public static Node insertLast(Node head, int x){
//         Node temp = new Node(x);
//         if(head == null){
//             return temp;
//         }
//         Node curr = head;
//         while(curr.next != null){
//             curr = curr.next;
//         }
//         curr.next = temp;
//         return head;
//     }
// }

//-----------------------Delete first Node ------------------------------


// class Node{
//     int data;
//     Node next;
//     Node(int x){
//         data = x;
//         next = null;
//     }
// }
// class Linkedlist{
//     public static void main(String[] args){
//         Node head = null;
//         head = delHead(head, 10);
//         head = delHead(head, 20);
//         head = delHead(head, 30);
        
//     }
//     public static Node delHead(Node head,int x){
//         if(head == null){
//             return null;
//         } else {
//             return head.next;
//         }
//     }
// }

//-----------------------Delete Last Node ------------------------------

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data = x;
//         next = null;
//     }
// }
//     class Linkedlist {
//         public static void main(String[] args){
//             Node head = null;
//             head = new Node(10);
//             head = new Node(20);
//             head = new Node(30);
//             head = new Node(40);
//             head = new Node(50);
//             delLast(head);
//             System.out.println(head.data);
//         }
//         public static Node delLast(Node head){
//             if(head == null){
//                 return null;
//             }
//             if(head.next == null){
//                 return null;
//             }
//             Node curr = head;
//             while(curr.next.next != null){
//                 curr = curr.next;
//             }
//             curr.next = null;
//             return head;
//         }
//     }



//---------------------------------Insert at given position--------------------------------------

// class Node {
//     int data;
//     Node next;
//     Node(int x){
//         data = x;
//         next = null;
//     }
// }
// class Linkedlist{
//     public static void main(String[] args){
//         Node head = null;
//         head = new Node(10);
//         head = new Node(30);
//         head = new Node(40);
//         head = new Node(50);
//         insertPos(head, 2, 20);
//         System.out.println(head.data);
//     }
//     public static Node insertPos(Node head, int pos, int data){
//         Node temp = new Node(data);
//         if(pos == 1){
//             temp.next = head;
//             return temp;
//         }
//         Node curr = head;
//         for(int i=1; i<=pos-2 && curr != null; i++){
//             curr = curr.next;
//         }
//         if(curr == null){
//             return head;
//         }
//         temp.next = curr.next;
//         curr.next = temp;
//         return head;
//     }
// }



/**
 * Linkedlist
 */
// public class Linkedlist {
//     class Node {
//         int data;
//         Node next;
//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }
//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }
//         newNode.next = head;
//         head =newNode;
//     }
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         if(head == null) {
//             head = tail = newNode;
//         }
//         newNode.next = tail;
//         tail = newNode;
//     }
//     public void print() {
//         Node temp = head;
//         while(temp != null) {
//             System.out.print(temp.data+"->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
    

//     public static void main(String[] args) {
//         Linkedlist ll = new Linkedlist();
//         ll.print();
//         ll.addFirst(1);
//         ll.print();
//         ll.addFirst(2);
//         ll.print();
//         ll.addLast(3);
//         ll.print();
//         ll.addLast(4);
//         ll.print();
//         // System.out.println(head.data);
//         // System.out.println(tail.data);
//     }
// }

import java.util.LinkedList;

/**
 * Linkedlist
 */
public class Linkedlist {
    class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public static int size;

    
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    public void add(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public int removeFirst() {
        if(size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }
    public int removeLast() {
        if(size == 0) {
            System.out.println("LL i empty");
            return Integer.MIN_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    public static int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while(temp != null) {
            if(temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    public static int recurSearch(Node head, int key) {
        if(head.next == null) {
            return -1;
        }
        else if(head.data == key) {
            return 0;
        }
        int idx = recurSearch(head.next, key);
        if(idx == -1) {
            return -1;
        }
        return idx+1;
    }
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void deleteNthfromEnd(int n) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null) {
            sz++;
            temp = temp.next;
        }

        if(n == sz) {
            head = head.next;
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }
    //Finding mid using slow-fast Approach
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;  //+1
            fast = fast.next.next;  //+2
        }
        return slow; //Slow is my middle
    }

    public boolean checkPalindrome() {
        //basecase
        if(head == null || head.next == null) {
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);

        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev; //righthalf head
        Node left = head; //lefthalf head
        while(left != null) {
            if(right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
        //step3 - check left half & right half

    }
    //check is cycle
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) {
                return true;
            }
        }
        return false;
    }
    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) {
                cycle = true;
                break;
            }
        }
        if(cycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null;
        while(slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        //remove cycle -> last.next = null
        prev.next = null;

    }


//--------------------MergeTwoLinkedList--------------------------
    private Node merge(Node head1, Node head2) {
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLL.next;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node MergeSort(Node head) {
        //basecase
        if(head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        
        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = MergeSort(head);
        Node newRight = MergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }



    //Zig-Zag LinkedList
    public void zigZag() {
        //find mid
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;
        //reverse 2nd half
        Node prev = null;
        Node curr = mid.next;
        mid.next = null;
        Node next;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node lH = head;
        Node rH = prev;
        //alt merge - zig-zag merge
        while(lH != null && rH != null) {
            Node nxtLeft = lH.next;
            lH.next = rH;
            Node nxtRight = rH.next;
            rH.next = nxtLeft;

            lH = nxtLeft;
            rH = nxtRight;
        }
    }
    public static void main(String[] args) {
        // Linkedlist ll = new Linkedlist();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(3);
        // ll.addLast(4);

        // ll.add(2, 9);
        
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.print();
        // System.out.println(ll.size);
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(9));
        // System.out.println(ll.itrSearch(10));
        // System.out.println(recurSearch(head, 9));

        // ll.reverse();
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // ll.print();

        // System.out.println(ll.checkPalindrome());\

        // System.out.println(ll.isCycle());

        // head = ll.new Node(1);
        // Node temp = ll.new Node(2);
        // head.next = temp;
        // head.next.next = ll.new Node(3);
        // head.next.next.next = temp;
        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());



//------------Java Collection Framework(JCF)-----------
        //create
        // LinkedList<Integer> ll = new LinkedList<>();

        // //add
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addFirst(0);

        // System.out.println(ll);

        // //remove
        // ll.removeLast();
        // ll.removeFirst();
        // System.out.println(ll);


//--------------------MergeTwoLinkedList--------------------------
        // Linkedlist ll = new Linkedlist();
        // ll.addFirst(1);
        // ll.addFirst(2);
        // ll.addFirst(3);
        // ll.addFirst(4);
        // ll.addFirst(5);
        
        // ll.print();
        // ll.head = ll.MergeSort(head);
        // ll.print();



        Linkedlist ll = new Linkedlist();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);

        ll.print();
        ll.zigZag();
        ll.print();
    }
}
