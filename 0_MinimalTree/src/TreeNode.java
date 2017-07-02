
public class TreeNode {
	Integer val;
	TreeNode left;
	TreeNode right;
	
	TreeNode(Integer val, TreeNode left, TreeNode right){
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
	TreeNode(Integer val){
		this(val, null, null);
	}
	
	TreeNode(){
		this(null, null, null);
	}
	
	public String toString(){
		return String.valueOf(this.val);
	}
}
