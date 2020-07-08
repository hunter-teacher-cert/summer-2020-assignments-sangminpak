

import java.io.*;
import java.util.*;

public class Driver{


	public static void main(String[] args) {
		
	LList l = new LList();
	
	l.add("Hello");
	l.add("My name is");
	l.add("Spongebob");
	System.out.println(l);
	
	System.out.println(l.isEmpty());
	
	System.out.println(l.get(2));
}

}

