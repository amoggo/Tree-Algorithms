/*
 * Given an Array sorted in ascending order, with unique integer elements, write an algorithm 
 * to create a binary search tree  * with minimal height.
 */
import java.util.*;

public class BuildMinimalTree {
	
	public TreeNode build(int[] input){
		TreeNode root = new TreeNode();
		if(input == null || input.length == 0)
			return root;
		
		return build(0, input.length-1, input);
	}
	
	private TreeNode build(int l, int r, int[] input){
		if(l > r)
			return null;
		if(l == r)
			return new TreeNode(input[l]);
		int mid = (l+r)/2;
		TreeNode node = new TreeNode(input[mid]);
		node.left = build(l, mid-1, input);
		node.right = build(mid+1, r, input);
		return node;
	}
}
