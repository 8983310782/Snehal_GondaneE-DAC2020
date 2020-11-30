public class BinaryTree {
  // first node
  private Node root;
  BinaryTree(){
    root = null;
  }
  // Class representing tree nodes
  static class Node{
    int value;
    Node left;
    Node right;
    Node(int value){
      this.value = value;
      left = null;
      right = null;        
    }
    public void displayData(){
      System.out.print(value + " ");
    }
  }
    
  public void insert(int i){
    root = insert(root, i);
  }
    
  //Inserting node - recursive method
  public Node insert(Node node, int value){
    if(node == null){
      return new Node(value);
    }
    // Move to the left if passed value is 
    // less than the current node
    if(value < node.value){
      node.left = insert(node.left, value);
    }
    // Move to the right if passed value is 
    // greater than the current node
    else if(value > node.value){
      node.right = insert(node.right, value);
    }
    return node;
  }
  // Search node in binary search tree
  public Node find(int searchedValue){
    Node current = root;
    while(current.value != searchedValue){
      if(searchedValue < current.value)
        // Move to the left if searched value is less
        current = current.left;
      else
        // Move to the right if searched value is >=
        current = current.right;
      if(current == null){
        return null;
      }
    }
    return current;
  }
    
  // For traversing in order
  public void inOrder(Node node){
    if(node != null){
      inOrder(node.left);
      node.displayData();
      inOrder(node.right);
    }
  }
  // Preorder traversal
  public void preOrder(Node node){
    if(node != null){
      node.displayData();
      preOrder(node.left);           
      preOrder(node.right);
    }
  }
  // Postorder traversal
  public void postOrder(Node node){
    if(node != null){
      postOrder(node.left);
      postOrder(node.right);
      node.displayData();          
    }
  }
    
  public static void main(String[] args) {
    BinaryTree bst = new BinaryTree();
    bst.insert(50);
    bst.insert(70);
    bst.insert(15);
    bst.insert(35);
    bst.insert(30);
    bst.insert(31);
    System.out.println("Inorder traversal of binary tree");
    bst.inOrder(bst.root);
    System.out.println();
    Node node = bst.find(16);
    System.out.println((node == null)? "Node not found" : String.valueOf(node.value));
    System.out.println("Preorder traversal of binary tree");
    bst.preOrder(bst.root);
    System.out.println();
    System.out.println("Postorder traversal of binary tree");
    bst.postOrder(bst.root);
    System.out.println();
  }
}
Output

Inorder traversal of binary tree
15 30 31 35 50 70 
Node not found
Preorder traversal of binary tree
50 15 35 30 31 70 
Postorder traversal of binary tree
31 30 35 15 70 50 
-------------------------------------------------------------------------------------------------------------------------------------------------



public class BinarySearchTree {  
  
    public static class Node{  
        int data;  
        Node left;  
        Node right;  
  
        public Node(int data){  
            this.data = data;  
            this.left = null;  
            this.right = null;  
        }  
      }  
  
      public Node root;  
  
      public BinarySearchTree(){  
          root = null;  
      }  
  
      public void insert(int data) {  
          Node newNode = new Node(data);  
  
          if(root == null){  
              root = newNode;  
              return;  
            }  
          else {  
              Node current = root, parent = null;  
  
              while(true) {  
                  parent = current;  
  
                  if(data < current.data) {  
                      current = current.left;  
                      if(current == null) {  
                          parent.left = newNode;  
                          return;  
                      }  
                  }   
                  else {  
                      current = current.right;  
                      if(current == null) {  
                          parent.right = newNode;  
                          return;  
                      }  
                  }  
              }  
          }  
      }  
  
      public Node minNode(Node root) {  
          if (root.left != null)  
              return minNode(root.left);  
          else  
              return root;  
      }   
      public Node deleteNode(Node node, int value) {  
          if(node == null){  
              return null;  
           }  
          else {  
              if(value < node.data)  
                  node.left = deleteNode(node.left, value);  
  
              else if(value > node.data)  
                  node.right = deleteNode(node.right, value);   
              else {  
                  if(node.left == null && node.right == null)  
                      node = null;  
  
                  else if(node.left == null) 
				  {  
                      node = node.right;  
                  }  
  
                  else if(node.right == null) 
				  {  
                      node = node.left;  
                  }  
                  else {   
                      Node temp = minNode(node.right);  
                      node.data = temp.data;  
                      node.right = deleteNode(node.right, temp.data);  
                  }  
              }  
              return node;  
          }  
      }   
      public void inorderTraversal(Node node) {  
   
          if(root == null){  
              System.out.println("Tree is empty");  
              return;  
           }  
          else {  
  
              if(node.left!= null)  
                  inorderTraversal(node.left);  
              System.out.print(node.data + " ");  
              if(node.right!= null)  
                  inorderTraversal(node.right);  
  
          }  
      }  
  
      public static void main(String[] args) {  
  
          BinarySearchTree bt = new BinarySearchTree();   
          bt.insert(50);  
          bt.insert(30);  
          bt.insert(70);  
          bt.insert(60);  
          bt.insert(10);  
          bt.insert(90);  
  
          System.out.println("Binary search tree after insertion:"); 
          bt.inorderTraversal(bt.root);  
  
          Node deletedNode = null;   
          deletedNode = bt.deleteNode(bt.root, 90);  
          System.out.println("\nBinary search tree after deleting node 90:");  
          bt.inorderTraversal(bt.root);  
   
          deletedNode = bt.deleteNode(bt.root, 30);  
          System.out.println("\nBinary search tree after deleting node 30:");  
          bt.inorderTraversal(bt.root);  
  
          deletedNode = bt.deleteNode(bt.root, 50);  
          System.out.println("\nBinary search tree after deleting node 50:");  
          bt.inorderTraversal(bt.root);  
      }  
}  
Output:

Binary search tree after insertion:
10 30 50 60 70 90 
Binary search tree after deleting node 90:
10 30 50 60 70 
Binary search tree after deleting node 30:
10 50 60 70 
Binary search tree after deleting node 50:
10 60 70 