/**
 * @author Amogh Vinod
 * Problem : Check is a binary tree is balanced. A tree is balanced if the heights of the two 
 * 			 subtrees of any node is the tree never differ by more than 1.
 * 
 */

/*
 * Learning: 
 * 
 * private CustomObject1 callingMethod(){
	    Boolean b = Boolean.TRUE;
	    List<CustomObject2> list = this.calledMethod(b);
	    //Create CustomObject1 with b.booleanValue() as one of the arguments in the constructor
	}

	private List<CustomObject2> calledMethod(Boolean b){
	    ...
	    ...
	    if(condition){
	        b = Boolean.FALSE;
	    }
	    ...
	    ...
	}
	
--->First, there is a lot of misinformation about parameter passing in Java, like "objects are passed by reference, 
				primitives are passed by value" which is not true. Everything is passed by value.
				You're not passing an object by reference in Java, you're passing an object reference by value. Boolean b does 
				not hold a Boolean object, it holds a reference (a pointer) to a Boolean object.
				Here's a good article about it: http://javadude.com/articles/passbyvalue.htm
				Second, Boolean (like the other wrapper objects and also String) are immutable objects. S
				o with an immutable object, and as they are passed by value (better said, their references are passed by value),
				you cannot achieve what you desire. You'll need to have a mutable object instead, like @rob mentioned.
				
--->The problem is that you are reassigning b in calledMethod. A reassignment in calledMethod only reassigns the 
				variable declared in that method's parameter list; it does not modify the variable declared in the caller's scope.
				To do what you want to achieve, you could either convert b to a field, or create a MutableBoolean class which 
				allows you to do something like b.setValue(false).
 */
public class BalanceChecker {
	private class MutableBoolean{ 
		boolean value;
		MutableBoolean(){
			value = true;
		}
	}
	
	public boolean checkBalance(TreeNode root) {
		MutableBoolean result= new MutableBoolean();
		if(root == null)
			return false;
		checkBalance(root, result);
		return result.value;
	}
	
	private int checkBalance(TreeNode node, MutableBoolean result) {
		if(node == null)
			return 0;
		
		int leftDepth = checkBalance(node.left, result);
		int rightDepth = checkBalance(node.right, result);
		if(result.value == false)
			return 0; //0 is a dummy value. this condition prevents unnecessary execution.
		
		if(Math.abs(leftDepth - rightDepth) > 1) {
			result.value = false;
			System.out.println("Lowest Imbalance at node :"+ node);
		}
		return Math.max(leftDepth, rightDepth) + 1;
	}
}
