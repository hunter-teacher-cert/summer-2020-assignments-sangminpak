
import java.io.*;
import java.util.*;

public class LList{
	private Node head;
	private int length;

	
	public LList(){
		head = null;
	
	}
	

	
	public void addFront(String data){
		Node newnode = new Node(data);
		newnode.setNext(head);
		head = newnode;
		
		if (data == null)
			throw new IllegalArgumentException();
		
	
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
		//if (head == null) {
			//return true;
		//}
		
		//return false;
		//the above code is kind of redundant, so it can be more concise like below:
		
		return head == null ;
		
	
	}
	
	public String get(int index){
		int count = 0;
		//counter variable
		
		Node currentNode = this.head;
		//makes currentNode start at head
		
		while (count != index && currentNode.getData() != null) {
			//while the counter is not equal to index(the int value) AND
			//the currentNode's value is not null, it goes in the while loop
			
			if(currentNode.getNext() == null) {
				throw new IndexOutOfBoundsException();
				//if currentNOde is null, then it's null
			}
			else{
				currentNode=currentNode.getNext();
				count++;
				
				//if currentNode is NOT null, it goes to the next node and counter variable goes up by 1
			}
			
		}
		return currentNode.getData();
		
		//if the counter is equal to index, it just returns the value at that position.
	}	
		
	
	public void set(int index, String value) {
		int count=0;		
		Node currentNode = this.head;
		
		//basically initializing to start from the beginning, like get()
		
		while (count != index && currentNode.getData () != null) {
			if (currentNode.getNext() == null) {
				
			throw new IndexOutOfBoundsException();
				
			}
			else{
				currentNode=currentNode.getNext();
				count++;
			}
		}
		currentNode.setData(value);
		
		//pretty much the same with get, but it returns a different thing. instead of getting data, it sets
		//whatever the value is to that position
	}
	
	public void insert(int index, String value) {
	
	int count=0;
	Node currentNode = this.head;
	
	if (index == 0) {
		addFront(value);
		throw new IndexOutOfBoundsException();
	}
	
	while (count != index-1 && currentNode.getData() != null) {
		if (count != index-1) {
			currentNode.getNext();
			count ++;
		}
	}
		
	if (count == index-1) {
			currentNode.setData(value);
		}
	}
	//something is making it insert the value at the wrong index. When I have more time,
	//I'm gonna draw each step of the loop and debug.
	//but it actually inserts something somewhere. YAY
	
	public int search(String key) {
		int count=0;
		Node currentNode = this.head;
		
		
		
		while (currentNode != null) {
			if (currentNode.getData().equals(key))
				return count;
		
			currentNode = currentNode.getNext();
			count++;
		}
		
		throw new NoSuchElementException ();
	}
	public int length() {
		int len = 0;
		Node curr = head;
		while (curr.getNext() != null) {
			len ++;
			curr = curr.getNext();
		}
		length = len;
		return length;
	}
	
	public void remove (int index) {
		if (head == null) 
			return;
		
		
		
		if (index == 0) {
			head = head.getNext();
			return;
		} else {
		
		Node current = head;			
		for (int i = 0; i < index-1; i++) {
			current = current.getNext();
		}
		
		current.setNext(current.getNext().getNext());
		
		
		}
	}
		
}
