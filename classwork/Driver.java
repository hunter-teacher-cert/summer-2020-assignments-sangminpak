import java.io.*;
import java.util.*;

public class Driver{
	
	

	public static void main(String[] args) {
	Time t = new Time();
	Time t0 = new Time(11, 59, 59.9);
	Time t1 = new Time (11, 59, 59.9);
	Time t2 = null;
	
	System.out.println(t0);
	System.out.println(t1);
	System.out.println(t2);
	
	System.out.println( t0 == t1);
	System.out.println( t0 == t2);
	
	t2 = t0.add(t1);
	System.out.println(t2);
	
	
	
	}
    
}