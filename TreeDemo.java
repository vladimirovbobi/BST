/**
 * An implementation of a Binary Search Tree.
 * <p>
 * Uses nodes to store the values.
 * @author Bobi Vladimirov
 *
 */
class Node{
   /**
    * variable value to store the value
    */
   int value;
   /**
    * left and right Node to store the reference to the children
    */
   Node left, right;
   /**
    * Constructor of type node with connection to left and right child
    * @param value Value of the current node 
    */
   public Node(int value){
      this.value = value;
      left = null;
      right = null;
   }

}
/**
 * Binary Search Tree
 */
class BinarySearchTree{
   /**
    * root
    */
   Node root;
   
   
   /**
    * Iterative insert function
    * @param value  Represents the value to be inserted
    */
   public void insert(int value) {
	    if (root == null) {
	        root = new Node(value);
	        return;
	    }
	    
	    Node currentNode = root;
	    while (true) {
	        if (value < currentNode.value) {
	            if (currentNode.left == null) {
	                currentNode.left = new Node(value);
	                return;
	            }
	            currentNode = currentNode.left;
	        } else {
	            if (currentNode.right == null) {
	                currentNode.right = new Node(value);
	                return;
	            }
	            currentNode = currentNode.right;
	        }
	    }
	}

   /*
   pre-order traversal
   */
   public void preOrderTraversal(Node root){
      //implement me
   }

   
   
   /*
   in-order traversal
   */
   public void inOrderTraversal(Node root){
      //implement me
   }
   
   
   
   /*
   post-order traversal
   */
   public void postOrderTraversal(Node root){
      //implement me
   }
   
   
   
   /*
   a method to find the node in the tree
   with a specific value
   */
   public boolean find(Node root, int key){
	  //implement me
      return false;           
   }
   
   
   
   /*
   a method to find the node in the tree
   with a smallest key
   */
   public int getMin(Node root){
      //implement me
   }
  
  
  
   /*
   a method to find the node in the tree
   with a largest key
   */
   public int getMax(Node root){
	  //implement me
   }
   
   
   
   /*
   this method will not compile until getMax
   is implemented
   */
   public Node delete(Node root, int key){
      
      if(root == null){
         return root;
      }else if(key < root.value){
         root.left = delete(root.left, key);
      }else if(key > root.value){
         root.right = delete(root.right, key);
      }else{
         //node has been found
         if(root.left==null && root.right==null){
            //case #1: leaf node
            root = null;
         }else if(root.right == null){
            //case #2 : only left child
            root = root.left;
         }else if(root.left == null){
            //case #2 : only right child
            root = root.right;
         }else{
            //case #3 : 2 children
            root.value = getMax(root.left);
            root.left = delete(root.left, root.value);
         }
      }
      return root;  
   }
   
   
   
}



public class TreeDemo{
   public static void main(String[] args){
      BinarySearchTree t1  = new BinarySearchTree();
      t1.insert(24);
      t1.insert(80);
      t1.insert(18);
      t1.insert(9);
      t1.insert(90);
      t1.insert(22);
            
      System.out.print("in-order :   ");
      t1.inOrderTraversal(t1.root);
      System.out.println();
           
      
   }  
}