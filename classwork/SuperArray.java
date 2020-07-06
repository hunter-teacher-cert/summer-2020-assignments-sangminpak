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
	
public static void main (String[] args) {
	SuperArray object1 = new SuperArray();
	
	
	
	object1.add(3);
	object1.printArray();
	System.out.print(object1.get(2));
	

}


}