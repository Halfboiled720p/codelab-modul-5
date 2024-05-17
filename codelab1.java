class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}

public class codelab1 {
    public Node root;

    public codelab1() {
        root = null;
    }

    // Fungsi untuk menambahkan node secara manual ke tree
    public void addRoot(int data) {
        root = new Node(data);
    }

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.println(node.data + " ");
        inOrder(node.right);
    }
    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args) {
        codelab1 tree = new codelab1();

        // Menentukan struktur tree secara manual
        // Root
        tree.addRoot(20);

        tree.root.left = new Node(2); // Menambahkan node ke kiri root
        tree.root.right = new Node(25); // Menambahkan node ke kanan root

        tree.root.left.left = new Node(37); // Menambahkan node ke kiri dari node kiri root
        tree.root.left.right = new Node(12); // Menambahkan node ke kanan dari node kiri root

        tree.root.right.right = new Node(16); // Menambahkan node ke kanan dari node kanan root

        System.out.println("\nPre Order: ");
        tree.preOrder(tree.root);

        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root); // This line is missing from the image

        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }

}