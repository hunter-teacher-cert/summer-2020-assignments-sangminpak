import java.io.*;
import java.util.*;
import java.awt.Rectangle;

public class Test {
	
	


public static void main(String[] args) {
	
	Rectangle box1 = new Rectangle (0, 0, 100, 200);
	Rectangle box2 = box1;
    
	
	System.out.println(box2.width);
	box1.grow(50, 50);
	System.out.println(box2.width);
	System.out.println(box2.height);
	System.out.println(box2.x);
	System.out.println(box2.y);
	
}

}