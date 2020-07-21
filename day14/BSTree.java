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
	
	public int insert(int key){
		TreeNode timmy = root;
		TreeNode tommy = root;
		TreeNode newNode = new TreeNode(key);
		
		
		if (timmy == null) {
			timmy = newNode;
			return -1;
		}
	
		
		while (timmy != null) {
		int timmyData = timmy.getData();
			if (timmyData == key) {
				return -1;
			} else {
				if (timmyData > key) {
					tommy = timmy;
					timmy = timmy.getLeft();
					System.out.println(timmy.getData());
				
				} else {
					
					tommy = timmy;
					timmy = timmy.getRight();
				}	System.out.println(timmy.getData());	
		
			}
		
		}
	
		if (key > tommy.getData()) {
				tommy.setRight(newNode);
		} else {
			tommy.setLeft(newNode);
		}
	
	return newNode.getData();




}

}
