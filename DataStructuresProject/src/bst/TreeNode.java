package bst;

public class TreeNode {
	private int value;
	private TreeNode leftChild;
	private  TreeNode rightChild;
	
	public TreeNode(int value) {
		super();
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}

	public void addChild(int data) {
		if(value == data) return; // we are returning because it is duplicate data
		
		if(data < value) {
			if(leftChild == null) // means there is no left child
				leftChild = new TreeNode(data); // we found the spot on the left side
			else
				leftChild.addChild(data); // a recursive call to find if left child is null
		} else {
			if(rightChild == null ) // means there is no right child
				rightChild = new TreeNode(data); // we found the spot on the right side
			else
				rightChild.addChild(data); // a recursive call to find if right child is null
		}
	}
	
	public String inOrderTraversal(StringBuffer sb) {
		if(leftChild != null ) {
			leftChild.inOrderTraversal(sb);
		}
		sb.append(this.value).append(" ");
		if(rightChild != null) {
			rightChild.inOrderTraversal(sb);
		}
		return sb.toString();
	}
	
	public int min() {
		if(leftChild == null) return value;
		return leftChild.min();
	}
	
	public int max() {
		if(rightChild == null) return value;
		return rightChild.max();
	}
	
	@Override
	public String toString() {
		return "[value=" + value + "]";
	}
}
