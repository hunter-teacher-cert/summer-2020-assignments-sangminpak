import java.io.*;
import java.util.*;

public class Loops{
	
	public static void main(String[] args) {



   System.out.println(power (3, 2));
   System.out.println(factorial(5));
   
   //when I isolate the factorial part into a new file, it works fine but for some reason, it keeps producing 1 as an answer right now.
  }

//Exercise 3
  public static double power(double x, int n) {

    double num = 1;


    while (n > 0) {

      num = num * x;
      n = n - 1;
      
    }
    return num;
	
  }
 
 //Exercise 4
 
	public static int factorial(int n) {
		
		int fac=1;

		while (n<0) {
			fac = fac * n;
			n = n - 1;
		}
		
		return fac;
	}
    

}

//to be updated