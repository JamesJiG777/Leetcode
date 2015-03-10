public class solution{
	public class boolean isValidBST(treeNode root){
		return isBST(root, Long.MIN_VALUE, Long.MAX_VALUE)
	}
	public boolean isBST(treeNode root, long alpha, long beta){
		if(root == null)
			return true;
		if(alpha < root.val && root.val < beta){
			return isBST(root.left, alpha, root.val)&& isBST(root.right, root.val, beta)
		}
	}   else return false;
	
}

