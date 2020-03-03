/**
*LSArrayApp.java - Provides load shedding data
*' java LSArrayApp ': prints all load shedding details to standard output
*' java LSArrayApp "2_13_04" ': prints details for Stage 2, 13th of the month, starting time of 04:00
*Author: @ThaddeusOwl, 01-03-2020
*/

import java.io.FileNotFoundException;

public class LSArrayApp{

	public static void main(String [] args) throws FileNotFoundException{
		LSArray array = new LSArray();
		if(args.length == 1){
			System.out.println(array.search(args[0]));
		}else{
			System.out.println(array);
		}
      System.out.println("Insert Operation Count: " + array.getInsertOpCount());
      System.out.println("Search Operation Count: " + array.getSearchOpCount());
	}
}
