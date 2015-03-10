public class ReverseLinkedList {
    public ListNode reverseBetween(ListNode head, int m, int n) 
    {
    	if(head==null || head.next==null) return head;

    	ListNode newHead = new ListNode(0);
    	newHead.next = head;
    	ListNode curNode = newHead;
    	int k = 1;

    	while(k++ < m)
    		curNode = curNode.next;

    	ListNode beginNode = curNode.next;
    	ListNode temp = beginNode;

    	while(m++ < n) 
    	{
    		
    	    temp = beginNode.next;
    	    beginNode.next = temp.next;
    	    temp.next = curNode.next;
    	    curNode.next = temp;
    	    }
    	
    	return newHead.next;
    }
}

public class ReverseLinkedList{
    public ListNode(ListNode head)
    {
        if(head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while(){
            temp = dummy.next;
            dummy.next = temp.next;
            temp.next = 
        }
    }
}