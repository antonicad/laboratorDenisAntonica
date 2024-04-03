package Laborator4;

class BinarySearchTree {

	BinarySearchTreeNode root;
	
	void insert(int key) {
	    root = insertKey(root, key);
	}

	  // Insert key in the tree
	BinarySearchTreeNode insertKey(BinarySearchTreeNode root, int key) {
	  // Return a new node if the tree is empty
	   if (root == null) {
		   root = new BinarySearchTreeNode(key);
		   return root;
	   }

	   // Traverse to the right place and insert the node
	   if (key < root.key)
		   root.left = insertKey(root.left, key);
	   else if (key > root.key)
	       root.right = insertKey(root.right, key);
	   
	   return root;
	  }
	
	public BinarySearchTreeNode search(int key)
	{
		return searchRoot(root, key);
	}
	
	public BinarySearchTreeNode searchRoot(BinarySearchTreeNode root, int key)
	{
	    // Base Cases: root is null or key is present at root
	    if (root==null || root.key==key)
	        return root;
	 
	    // Key is greater than root's key
	    if (root.key < key)
	       return searchRoot(root.right, key);
	 
	    // Key is smaller than root's key
	    return searchRoot(root.left, key);
	}
}

