/**
 * Created by Amogh Vinod on 7/8/2017.
 */
public class ListNode {
	Integer val;
	ListNode next;
	
	ListNode(Integer val, ListNode next){
		this.val = val;
		this.next = next;
	}
	ListNode(Integer val){
		this(val, null);
	}
	public String toString() {
		return String.valueOf(val);
	}
	
}
