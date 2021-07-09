import java.io.*;
import java.util.*;

public class ExceptionDriver {
	public static void main(String [] args){
		
		//int[] a = new int [5];
		//System.out.println(4%0); -> "java.lang.ArithmeticException"
		
		//Node n = null;
		//n.setData("hello"); --> "java.lang.NullPointerException"
		
		
		//LList g = new LList();
		//g.addFront(null);
		//System.out.println(g); --> this compiles AND runs, but we WANT to be an exception!
			//so you can create if statement, ex:
			//if (value == null) {
				//throw new IllegalArgumentException();
					//IllegalArgumentException is the class, and in order to create an object, you have
					//to add () to it!!!! AHHHHHHHH OKAYYYYY
			//or, you can throw IndexOutOfBoundsException when you create get() 
			//}
	}
}