class Node{
    int item;
    Node left, right;
    public Node(int key){
        item=key;
        left=right=null;
    }
}
  public class binaryTree{
        // Root of binary tree.
        Node root;
        binaryTree(){
            root=null;
        }
        static void postOrder(Node node){
            if(node==null) return;
            // Traverse left
            postOrder(node.left);
            // Traverse right
            postOrder(node.right);
            // Traverse root
            System.out.print(node.item+"->");
        }
        static void inOrder(Node node){
            if(node==null) return;
            // Traverse left
            inOrder(node.left);
            // Traverse root
            System.out.print(node.item+"->");
            // Traverse right
            inOrder(node.right);
        }
        static void preOrder(Node node){
            if(node==null) return;
            // Traverse root
            System.out.print(node.item+"->");
            // Traverse left
            preOrder(node.left);
            // Traverse right
            preOrder(node.right);
        }
        public static void main(String[] args){
            binaryTree tree = new binaryTree();
            tree.root= new Node(1);
            tree.root.left=new Node(12);
            tree.root.right=new Node(9);
            tree.root.left.left=new Node(5);
            tree.root.left.right=new Node(6);
            System.out.println("Inorder Traversal");
            inOrder(tree.root);
            System.out.println("\nPreorder Traversal");
            preOrder(tree.root);
            System.out.println("\nPostorder Traversal");
            postOrder(tree.root);
        }
    }
