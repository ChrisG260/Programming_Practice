package BinarySearchTree;


class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}



public class BinarySearchTree {
	
    static Node search_Recursive(Node root, int value)  { 

        if (root==null || root.value==value) 
            return root; 
        if (root.value > value) 
            return search_Recursive(root.left, value); 
        return search_Recursive(root.right, value); 
    } 
    
    public static boolean contains(Node root, int value) {
        root = search_Recursive(root, value); 
        if (root!= null)
            return true;
        else
            return false;
    }
    
    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);
        
        System.out.println(contains(n2, 3));
        System.out.println(contains(n2, 0));
    }
}
