import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LSArray{

	Data[] dataArray;

	public LSArray(){
		this.dataArray = new Data[2976];

		Scanner file=new Scanner(new File("Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt"));
		for (int i=0, i<dataArray.length(), i++){
			if (file.hasNextLine()){
				String line = file.nextLine();
				String[] lineSplit = lineSplit(" ", 2);
				dataArray[i] = new Data(lineSplit[0], lineSplit[1]);

			}
		}
	}



}
