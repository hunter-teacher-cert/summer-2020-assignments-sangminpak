  
import java.io.*;
import java.util.*;


public class Time{
	private int hour;
	private int minute;
	private double second;
	
	public Time() {
		
		//Time() is a constructor method which means that the name is the same as class
		//you don't put "static" 
		//and also you don't need "return
		
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
		
		//when all the instance variables are zero, it means midnight.
		//you do not declare "this" and you can't make an assignment to it.
		//i guess like point or rectangle?

	
	}
	//another way of writing the constructor WITH ARGUMENTS
	
	public Time (int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	
	//if you were to println(time), it just prints address of the ojbect, so you gotta create another method.
	
	public static void printTime(Time t) {
		System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
		
	}
	
public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;
		return sum;
		
	}
    
    
public static void main(String[] args) {
	Time time = new Time (10, 20, 30.0);
	printTime(time);
	Time startTime = new Time(18,50, 0.0);
	Time runningTime = new Time(2, 16, 0.0);
	Time endTime = Time.add(startTime, runningTime);
	printTime(add(startTime, runningTime));
	
	
}

	}

