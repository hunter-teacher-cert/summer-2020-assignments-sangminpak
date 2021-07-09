import java.io.*;
import java.util.Scanner;

public class CtoF {
public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		
		double celcius;
		double fahren;
		final double CONVERSION_FRACTION = 9.0/5.0;
		final int ZERO_CELCIUS_IN_FAHRENHEIT = 32;
		
		//ask the user for temp in celcius
		
		System.out.print("What is the temperature in Celcius?");
		celcius = in.nextDouble();
		
		//convert celcius to fahrenheit and output the result
		
		fahren = (int) (celcius*CONVERSION_FRACTION + ZERO_CELCIUS_IN_FAHRENHEIT);
		
		System.out.printf("%.1f C = %.1f F", celcius, fahren);
	}
}
