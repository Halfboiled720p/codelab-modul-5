
public class codelab2 {
    public Node root;
    public void NewNode(int data) {
        root = NewNode(root, new Node(data));
    }

    private Node NewNode (Node root, Node newData) {
        if (root == null) {
            root = newData;
            return root;
        }
        if (newData.data < root.data) {
            root.left = NewNode(root.left, newData);
        } else {
            root.right
                    =
                    NewNode(root.right, newData);
        }
        return root;
    }
    public void inOrder (Node node) {
        if (node != null) {
            inOrder(node.left);

            System.out.println(node.data + "");
            inOrder(node.right);
        }
    }



    public void preorder (Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postOrder (Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.data + " ");
    }

    public static void main(String[] args) {
        codelab2 tree = new codelab2();
        tree.NewNode(20);
        tree.NewNode(2);
        tree.NewNode(20);
        tree.NewNode(25);
        tree.NewNode(37);
        tree.NewNode(16);

        System.out.println("\nPre Order: ");
        tree.preorder(tree.root);

        System.out.println("\nIn Order: ");
        tree.inOrder(tree.root);

        System.out.println("\nPost Order: ");
        tree.postOrder(tree.root);
    }

}