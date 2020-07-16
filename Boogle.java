/**
   classwork -- Day 10 | 0b1010 | 0x10
   class: Boogle
   A tester class for code analysis and search exploration.
   USAGE:
   Read through at least once.
   Compile, run.
   Comment/uncomment lines, recompile, run to explore functionality.
   "Lather, rinse, repeat" until comprehension achieved.
   Rename methods to indicate purpose.
   Insert comment preceding each method to summarize functionality.
   T. Mykolyk, F. Dragon
   June 2020
**/

import java.io.*;
import java.util.*;

public class Boogle
{

  //return index of first occurence of target, or -1 if not found
  public static int linSearch( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end linSearch()








  //return index of target, or -1 if not found
  /*
 public static int binSearch( ArrayList al, int target )
  //{
    // use size() to check for the size/length of the array
	//minimum is always 0(because index starts at 0), so i guess it won't matter
	//you can just do length-1 for the maximum
	
	// int middle = divide the length-1 by 2 (is it rounded down automatically?)
	// traverse the list from index 0 to the middle
	// if any value equals target, return the position
	// else:
		//traverse the list from the middle+1 to length-1
		//if any value equals target, return the position
	//return -1 if target can't be found.
	
	//System.out.println(al.size());
	
	int tPos = -1; //init return var to flag value -1
    int m = (lo + hi) / 2; //init mid pos var

    while( lo <= hi ) { // run until lo & hi cross
     // m = (lo + hi) / 2; //update mid pos var

      // target found
      if ( (int)al.get(m) == target )
        return m;

      // value at mid index higher than target
      else if ( (int)al.get(m) > target )
        hi = m - 1; //move hi to index to left of mid

      // value at mid index lower than target
      else if ( (int)al.get(m) < target )
        lo = m + 1; //move lo to index to right of mid
    }
    return tPos;
	
	
  }
// end binSearch()

*/







  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
   ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
     // retArr.add( Math.random() ); // [0,1)
      retArr.add( (int)Math.random() ); // 0
      retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()


  //return ArrayList of random ints, sorted in ascending order
// public static ArrayList prestoSortedArrayListo(int numItems,int lo, int hi)
  //{
    //ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    //if ( numItems<1 )
      //return retArr;

    //populate index 0
    //retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    //for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
      //System.out.println(retArr.get(i-1));
     //retArr.add( (int)retArr.get(i-1)
      //            + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    //}

   // return retArr;
//  }//end prestoSortedArrayListo()

  public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
	// assume the first item is the smallest - call it our smallest so far
	
	int small = al.get(0);
	int position = 0;
	
	for (int i=1; i < al.size(); i++) {
		if (small > al.get(i)) {
			small = al.get(i);
			position = i;
			
		}
	}
	return position;
	
   }
   
public static void selectionSort(ArrayList al) {
	/*
	1. For loop to traverse the list; for (int i = 0; i < al.size-1; i++)
	2. set temp = i; temp=al.get(i)...?
	3. findSmallest() and store it in temp..i think. So now, smallest is temp.
	4. Put al[0] at wherever i was
	5. Then, put temp into al[0]
	*/
	
	//first loop:
	//traverse the list
	//find lowest
	//swap the lowest value with index 0
	//increase the starting index to 1
	//second loop:
	//traverse the list
	//find lowest
	//swap the lowest value with index 1
	//keep going until everything is sorted; 2 items will be left at the end!
	// ** create a temporary variable to hold the lowest value
	
	
	int smallValue;
	int smallPosition = 0;
	
	for (int i = 0; i < al.size() - 2; i++) {
		
		
		smallPosition = findSmallest(al, i, al.size()-1); //findSmallest returns the position of the smallest value found
		

		smallValue = (int) al.get(i);
		
		
		
		
		al.set(i, al.get(smallValue));
		al.set(smallPosition, al.get(i));
		
		System.out.println(i);
		
		
		/*
		well now I get index out of bounds exception, which means that 
		it probably runs properly! I just have to add bounds!!
		WOW
		
		*/
		
	}
	

	
}
  public static void main( String[] args )
  {
	  
	ArrayList<Integer> myList = new ArrayList<Integer>();
	myList.add(6);
	myList.add(2);
	myList.add(8);
	myList.add(4);
	myList.add(3);
	myList.add(1);
	System.out.println(myList);
	selectionSort(myList);
	System.out.println(myList);
	
	
	

  }//end main

}//end class
