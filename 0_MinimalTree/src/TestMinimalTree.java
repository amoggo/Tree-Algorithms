
public class TestMinimalTree {
	public static void main(String[] args){
		BuildMinimalTree obj1 = new BuildMinimalTree();
		int[] input1 = {1, 5, 11, 23, 36, 40, 90};
		
		TreeNode root1 = obj1.build(input1);
		inOrder(root1);
		
	}
	
	public static void inOrder(TreeNode node){
		if(node == null)
			return;
		inOrder(node.left);
		System.out.print(node+ " ");
		inOrder(node.right);
		return;
	}
}
