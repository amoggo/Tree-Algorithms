/**
 * Created by Amogh Vinod on 7/8/2017.
 */

public class TreeNode {
	Integer val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(Integer val, TreeNode left, TreeNode right){
		this.val = val;
		this.right = right;
		this.left = left;
	}
	TreeNode(Integer val){
		this(val, null, null);
	}
	
	public String toString() {
		return String.valueOf(val);
	}
}
