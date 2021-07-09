//stolen from Joshua's gist, with my own notes added.
//this was very similar to my thought process; choose the smaller item of the 2, and the index in the array?list? of that smaller item should increase by 1.
//so it's basically moving the pointer to the right once they find a smallest value.
//the recursion method is still hard because I can't really visually see what's going on.

public static ArrayList<Integer> merge(ArrayList<Integer> a,
                                         ArrayList<Integer> b) {
                                         
    //this takes in 2 arraylists, one for bottom half the other for top half
   
    
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int indexA = 0;
    int indexB = 0;
    
    //these variables are basically the position #
    //the new arraylist holds the sorted values

 
 
 //while the position# is less than their size of the arraylist, the loop will continue to run.
 //remember, the size is the # of the elements(?) but the position # starts from 0, so it's always 1 less than.
 //BOTH position #s in the arraylists should be less! therefore the &&

    while (indexA < a.size() && indexB < b.size()){

      if (a.get(indexA) < b.get(indexB)){
     //if the value of the indexA is smaller than that of index B
     
        arr.add(a.get(indexA));
        
        //add the value of index A into the new array called arr.
        
        indexA++;
        //moves the pointer (or increases the position #) by 1
       
      }//end if-statement
      
      
      else{
      //if the value of the index B is smaller than that of index B,
      
        arr.add(b.get(indexB));
        
       //add the value of index B to arr.
       
        indexB++;
        
       //and also move the pointer by 1
      }//end else-statement
    }//end while loop
    

    if (indexA == a.size()){
    
    //so now, this is to check if they finished checking for the whole arraylist.
    //If the indexA is equal to the arraylist size, it has reached the end of the arraylist, sooooo
    
      //System.out.println(indexB); <- this was in the original code from Joshua, but I'm wondering if I really need this
      
      
      while (indexB < b.size()){
      //while the index B reaches the end,
      
        arr.add(b.get(indexB));
        indexB++;
        //copy over the values in the current arraylist to the new arraylist arr
      }//end while-loop
    }//end if-statement

    else{
      while (indexA < a.size()){
      //if the arraylist a has stuff left over,
        arr.add(a.get(indexA));
        indexA++;
        //copy the remaining values into the new arraylist
        
      }//end loop
    }//end else-statement

    //return the new list
    return arr;
  }//merge
