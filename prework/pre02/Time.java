import java.io.*;
import java.util.*;

public class Time {
public static void main(String[] args){
	
	double hour_start = 19.0;
	double minute_start = 16.0;
	double second_start = 37.0;
	double dayinsec = 86400.0;
	
	System.out.println("The number of seconds since midnight: ");
	
	double sincemidnight = hour_start*60*60+minute_start*60+second_start;
	
	System.out.println(sincemidnight);
	
	System.out.println("The number of seconds remaining in the day: ");
	System.out.println(dayinsec - sincemidnight);
	
	System.out.println("The percentage of the day that has passed: ");
	
	System.out.println(100*(sincemidnight/dayinsec));
	
	double hour_current = 19.0;
	double minute_current = 38.0;
	double second_current = 58.0;
	double sincemidnight_current = hour_current*60*60+minute_current*60+second_current;
	
	System.out.println("The time (in seconds) elapsed since I started working: ");
	System.out.println(sincemidnight_current - sincemidnight);
}

}

