import java.io.*;
import java.util.*;

public class BSTree {
	private TreeNode root;
	
	public BSTree(){
		root = null;
	}
	
	public void seed(){
		TreeNode t;
		
		t = new TreeNode(10);
		//new treenode made with 10 as data and left and right are null
		
		root = t;
		t = new TreeNode(5);
		root.setLeft(t);
		t = new TreeNode(20);
		root.setRight(t);
		//I think this part is setting 5 for left and 20 for right
		//but i'm confused about why we're using t for all
		//i guess it doesn't matter??
		
		root.getLeft().setRight(new TreeNode(8));
		//left's right(this is a child) is 8
		
		t = new TreeNode(15);
		root.getRight().setLeft(t);
		
		t = new TreeNode(22);
		root.getRight().setRight(t);
	
	}
	
	//preorder traversal, because you're processing in front
	
	private void traverse(TreeNode current) {
		
		if (current == null)
			return;
		
		//process the current node
		System.out.print(current.getData() + ", ");
		
		//recursively print out the left subtree
		traverse(current.getLeft());
		
		//recursively print out the right subtree
		traverse(current.getRight());
		
	}
	
	public void traverse() {
		traverse(root);
		System.out.println();
	
	
	}
	
	//postorder traversal; process at the end
	
	private void traverse2(TreeNode current) {
		
		if (current == null)
			return;
		
	
		
		//recursively print out the left subtree
		traverse2(current.getLeft());
		
		//recursively print out the right subtree
		traverse2(current.getRight());
		
			//process the current node
		System.out.print(current.getData() + ", ");
	}
	
	public void traverse2() {
		traverse2(root);
		System.out.println();
	
	
	}
	
	//inorder traversal; prints values in order
	private void traverse3(TreeNode current) {
		
		if (current == null)
			return;
		
	
		
		//recursively print out the left subtree
		traverse3(current.getLeft());
		
		//process the current node
		System.out.print(current.getData() + ", ");
		
		
		//recursively print out the right subtree
		traverse3(current.getRight());
		
			
		
	}
	
	public void traverse3() {
		traverse3(root);
		System.out.println();
	
	
	}
	
	
	public int search(int key){
		TreeNode current = root;
		
		if (current == null) {
			return -1;
		}
		
		while (current.getData() != key) {
		int currentData = current.getData();
		
			if (currentData > key) {
				current = current.getLeft();
				System.out.println(current.getData());
			}
			if (currentData < key) {
				current = current.getRight();
				System.out.println(current.getData());	
		}
		
	}
	
	return -1;
	
	}
	
	public void insert(int key){
		
		TreeNode newNode = new TreeNode(key);
		
		
		if (root == null) {
			root= newNode;
			return ;
		}
	
		TreeNode timmy = root;
		TreeNode tommy = null;
		
		while (timmy != null) {
		int timmyData = timmy.getData();
			if (timmyData == key) {
				return ;
			} else if (timmyData < key) {
					tommy = timmy;
					timmy = timmy.getRight();
					System.out.println(tommy.getData());
			} else {
					tommy = timmy;
					timmy = timmy.getLeft();
					System.out.println(tommy.getData());		
			}
		
		}
	
		if (key > tommy.getData()) {
				tommy.setRight(newNode);
		} else {
			tommy.setLeft(newNode);
		}
	System.out.println(newNode.getData());
}

public void delete (int key){
	
	
	
	//if the tree is empty
	//manually insert the new node as the root
	if (root == null) {
		return;
	}
	
	
	//find the node that we want to delete
	//and the node above it using piggybacking
	//we should look for the smallest from the right OR
	//largest from the left

	TreeNode front = root;
	TreeNode trailier = root;
	
	//doo the piggyback loop
	//until we either find the node or null
	//if the key isn't present
	
	while (front != null && front.getData() != key) {
		if (front.getData() < key) {
			trailer = front;
			front = front.getRight();
		} else {
			trailer = front;
			front = front.getLeft();
		}
	}
	
	//if the key wasn't in the tree
	if (front == null) {
		return;
	}
	
	//if we get here
	//front points to the node we want to delete
	//and trailer points to the one above it
	
	//case 1 -- the node we want to delete is a leaf
	if (front.getLeft() == null && front.getRight() == null) {
	
	
	//repoint front's parent to null
	trailer = null;
	
	} 
	//case 2
	/* else if ( (front.getLeft() != null && front.getRight() == null) || (front.getRight() != null && front.getLeft() == null))
		//check to see if front has one child ) {
			trailer = front.getLeft() OR trailer = front.getRight()
		//repoint front's parent to front's child
	
	//case 3
	} else {
		front has two children
		
		find the node with the largest value on front's left subtree
		and replace front with it. (go left once, and go right all the 
		way to the end)
		
		//is it possible to use the search()? do i have to keep track of
		what values are entered? if, not, I would do something like
		//getLeft -> getRight until getRight is null
		//then, that last node is the front.


}
	

}
