// Main.java
class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class Main {

    // Insert a node 
    static Node insert(Node root, int value) {
        if (root == null) return new Node(value);
        if (value < root.data) root.left = insert(root.left, value);
        else root.right = insert(root.right, value);
        return root;
    }

    // 1. Height of the tree
    static int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    // 2. Count all nodes
    static int countNodes(Node root) {
        if (root == null) return 0;
        return 1 + countNodes(root.left) + countNodes(root.right);
    }

    // 3. Search a value
    static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    // 4. Count leaf nodes
    static int countLeafNodes(Node root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return countLeafNodes(root.left) + countLeafNodes(root.right);
    }

    public static void main(String[] args) {
        Node root = null;
        int[] values = {10, 5, 15, 3, 7, 12, 18};

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.println("Height of tree: " + height(root));
        System.out.println("Total number of nodes: " + countNodes(root));
        System.out.println("Search 7 in tree: " + (search(root, 7) ? "Found" : "Not Found"));
        System.out.println("Number of leaf nodes: " + countLeafNodes(root));
    }
}
