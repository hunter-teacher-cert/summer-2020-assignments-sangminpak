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
	
	String s0 = "hello";
	String s1 = "hello";
	String s2 = new String("hello");
	
	System.out.println( s0 == s1);
	System.out.println( s0 == s2);
	
	
	}
    
}