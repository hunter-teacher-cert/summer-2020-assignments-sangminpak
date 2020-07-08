import java.io.*;
import java.util.*;

public class LList{
	private Node head;
	
	public LList(){
		head = null;
	
	}
	public void addFront(String data){
		Node newnode = new Node(data);
		newnode.setNext(head);
		head = newnode;
		//basically it points back to itself so that it can refer to itself.
		//therefore head is not null anymore. It's whatever the data is.
	}
	
	public String toString(){
		String s = "";
		
		Node tmp;
		tmp = head;
		//we're creating a temporary node, which is now head.
		while (tmp !=null){
			//so using the add method, the head is probably not null (Because it's has newnode data)
			//so if head is not null, tmp is not null.
			
			s = s + tmp.getData()+"-->";
			//writes itself + get whatever tmp's data is, then...
			
			tmp = tmp.getNext();
			
			//gets whatever comes after tmp, then continues the loop
		
		}
		
		s = s + "null";
		return s;
		
	}
	
	}