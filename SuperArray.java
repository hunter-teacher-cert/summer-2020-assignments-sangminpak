<<<<<<< HEAD
import java.io.*;
import java.util.*;

public class SuperArray {
	private int[] data;
	private int numberElements;
	
	public SuperArray () {
		this.numberElements = 0;
		this.data = new int[10];
	}
	
	public SuperArray (int a) {
		
		this.data = new int[a];
		
	}
	
	//public add(int value) {
	
	public void printArray (){
		for(int i = 0; i <this.data.length; i++) {
			System.out.print(this.data[i]);
			System.out.println();
		}
	}
	
	public void add(int value) {
		
		//for (numberElements = 0; numberElements <= this.data.length; numberElements++) {
			//this.data[numberElements] = value;
		if (numberElements <= this.data.length) {
			this.data[numberElements] = value;
			numberElements = numberElements + 1;
		}
	}
	
	public int get(int index) {
		if (this.data.length == index) {
			return this.data[index];
		}
		
		return -1;
		
	
	}
	
	public boolean isEmpty() {
		if (numberElements == 0) {
			return true;
		}
		
		return false;
		
	}
	
	public String toString() {
		String stringdata = " ";
		
		for (int i = 0; i <this.data.length; i++) {
			stringdata = stringdata + this.data[i] + ", ";
		}
		
		return stringdata;
		
	}
	
	public void grow() {
	
		int[] newArray = new int [this.data.length+1];
		for (int i = 0; i <this.data.length; i++) {
				newArray[i] = this.data[i];
		
				
		}
		this.data = newArray;
	}
	
public static void main (String[] args) {
	SuperArray object1 = new SuperArray();
	
	
	
	object1.add(3);
	//object1.printArray();
	System.out.println(object1.get(2));
	System.out.println(object1.isEmpty());
	System.out.println(object1.toString());
	object1.grow();
	System.out.println(object1.toString());
	
	

}


}
=======
import java.io.*;
import java.util.*;

public class SuperArray {
	private int[] data;
	private int numberElements;
	
	public SuperArray () {
		this.numberElements = 0;
		this.data = new int[10];
	}
	
	public SuperArray (int a) {
		
		this.data = new int[a];
		
	}
	
	//public add(int value) {
	
	public void printArray (){
		for(int i = 0; i <this.data.length; i++) {
			System.out.print(this.data[i]);
			System.out.println();
		}
	}
	
	public void add(int value) {
		
		//for (numberElements = 0; numberElements <= this.data.length; numberElements++) {
			//this.data[numberElements] = value;
		if (numberElements <= this.data.length) {
			this.data[numberElements] = value;
			numberElements = numberElements + 1;
		}
	}
	
	public int get(int index) {
		if (this.data.length == index) {
			return this.data[index];
		}
		
		return -1;
		
	
	}
	
	public boolean isEmpty() {
		if (numberElements == 0) {
			return true;
		}
		
		return false;
		
	}
	
	public String toString() {
		String stringdata = " ";
		
		for (int i = 0; i <this.data.length; i++) {
			stringdata = stringdata + this.data[i] + ", ";
		}
		
		return stringdata;
		
	}
	
	public void grow() {
	
		int[] newArray = new int [this.data.length+1];
		for (int i = 0; i <this.data.length; i++) {
				newArray[i] = this.data[i];
		
				
		}
		this.data = newArray;
	}
	
public static void main (String[] args) {
	SuperArray object1 = new SuperArray();
	
	
	
	object1.add(3);
	//object1.printArray();
	System.out.println(object1.get(2));
	System.out.println(object1.isEmpty());
	System.out.println(object1.toString());
	object1.grow();
	System.out.println(object1.toString());
	
	

}


}
>>>>>>> c6f79cc2d13199d910dbe7f46e679a36d005aa1e
