import java.util.*;

// Implementation of Stack in ArrayList

// public class Stack {
// ArrayList<Integer> list = new ArrayList<>();

// // check
// public boolean isEmpty() {
// return list.size() == 0;
// }

// // push
// public void push(int data) {
// list.add(data);
// }

// // pop
// public int pop() {
// if (isEmpty()) {
// return -1;
// }
// int top = list.get(list.size() - 1);
// list.remove(list.size() - 1);
// return top;
// }

// // peek
// public int peek() {
// if (isEmpty()) {
// return -1;
// }
// return list.get(list.size() - 1);
// }

// public static void main(String[] args) {
// Stack s = new Stack();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// Implementation of Stack in LinkedList

/**
 * Stack
 */
// public class Stack {
// static class Node {
// int data;
// Node next;

// Node(int data) {
// this.data = data;
// this.next = null;
// }
// }

// static class stack {
// static Node head = null;

// // isEmpty
// public static boolean isEmpty() {
// return head == null;
// }

// //push
// public static void push(int data) {
// Node newNode = new Node(data);

// if(isEmpty()) {
// head = newNode;
// return;
// }

// newNode.next = head;
// head = newNode;
// }

// //pop
// public static int pop() {
// if(isEmpty()) {
// return -1;
// }
// int top = head.data;
// head = head.next;
// return top;
// }

// //peek
// public static int peek() {
// if (isEmpty()) {
// return -1;
// }
// return head.data;
// }
// }

// public static void main(String[] args) {
// stack s = new stack();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// Using CollectionFrameWork
/**
 * Stack
 */
// public class stack {

// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// while (!s.isEmpty()) {
// System.out.println(s.peek());
// s.pop();
// }
// }
// }

// Insert at the Bottom of the stack

/**
 * stack
 */
// public class stack {
// public static void pushAtBottom(Stack<Integer> s, int data) {
// if (s.isEmpty()) {
// s.push(data);
// return;
// }
// int top = s.pop();
// pushAtBottom(s, data);
// s.push(top);
// }

// public static void main(String[] args) {
// Stack<Integer> s = new Stack<>();
// s.push(1);
// s.push(2);
// s.push(3);

// pushAtBottom(s, 4);

// while(!s.isEmpty()) {
// System.out.println(s.pop());
// }
// }
// }

// reverse String 

/**
 * stack
 */
// public class stack {
//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();
//         int idx = 0;
//         while (idx < str.length()) {
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while (!s.isEmpty()) {
//             char curr = s.pop();
//             result.append(curr);
//         }

//         return result.toString();
//     }

//     public static void main(String[] args) {
//         String str = "abc";
//         String result = reverseString(str);
//         System.out.println(result);
//     }
// }

//reverse stack

/**
 * stack
 */
// public class stack {
//     public static Stack reverseStack(Stack<Integer> s) {
//         Stack<Integer> ans = new Stack<>();

//         while (!s.isEmpty()) {
//             ans.push(s.pop());
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         s.push(4);

//         System.out.println(reverseStack(s));
//     }
// }

//reverse stack using Recursion

/**
 * stack
 */
// public class stack {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return; 
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s, top);
//     }
//     public static void printStack(Stack<Integer> s) {
//         while (!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(3);
//         s.push(2);
//         s.push(1);

//         reverseStack(s);
//         printStack(s);
//     }
// }

/**
 * stack -> Stock span problem
 */
