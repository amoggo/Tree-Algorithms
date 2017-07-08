/**
 * Created by Amogh Vinod on 7/8/2017.
 */
public class LinkedList {
	ListNode head;
	ListNode tail;
	
	LinkedList(){
		head = null;
		tail = null;
	}
	
	public void addNode(Integer val){
		if(head == null) {
			head = new ListNode(val);
			tail = head;
		}
		else {
			ListNode prev = tail;
			tail = new ListNode(val);
			prev.next = tail;
		}
	}
	
	public String toString() {
		ListNode current = head;
		StringBuilder result = new StringBuilder();
		while(current != null) {
			result.append(current.val).append("->");
			current = current.next;
		}
		result.replace(result.length()-2, result.length(), "");
		return result.toString();
	}
}
