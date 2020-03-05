/**
*LSArrayApp.java - Provides load shedding data
*' java LSArrayApp ': prints all load shedding details to standard output
*' java LSArrayApp "2_13_04" ': prints details for Stage 2, 13th of the month, starting time of 04:00
*' java LSArrayApp searchDetails datasetLength fileName ': same as above but changes default dataset length and input file 
*Author: @ThaddeusOwl, 01-03-2020
*/

import java.io.FileNotFoundException;

public class LSArrayApp{

	public static void main(String [] args) throws FileNotFoundException{
		LSArray array;
		if(args.length == 1){
			array = new LSArray();
         System.out.println(array.search(args[0]));
         System.out.println("Insert Operation Count: " + array.getInsertOpCount());
         System.out.println("Search Operation Count: " + array.getSearchOpCount());}
      else if(args.length == 3){ //java LSArrayApp "1_2_3" "200" "diffFile.txt"
         array = new LSArray(Integer.parseInt(args[1]),args[2]);
         array.search(args[0]);
         System.out.println(array.getInsertOpCount()+","+array.getSearchOpCount());
      }else{
			array = new LSArray();
         System.out.println(array);
      System.out.println("Insert Operation Count: " + array.getInsertOpCount());
      System.out.println("Search Operation Count: " + array.getSearchOpCount());}
	}
}
