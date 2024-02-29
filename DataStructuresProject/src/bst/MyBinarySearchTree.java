package bst;

import java.util.NoSuchElementException;

public class MyBinarySearchTree {
	private TreeNode rootNode;
	
	public void insert(int data) {
		if(rootNode == null) rootNode = new TreeNode(data);
		// we have to call addChild on the rootNode
		rootNode.addChild(data);
	}
	
	public String traverse() {
		StringBuffer sb = new StringBuffer();
		if(rootNode != null) {
			return rootNode.inOrderTraversal(sb);
		}
		return "";
	}
	
	public int min() {
		if(rootNode == null) throw new NoSuchElementException("Tree is empty!");
		return rootNode.min();
	}
	
	public int max() {
		if(rootNode == null) throw new NoSuchElementException("Tree is empty!");
		return rootNode.max();
	}
	public void delete(int value) {
		 rootNode = deleteNode(rootNode, value); 
	}
	
	private TreeNode deleteNode(TreeNode subTreeRoot, int value) {
		if(subTreeRoot == null) return subTreeRoot;
		if(value < subTreeRoot.getValue()) 
			subTreeRoot.setLeftChild(deleteNode(subTreeRoot.getLeftChild(), value));
		else if(value > subTreeRoot.getValue())
			subTreeRoot.setRightChild(deleteNode(subTreeRoot.getRightChild(), value));
		else {
			// case 1 and case 2  - node to delete has 0 or 1 child
			if(subTreeRoot.getLeftChild() == null)
				return subTreeRoot.getRightChild();
			else if(subTreeRoot.getRightChild() == null)
				return subTreeRoot.getLeftChild();
			// case 3 - node to delete has 2 children
			subTreeRoot.setValue(subTreeRoot.getRightChild().min());
			subTreeRoot.setRightChild(deleteNode(subTreeRoot.getRightChild(), subTreeRoot.getValue()));
		}
		return subTreeRoot;
	}
}
