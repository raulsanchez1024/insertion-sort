import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Driver {
	
	static void insertionSort(String f) throws IOException, URISyntaxException {
//		get file, read file, and store the text into an array
		
		URL url = ClassLoader.getSystemResource(f);

		
		File file = new File(url.toURI()); 
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
//	    reverse arr
	    Collections.reverse(Arrays.asList(arr));
//	    print out
	    for(int i = 0; i < arr.length; i++) {
	    	System.out.println(arr[i]);
	    }

	}


	public static void main(String[] args) throws IOException, URISyntaxException {
		
		String f1 = args[0];
		String f2 = args[1];
		String f3 = args[2];
		
//		Uncomment each block to run test
//		f1 equals istest1.txt
//		f2 equals istest2.txt
//		f3 equals istest3.txt
		
		System.out.println(" ===== File one (istest1.txt) ===== ");
		insertionSort(f1);

//		System.out.println(" ===== File two (istest2.txt) ===== ");
//		insertionSort(f2);
		
//		System.out.println(" ===== File three (istest3.txt) ===== ");
//		insertionSort(f3);

	}

}
