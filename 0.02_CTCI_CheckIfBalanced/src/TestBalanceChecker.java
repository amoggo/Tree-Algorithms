/**
 * @author Amogh Vinod
 *
 * 
 */
public class TestBalanceChecker {
	public static void main(String[] args) {
	    /*
	     *         1
		        /    \
		       2      6
		  	  /	    / \
		     9	   7   8
				       \
				       3
				       \
				        4
   
	     */
		TreeNode four = new TreeNode(4, null, null);
		TreeNode nine = new TreeNode(9, null, null);
		TreeNode three = new TreeNode(3, null, four);
		TreeNode eight = new TreeNode(8, null, three);
		TreeNode seven = new TreeNode(7, null, null);
		
		TreeNode six = new TreeNode(6, seven, eight);
		TreeNode two = new TreeNode (2, nine, null);	
		TreeNode one = new TreeNode(1, two, six);
		
		BalanceChecker obj = new BalanceChecker();
		System.out.println(obj.checkBalance(one));
		
		
	}
}
