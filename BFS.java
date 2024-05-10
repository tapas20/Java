import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BFS {
    Node root;
    // print in single line-------------------------
    // void printLevelOrder() {
    // Queue<Node> q = new LinkedList<>();
    // q.add(root);
    // while (!q.isEmpty()) {

    // Node curr = q.poll();
    // System.out.print(curr.data + " ");

    // if(curr.left != null) {
    // q.add(curr.left);
    // }

    // if(curr.right != null) {
    // q.add(curr.right);
    // }
    // }

    // }


    //print in multiple lines-------------------------
    void printLevelOrder() {
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {

            Node curr = q.poll();
            if(curr == null) {
                if(q.isEmpty()) {
                    return;
                }
                q.add(null);
                System.out.println();
                continue;
            }
            System.out.print(curr.data + " ");

            if(curr.left != null) {
                q.add(curr.left);
            }

            if(curr.right != null) {
                q.add(curr.right);
            }
        }

    }

    public static void main(String[] args) {
        BFS tree_level = new BFS();
        tree_level.root = new Node(1);
        tree_level.root.left = new Node(2);
        tree_level.root.right = new Node(3);
        tree_level.root.left.left = new Node(4);
        tree_level.root.left.right = new Node(5);

        System.out.println("Level order traversal of binary tree is - ");
        tree_level.printLevelOrder();
    }
}
