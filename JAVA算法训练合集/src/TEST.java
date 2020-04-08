import 两数相加.text.ListNode;

public class TEST {
	public static class ListNode
	{
	    int val;
	    ListNode next;
	    
	    public ListNode(int x){
	        val=x;
	    }
	public static void main(String[] args) {
		ListNode a1 = new ListNode(0);
		ListNode bb = a1 ;
		bb.next = new ListNode(77);
		System.out.println(a1.next.val);
	}
	}
	
}