// public class stack {
//     public static void stockSpan(int stocks[], int[] span) {
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++) {
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 span[i] = i+1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i - prevHigh;
//             }
//             s.push(i);
//         }
//     }

//     public static void main(String[] args) {
//         int[] stocks = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];
//         stockSpan(stocks, span);

//         for(int i=0; i<span.length; i++) {
//             System.out.print(span[i]+" ");
//         }
//     }
// }

/**
 * stack -> Next greater element problem(---using index---)
 */
// public class stack {

//     public static void main(String[] args) {
//         int[] arr = { 6, 8, 0, 1, 3 };
//         Stack<Integer> s = new Stack<>();
//         int nxtGreater[] = new int[arr.length];

//         for (int i = arr.length - 1; i >= 0; i--) {
//             // while
//             while (!s.isEmpty() && arr[i] >= arr[s.peek()]) {
//                 s.pop();
//             }
//             // if-else
//             if (s.isEmpty()) {
//                 nxtGreater[i] = -1;
//             } else {
//                 nxtGreater[i] = arr[s.peek()];
//             }
//             // push in stack
//             s.push(i);
//         }
//         for (int i = 0; i < nxtGreater.length; i++) {
//             System.out.print(nxtGreater[i] + " ");
//         }
//         System.out.println();
//     }
// }

//----using value---

// public class stack {

//     public static void main(String[] args) {
//         int[] arr = { 6, 8, 0, 1, 3 };
//         Stack<Integer> s = new Stack<>();
//         int nxtGreater[] = new int[arr.length];

//         for (int i = arr.length - 1; i >= 0; i--) {
//             // while
//             while (!s.isEmpty() && arr[i] >= s.peek()) {
//                 s.pop();
//             }
//             // if-else
//             if (s.isEmpty()) {
//                 nxtGreater[i] = -1;
//             } else {
//                 nxtGreater[i] = s.peek();
//             }
//             // push in stack
//             s.push(arr[i]);
//         }
//         for (int i = 0; i < nxtGreater.length; i++) {
//             System.out.print(nxtGreater[i] + " ");
//         }
//         System.out.println();

//         //---Similar Question---
//         //next Greater Right
//         //next Greater Left
//         //next Smaller Right
//         //next Smaller Left
//     }
// }

//-----Valid Parenthesis-----

/**
 * stack
 */
// public class stack {
//     public static boolean isValid(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             if(ch == '(' || ch == '[' || ch == '{') {
//                 s.push(ch);
//             } else {
//                 if(s.isEmpty()) {
//                     return false;
//                 }

//                 else if((s.peek() == '(' && ch == ')')
//                     || (s.peek() == '[' && ch == ']')
//                     || (s.peek() == '{' && ch == '}')) {
//                         s.pop();
//                     } else {
//                         return false;
//                     }

//                 // else if(ch == ')' && s.peek() != '(') {
//                 //     return false;
//                 // }

//                 // else if(ch == ']' && s.peek() != '[') {
//                 //     return false;
//                 // }

//                 // else if(ch == '}' && s.peek() != '{') {
//                 //     return false;
//                 // }else{
//                 //     s.pop();
//                 // }
//             }
//         }
//         return s.isEmpty();
//     } 
//     public static void main(String[] args) {
//         String str = "({}[])";
//         System.out.println(isValid(str));
//     }
// }

// ---------Duplicate Parenthesis---------
/**
 * stack
 */
// public class stack {
//     public static boolean isDuplicate(String str) {
//         Stack<Character> s = new Stack<>();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             // closing
//             if (ch == ')') {
//                 int count = 0;
//                 while (s.pop() != '(') {
//                     count++;
//                 }
//                 if (count < 1) {
//                     return true; // find Duplicate
//                 }
//                 // ------------------------Sortest------------------------------
//                 // if(ch == ')') {
//                 // int count = 0;
//                 // while(s.peek() != '(') {
//                 // s.pop();
//                 // count++;
//                 // }
//                 // if(count < 1) {
//                 // return true; //find Duplicate
//                 // } else {
//                 // s.pop();
//                 // }
//             } else {
//                 // opening, operators, operands
//                 s.push(ch);
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         String str = "((a+b)+(c+d))"; // false
//         String str2 = "((a+b))"; // true
//         System.out.println(isDuplicate(str2));
//     }
// }

//--------------MaxArea in a Histogram--------------
/**
 * stack
 */
public class stack {
    public static void maxArea(int[] arr) {
        int maxArea = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];

        // Next Smaller Right
        Stack<Integer> s = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsr[i] = arr.length;
            } else {
                nsr[i] = s.peek();
            }
            s.push(i);
        }

        // Next Smaller Left
        s = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsl[i] = -1;
            } else {
                nsl[i] = s.peek();
            }
            s.push(i);
        }

        // Current Area : width = j-i-1 = nsr[i]-nsl[i]-1
        for (int i = 0; i < arr.length; i++) {
            int height = arr[i];
            int width = nsr[i] - nsl[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(currArea, maxArea);
        }
        System.out.println("max area in histogram = " + maxArea);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 6, 2, 3 }; // heights in histogram
        maxArea(arr);
    }
}