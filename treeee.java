class Node{
    int val;
    Node left,right;
    Node(int data){
        val=data;
        left=right=null;
    }
}
public class treeee{
    public static Node insert(Node root,int data){
       // new Node(data);
        if(root==null){
            return new Node(data);
        }
        else if(data>root.val){
            root.right=insert(root.right,data);
        }
        else{
            root.left=insert(root.left,data);
        }
        return root;

    }
    public static void inorder(Node root) {  
        if (root != null) {
            inorder(root.left);
            System.out.println(root.val);
            inorder(root.right);
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
}
}