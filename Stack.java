import java.io.*;
import java.util.*;

public CLass MyStack{
      Node top;
      


      public myStack(){
         top = null;
      }

      public void push(String data){
          Node newnode = new Node(data);
          newnode.next = top; // i'm not sure if this makes more sense than newnode.setNext. I'll just test it out!
          top = newnode;
          
          //if (top == null) {
         // top = newnode; Is this part necessary? It makes sense in my head but....
      }

      public String pop(){
          // add code to remove and return the
          // item on the top of the stack
          //1. get the data of the top element, 2. have the top point to the next element, 3. top is next element.
          //so the previous 'top' element is still there but nothing is pointing to it. I THINK
          
          //top.getData();
          //top = top.setNext;
          //return data;
      }

      public String top(){
      return top.data; //????? is this it???
         
         
         
         // add code to return but not remove the
          // item on the top of the stack
      }

      public boolean isEmpty(){
          return top == null;
      }

      public int size(){
     
          // add code to return the number of items currently on the stack
          
          //this is probably similar to length() where it just counts until the end of the list.
      }
    
  }
