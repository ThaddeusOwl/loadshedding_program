/**
*LSArrayApp.java - Provides load shedding data
*' java LSArrayApp ': prints all load shedding details to standard output
*' java LSArrayApp "2_13_04" ': prints details for Stage 2, 13th of the month, starting time of 04:00
*Author: @ThaddeusOwl, 01-03-2020
*/

import java.io.FileNotFoundException;

public class LSArrayApp{

	public static void main(String [] args) throws FileNotFoundException{
		LSArray array;
		if(args.length == 1){
			array = new LSArray();
         System.out.println(array.search(args[0]));}
      else if(args.length == 3){ //java LSArrayApp "1_2_3" "200" "diffFile.txt"
         array = new LSArray(Integer.parseInt(args[1]),args[2]);
         //array.setFileName(args[2]); //change source file
         //array.setNumber(Integer.parseInt(args[1]));//change number of entries
         System.out.println(array.search(args[0]));}
      else{
			array = new LSArray();
         System.out.println(array);}
      System.out.println("Insert Operation Count: " + array.getInsertOpCount());
      System.out.println("Search Operation Count: " + array.getSearchOpCount());
	}
}
