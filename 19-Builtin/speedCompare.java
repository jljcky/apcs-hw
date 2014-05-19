import java.util.*;
import java.io.*;

public class speedCompare{
    
    public static void main(String[] args){
        int x = Integer.parseInt(args[0]);

	HashMap<String,String> hm = new HashMap<String,String>();
	TreeMap<String,String> tm = new TreeMap<String,String>();

	long start = System.currentTimeMillis();
	for (int i = 0; i < x; i++){
	    hm.put(Integer.toString(i), "foo");
	}

	long end = System.currentTimeMillis();
	System.out.print("HashMap with " + x + " items: ");
	System.out.println(end - start);

	start = System.currentTimeMillis();
	for (int i = 0; i < x; i++){
	    tm.put(Integer.toString(i), "foo");
	}

	end = System.currentTimeMillis();
	System.out.print("TreeMap with " + x + " items: ");
	System.out.println(end - start);

	
    }
}
