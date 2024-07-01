import java.util.*;

public class PrefixProblem {
    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
        int freq;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            freq = 1;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            } else {
                curr.children[idx].freq++;
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static String search(String word) {
        Node curr = root;
        StringBuilder prefix = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx].freq == 1) {
                prefix.append(word.charAt(i));
                break;
            }
            prefix.append(word.charAt(i));
            curr = curr.children[idx];
        }
        return prefix.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"zebra", "dog", "duck", "dove"};
        for (String word : arr) {
            insert(word);
        }

        for (String word : arr) {
            String prefix = search(word);
            System.out.println("Prefix for " + word + " is: " + prefix);
        }
    }
}
