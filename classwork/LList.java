import java.io.*;
import java.util.*;

public class LList{
	private Node head;
	
	public LList(){
		head = null;
	
	}
	public void add(String data){
		Node newnode = new Node(data);
		newnode.setNext(head);
		head = newnode;
		//basically it points back to itself so that it can refer to itself.
		//therefore head is not null anymore. It's whatever the data is.
	}
	
	public String toString(){
		String s = "";
		
		Node currentNode;
		currentNode = head;
		//we're creating a temporary node, which is now head.
		while (currentNode !=null){
			//so using the add method, the head is probably not null (Because it's has newnode data)
			//so if head is not null, currentNode is not null.
			
			s = s + currentNode.getData()+"-->";
			//writes itself + get whatever currentNode's data is, then...
			
			currentNode = currentNode.getNext();
			
			//gets whatever comes after currentNode, then continues the loop
		
		}
		
		s = s + "null";
		return s;
		
	}
	
	public boolean isEmpty() {
		if (head == null) {
			return true;
		}
		
		return false;
		
	
	}
	
}
