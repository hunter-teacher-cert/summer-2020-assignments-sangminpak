import java.io.*;
import java.util.*;

public class Stack{
     
	 private Node top;
      


     public Stack(){
         top = null;
		 
		      }
			  
	public String toString(){
		String s = "";
		
		Node currentNode;
		currentNode = top;
		//we're creating a temporary node, which is now head.
		while (currentNode !=null){
			//so using the add method, the head is probably not null (Because it's has newnode data)
			//so if head is not null, currentNode is not null.
			
			s = s + currentNode.getData() + "\n";
			//writes itself + get whatever currentNode's data is, then...
			
			currentNode = currentNode.getNext();
			
			//gets whatever comes after currentNode, then continues the loop
		
		}
		
		return s;
		
	}

      public void push(String data){
          Node newnode = new Node(data);
          newnode.setNext(top); // i'm not sure if this makes more sense than newnode.setNext. I'll just test it out!
          top = newnode;
          
          //if (top == null) {
         // top = newnode; Is this part necessary? It makes sense in my head but....
     }

    // public String pop(){
		 
		 
   
          
        
         
      //}

     public String top(){
		return top.getData(); //????? is this it???
         
         
         
         // add code to return but not remove the
          // item on the top of the stack
      }

      public boolean isEmpty(){
          return top == null;
      }

     public int size(){
     
		int count=0;
		Node currentNode = this.top;
		
		
		
		while (currentNode != null) {
		
			currentNode = currentNode.getNext();
			count++;
		}
		
		return count;
          // add code to return the number of items currently on the stack
          
          //this is probably similar to length() where it just counts until the end of the list.
      }
    
  }

//reverse() --> first push all the elements..(?) into Stack A. Make another stack, and then pop all the elements in Stack A into new Stack.
//parenCheck() --> check for left paren, then check for right paren. --> true ; if right paren, throw exception. If left parent, and then no right paren, throw another exception.
//palindrome() --> Look for space, store each word as string in the first stack. Then, pop stuff into the new stack. --> Basically, use remove with checking for space between words.
//
