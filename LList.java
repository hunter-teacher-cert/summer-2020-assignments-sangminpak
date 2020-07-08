

import java.io.*;
import java.util.*;

public class Driver{


	public static void main(String[] args) {
		
	LList l = new LList();
	
	l.addFront("Hello");
	l.addFront("My name is");
	l.addFront("Spongebob");
	System.out.println(l);
	
	System.out.println(l.isEmpty());
	
	System.out.println(l.get(2));
	
	l.set(1, "yo");
	System.out.println(l);
}

}

