public void ReverseLinkedList (LinkedList LinkedList)
{
	LinkedList copyList = new LinkedList();
	LinkedListNode start = LinkedList.Tail;
	while (start != null)
		copyList.Add(start.Item);
	start = start.previous;
}
LinkedList = copyList;


public void ReverseLinkedList(LinkedList LinkedList)
{
	LinkedListNode start = LinkedList.Head;
	LinkedListNode temp = null;
	while (start != null)
		temp = start.Next;
	    start.Next = start.Previous;
	    start.Previous = temp;
	    if (start.previous == null)
	    {
	    	LinkedList.head = start;

	    }
    start = start.Previous;

}




