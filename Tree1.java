
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class Tree1  {
    Node root;
    public static Node insert(Node root, int data) {
        Node newNode=new Node(data);
        if (root == null) {
            return root;
        }
        else{
            Queue<Node>q=new LinkedList<>();
            q.offer(root);
            
        }
       
    }

    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    public static void Preorder(Node root) {
        if (root != null) {
            System.out.println(root.data);
            inorder(root.left);
            inorder(root.right);
        }
    }

    public static void Postorder(Node root) {
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.println(root.data);
        }
    }

 

    public static void main(String[] args) {
        Node root = null;
       // Tree t=new Tree();
        root =insert(root, 40);
        root =insert(root, 20);
        root =insert(root, 50);
        root =insert(root, 10);
        root =insert(root, 60);
        root =insert(root, 30);

        System.out.println("Inorder Traversal");
        inorder(root);
        System.out.println("Preorder Traversal");
        Preorder(root);
        System.out.println("Postorder Traversal");
        Postorder(root);
        
    }
}

