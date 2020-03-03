/**
*LSArray.java - Reads in Load Shedding Data from file to array
*Provides method to search through it
*@ThaddeusOwl, 01-03-2020
*/



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LSArray{

	Data[] dataArray;
   int insertOpCount=0;
   int searchOpCount=0;
   
	public LSArray() throws FileNotFoundException{
		this.dataArray = new Data[2976];

		Scanner file=new Scanner(new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
		for (int i=0; i<dataArray.length; i++){
			if (file.hasNextLine()){
				String line = file.nextLine();
				String[] lineSplit = line.split(" ", 2);
				dataArray[i] = new Data(lineSplit[0], lineSplit[1]);

			}
		}
	}
	
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

   public int getInsertOpCount(){
      return insertOpCount;   
   }
   
   public int getSearchOpCount(){
      return searchOpCount;
   }



}
