public class ZigZagLevelOrderTraversal{
	public List<List<Integer>> result = new ArrayList<List<Integer>> ();
	if(root == null)
		return result;
	ArrayList<Integer> tmplevel = new ArrayList<Integer> ();
	boolean fromleft = true;
	LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
	queue.offer(root);
	queue.offer(null);
	while(!queue.isEmpty())
	{
		TreeNode cur = queue.poll();
		if(cur != null)
		{
			tmpLevel.add(cur.val);
			if(cur.left != null)
				queue.offer(cur.left);
			if(cur.right != null)
				queue.offer(cur.right);
		}
		else
		{
			if(fromLeft != true)
			{
				ArrayList<Integer> inverseTmpLevel = new ArrayList<Integer>();
				for(int i =tmpLevel.size() - 1; i >= 0; i--)
					inverseTmpLevel.add(tmpLevel.get(i));
				result.add(inverseTmpLevel);
				tmpLevel = new ArrayList<Integer>();
				fromLeft = true;
			}
            else
            {
            	result.add(tmpLevel);
            	tmplEVEL = NEW ArrayList<Integer>();
            	fromLeft = false;
            }
            if(!queue.isEmpty())
            	queue.offer(null);
		}
	}
	return result;
}
}