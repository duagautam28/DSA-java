
import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}

public class Tree {
    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else if (data < root.data) {
            root.left = insert(root.left, data);
        } 
        else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
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

    // public static void Height(Node root,int c,int q){
        
    //     if(root!=null){
    //         Height(root.left,c,q);
    //         c++;
    //         Height(root.right,c,q);
    //         q++;
    //     }
    //     else{
    //         System.out.println(Math.max(c,q));
    //        return ; 
    //     }
    //    // return c;

    // }
    public static int Height(Node root) {
        int c=0;
        if (root == null) {
            return 0;
        }
        // int leftHeight = Height(root.left);
        // int rightHeight = Height(root.left);
        // return Math.max(leftHeight, rightHeight) + 1;
        Height(root.left);
        c++;
        Height(root.left);
        c++;
        return c+1;
    }

    public static void key(Node root,int key,int c)
    {
        //int c=0;
        if(root!=null){
            
            if(root.data==key){
                System.out.println("yes "+c);
            }
            key(root.left,key,c+1);
            key(root.right,key,c+1);
     
        }
    }

    public static boolean checkParent(Node root){
        if(root!=null){
            if(root.data==root.left.data+root.right.data){
                return true;
            }
        }
        return false;
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
        int a= Height(root);
        System.out.println("Height of tree"+a);
        

        System.out.println("the key 60 is at height ");
         key(root,30,0);

        boolean val=checkParent(root);

        if(val){
            System.out.println("yes");
        }
        else{
            System.out.println("noo");
        }



        
        
    }
}
