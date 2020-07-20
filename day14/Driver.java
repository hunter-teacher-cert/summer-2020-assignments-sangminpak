import java.io.*;
import java.util.*;

public class Driver{


	public static void main(String[] args) {
		BSTree t = new BSTree();
		
		t.seed();
		
		//t.search(15);
		//t.search(8);
		try {
		t.search(33);
		}
		
		catch (NullPointerException e) {
			System.out.println("key not found");
		}
	
	}
}
