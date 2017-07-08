/**
 * Created by Amogh Vinod on 7/8/2017.
 */

import java.util.*;

public class ListOfDepths {
	
	//Iterative solution
	public List<LinkedList> listFinder(TreeNode root){
		List<LinkedList> resultList = new ArrayList<>();
		if(root == null)
			return resultList;
		
		Deque<TreeNode> queue = new ArrayDeque<>();
		int count = 1;
		queue.add(root);
		LinkedList currLL = new LinkedList();
		
		while(!queue.isEmpty()) {
			TreeNode currNode = queue.poll();
			
			currLL.addNode(currNode.val);
			
			if(currNode.left != null)
				queue.add(currNode.left);
			if(currNode.right != null)
				queue.add(currNode.right);
			
			if(--count == 0){
				count = queue.size();
				resultList.add(currLL);
				currLL = new LinkedList();
			}
		}
		
		return resultList;
	}
}
