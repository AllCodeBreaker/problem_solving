// 700. Search in a Binary Search Tree

class BSTBinarySearch {
    private TreeNode search(TreeNode node, int data){
        if(node == null){
            return null;
        }
        if(node.val == data){
            return node;
        }if (node.val > data){
            return search(node.left, data);
        }else{
            return search (node.right, data);
        }
    }
    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }
}
