public solution ZigZagTreeTraversal{
	public List<List<Integer>> result = new ArrayList<List<Integer>>();
    if(root == null)
    return result;
    LinkedList queue = new LinkedList();
    boolean fromLeft = ture;
    ArrayList<Integer> tmpLevel = new ArrayList<Integer>;
    queue.offer(root);
    queue.offer(null);
    while(!queue.isEmpty()){
    treeNode cur = queue.poll();
    if(cur.left != null)
    queue.add(cur.left);
    if(cur.right != null)
    queue.add(cur.right);
    }
}