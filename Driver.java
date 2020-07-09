

import java.io.*;
import java.util.*;

public class Driver{


	public static void main(String[] args) {
		
	LList l = new LList();
	
	try { 
		l.addFront(null);
	}
	
	catch (IllegalArgumentException e ) {
		System.out.println("Element not added");
	}
	l.addFront("Hello");
	l.addFront("My name is");
	l.addFront("Spongebob");
	System.out.println(l);
	
	System.out.println(l.isEmpty());
	
	System.out.println(l.get(4));
	
	//l.set(1, "yo");
	//System.out.println(l);
	
	//l.insert(1, "what");
	//System.out.println(l);
	
	//System.out.println("Your keyword is found at index: " + l.search("word")); --> testing NoSuchElementException
	
}

}

