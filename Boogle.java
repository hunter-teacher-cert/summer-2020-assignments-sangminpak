/**
   classwork -- Day 11 | 0b1011 | 0x0b
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
  public static int binSearch( ArrayList al, int target )
  {
    	int small = al.get(0);
	
	for (int i=1; i < al.size(); i++) {
		if (small > al.get(i)) {
			small = al.get(i); 
		}
	}
	return small;
  }//end binSearch()



	 
	




  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()


  //return ArrayList of random ints, sorted in ascending order
  public static ArrayList prestoSortedArrayListo(int numItems,
                                                 int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
      //System.out.println(retArr.get(i-1));
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()

  //##################################################
  //##################################################

    // find and return the index of the smallest value in the
    // ArrayList al from index lo to index hi inclusive 
    public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
	// assume the first item is the smallest - call it our smallest so far
	

	// loop over all the items
	//   if the current item is smaller than the smalleest so far,
	//      then the current item becomes the new smallest so far


	// change this to return the correct answer
	return -1;
    }


  //##################################################
  //##################################################
	
public static void selectionSort(ArrayList al) {
	
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
	
	int temp;
	int startIndex;
	
	if (al[0] == null) {
		return null;
	}
	
	for (int i = 0; i < al.size() - 2; i++) {
		startIndex = 0;
		temp = findSmallest(al, startIndex, al.size());
		al[i] = al[startIndex]
		al[startIndex] = temp;
		startIndex ++;
	}
		
		
		
	


  public static void main( String[] args )
  {

      
    /*~~~~v~~~~~~move~me~down~~~1~block~at~a~time~~~~~~~~~~v~~~~
      
      int smallIndex;
      System.out.println("Testing findSmallest");
      ArrayList<Integer>  slist = prestoArrayListo(20,0,200);
      smallIndex = findSmallest(slist,0,slist.size());
      System.out.println(slist);
      System.out.printf("Smallest is at slist[%d] and is %d\n",smallIndex,slist.get(smallIndex));
      
      ~~~~^~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~^~~~~*/

}//end main

}//end class
