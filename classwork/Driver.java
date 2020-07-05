import java.io.*;
import java.util.*;

public class Driver{

	
	
	public static void printTime(Time time) {
		System.out.printf("%02d:%02d:%04.1f\n", time.hour, time.minute, time.second);
	}
	

	public static void main(String[] args) {
		
	//Time t = new Time();
	//Time t0 = new Time(11, 59, 59.9);
	Time t1 = new Time (11, 59, 59.9);
	//Time t2 = null;
	
	//printTime(t0);
	printTime(t1);
	//System.out.println(time.toSpring());
	//System.out.println( t0 == t1);
	//System.out.println( t0 == t2);
	
	//t2 = t0.add(t1);
	//printTime(t2);
	
	
	
	
	}
    
}