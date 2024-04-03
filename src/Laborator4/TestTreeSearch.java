package Laborator4;

public class TestTreeSearch {
	public static void main(String[] args) 
	{
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(45);
		tree.insert(9);
		tree.insert(3);
		tree.insert(17);
		tree.insert(20);
		tree.insert(55);
		tree.insert(53);
		tree.insert(49);
		
		BinarySearchTreeNode node = tree.search(13);
		if (node != null) {
			System.out.println(node.key);
		} else {
			System.out.println("404: Not found.");
		}

	}
	

}
