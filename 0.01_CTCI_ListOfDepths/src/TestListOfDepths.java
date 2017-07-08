/**
 * @author Amogh Vinod
 * Question: Given a binary tree, design an algorithm which creates a linked list 
 * 			 of all the nodes at each depth (e.g., if you have a tree with depth D, you'll have D linked lists).
 * 
 */
public class TestListOfDepths {
	public static void main(String[] args) {
		/*
		 *               5
		 *             /   \
		 *           3      8
		 *          / \      \
		 *        7   9      4
		 *                  /
		 *                 6 
		 */
		
		TreeNode six = new TreeNode(6);
		TreeNode four = new TreeNode(4, six, null);
		TreeNode eight = new TreeNode(8, null, four);
		TreeNode seven = new TreeNode(7);
		TreeNode nine = new TreeNode(9);
		TreeNode three = new TreeNode(3, seven, nine);
		TreeNode root = new TreeNode(5, three, eight);
		ListOfDepths obj = new ListOfDepths();

		System.out.println("Result: "+ obj.listFinder(root));
	}
}
