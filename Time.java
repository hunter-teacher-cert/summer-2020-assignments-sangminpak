<<<<<<< HEAD
  
import java.io.*;
import java.util.*;


public class Time{
	int hour;
	int minute;
	double second;
	
	public Time() {
		
		//Time() is a constructor method which means that the name is the same as class
		//you don't put "static" 
		//and also you don't need "return
		
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
		
		//with no arguments, instance variables are set to zero.
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
	public String toString(){
		
		int newHour;
		String meridies;
			
	
		if (this.hour > 12) {
			newHour = this.hour - 12;
			meridies = "PM";
		}
		else { 
		newHour = this.hour;
		meridies = "AM";
		}
		
	
		return String.format("The current time is %02d:%02d:%04.1f " + meridies, newHour, this.minute, this.second);
		
	}
	public boolean equals (Time that) {
		return this.hour == that.hour
		&& this.minute == that.minute
		&& this.second == that.second; 
	}
	
public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;
		
		if (sum.second >= 60.0) {
		sum.second -= 60.0;
		sum.minute +=1;
	}
	
	if (sum.minute >= 60) {
		sum.minute -= 60;
		sum.hour += 1;
		
	}
	
	return sum;
}
    
public Time add(Time t2) {
	Time sum = new Time();
	sum.hour = this.hour + t2.hour;
	sum.minute = this.minute + t2.minute;
	sum. second = this.second + t2.second;
	
	if (sum.second >= 60.0) {
		sum.second -= 60.0;
		sum.minute +=1;
	}
	
	if (sum.minute >= 60) {
		sum.minute -= 60;
		sum.hour += 1;
	}
	
	return sum;
	
}
    
	
	public void increment(double seconds) {
		this.second += seconds;
		while (this.second >= 60.0) {
			this.second -= 60.0;
			this.minute += 1;
		}
		
		while (this.minute >= 60) {
			this.minute -= 60;
			this.hour += 1;
		}
	}
	
	public void addMinutes(int min) {
		this.minute += min;
		while (this.minute >= 60.0) {
			this.minute -= 60.0;
			this.hour += 1;
		}
		
	 
	}
	
	//public difference (Time other) {
		
	
public static void main(String[] args) {
	Time time = new Time (23, 20, 30.0);
	//printTime(time);
	//Time startTime = new Time(18,50, 0.0);
	//Time runningTime = new Time(2, 16, 0.0);
	//Time endTime = Time.add(startTime, runningTime);
	//printTime(add(startTime, runningTime));
	System.out.print(time.toString());
	
	
}

	}

=======
  
import java.io.*;
import java.util.*;


public class Time{
	int hour;
	int minute;
	double second;
	
	public Time() {
		
		//Time() is a constructor method which means that the name is the same as class
		//you don't put "static" 
		//and also you don't need "return
		
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
		
		//with no arguments, instance variables are set to zero.
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
	public String toString(){
		
		int newHour;
		String meridies;
			
	
		if (this.hour > 12) {
			newHour = this.hour - 12;
			meridies = "PM";
		}
		else { 
		newHour = this.hour;
		meridies = "AM";
		}
		
	
		return String.format("The current time is %02d:%02d:%04.1f " + meridies, newHour, this.minute, this.second);
		
	}
	public boolean equals (Time that) {
		return this.hour == that.hour
		&& this.minute == that.minute
		&& this.second == that.second; 
	}
	
public static Time add(Time t1, Time t2) {
		Time sum = new Time();
		sum.hour = t1.hour + t2.hour;
		sum.minute = t1.minute + t2.minute;
		sum.second = t1.second + t2.second;
		
		if (sum.second >= 60.0) {
		sum.second -= 60.0;
		sum.minute +=1;
	}
	
	if (sum.minute >= 60) {
		sum.minute -= 60;
		sum.hour += 1;
		
	}
	
	return sum;
}
    
public Time add(Time t2) {
	Time sum = new Time();
	sum.hour = this.hour + t2.hour;
	sum.minute = this.minute + t2.minute;
	sum. second = this.second + t2.second;
	
	if (sum.second >= 60.0) {
		sum.second -= 60.0;
		sum.minute +=1;
	}
	
	if (sum.minute >= 60) {
		sum.minute -= 60;
		sum.hour += 1;
	}
	
	return sum;
	
}
    
	
	public void increment(double seconds) {
		this.second += seconds;
		while (this.second >= 60.0) {
			this.second -= 60.0;
			this.minute += 1;
		}
		
		while (this.minute >= 60) {
			this.minute -= 60;
			this.hour += 1;
		}
	}
	
	public void addMinutes(int min) {
		this.minute += min;
		while (this.minute >= 60.0) {
			this.minute -= 60.0;
			this.hour += 1;
		}
		
	 
	}
	
	//public difference (Time other) {
		
	
public static void main(String[] args) {
	Time time = new Time (23, 20, 30.0);
	//printTime(time);
	//Time startTime = new Time(18,50, 0.0);
	//Time runningTime = new Time(2, 16, 0.0);
	//Time endTime = Time.add(startTime, runningTime);
	//printTime(add(startTime, runningTime));
	System.out.print(time.toString());
	
	
}

	}

>>>>>>> 3839e32691c676f73d7d83f4b4814a4a603ff76b
