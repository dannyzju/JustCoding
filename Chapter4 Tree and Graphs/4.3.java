// Binary tree: Tree where each node has up to two leaves
// Binary search tree: Used for searching. A binary tree where the left child 
// contains only nodes with values less than the parent node, and where the right child 
// only contains nodes with values greater than or equal to the parent.

TreeNode createMinimalBST(int arr[], int start, int end){
	if (end < start) {
		return null;
	}

	int mid = (start + end) /2;

	TreeNode n = new TreeNode(arr[mid]);
	n.left = createMinimalBST(arr,start, mid-1);
	n.right = createMinimalBST(arr, mid+1,end);
	return n;
}

TreeNode createMinimalBST(int array[]){
	return createMinimalBST(array, 0, array.length - 1)
}