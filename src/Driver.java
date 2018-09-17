import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Driver {
	
	static void insertionSort() throws IOException {
//		get file, read file, and store the text into an array
		
		File file = new File("/Users/raulsanchez/Desktop/COMP 2370/Project1/src/istest3.txt"); 
	    Scanner sc = new Scanner(file); 
	    			  
//	    insert all words into an ArrayList (arrList)
	    ArrayList<String> arrList = new ArrayList<String>();
	    while (sc.hasNext()) {
	    	arrList.add(sc.next());
	    }
	    
//	   convert arrList to a regular array
	    String[] arr = arrList.toArray(new String[0]);
	    
//	    close scanner
	    sc.close();
	    
//	    insertionSort
	    for(int j = 1; j < arr.length; j++) {
    	String key = arr[j];
    	int i = j - 1;
    	while (i >= 0 && key.compareTo(arr[i]) > 0) {
            arr[i + 1] = arr[i];
            i--;
        }
        arr[i + 1] = key;
    }
	    Collections.reverse(Arrays.asList(arr));
	    System.out.println(Arrays.toString(arr));

	}


	public static void main(String[] args) throws IOException {
		
		insertionSort();
		

	}

}
