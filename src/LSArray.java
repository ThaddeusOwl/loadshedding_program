/**
*LSArray.java - Reads in Load Shedding Data from file to array
*Provides method to search through it
*@ThaddeusOwl, 01-03-2020
*Use LSArray(int,string) if you want to change the dataset length or input file
*else use LSArray() for default settings
*/



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LSArray{

	Data[] dataArray;
   int insertOpCount=0;
   int searchOpCount=0;
   String fileName="Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt";
   int n=2976;
   /**Reads in file to an array with default dataset lenth and filename */
	public LSArray() throws FileNotFoundException{
		this.dataArray = new Data[n];

		Scanner file=new Scanner(new File(fileName));
		for (int i=0; i<dataArray.length; i++){
			if (file.hasNextLine()){
				String line = file.nextLine();
				String[] lineSplit = line.split(" ", 2);
				dataArray[i] = new Data(lineSplit[0], lineSplit[1]);

			}
		}
	}
   /** reads in specified number of lines for specified file in array*/
   public LSArray(int a, String b) throws FileNotFoundException{
		this.n=a;
      if(b.equals("default")){
      }else{this.fileName=b;}
      this.dataArray = new Data[n];

		Scanner file=new Scanner(new File(fileName));
		for (int i=0; i<dataArray.length; i++){
			if (file.hasNextLine()){
				String line = file.nextLine();
				String[] lineSplit = line.split(" ", 2);
				dataArray[i] = new Data(lineSplit[0], lineSplit[1]);

			}
		}
	}
	/**Searches for the given parameter's match in the array and outputs the corresponding area*/
	public String search(String details){
		String toReturn="Areas not found";
      int j=0;
		for(int i=0; i<dataArray.length; i++){
			searchOpCount++;
         if(details.equals(dataArray[i].getDetails())){
				return dataArray[i].getAreas();
			}
		}
		return toReturn;
	}
	/**Returns String of all parameters/details alongside their corresponding areas */
	public String toString(){
		String toReturn="";
		for(int i=0; i<dataArray.length; i++){
			toReturn = (toReturn+ "\n" + dataArray[i].getDetails() + " "+ dataArray[i].getAreas());
		}
		return toReturn;
	}

	public String toString(String details){
		return search(details);
	}
   /**Returns the number of comparison operators used when insert method was called*/
   public int getInsertOpCount(){
      return insertOpCount;   
   }
   /**Return number of comparison operations used when search method was called */
   public int getSearchOpCount(){
      return searchOpCount;
   }
      
   public void setNumber(int x){
      n=x;}



}
