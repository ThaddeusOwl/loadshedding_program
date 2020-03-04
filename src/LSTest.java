import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LSTest{

public static void main(String [] args) throws FileNotFoundException{

	String[] parameters;
	//LSArray array;
	//Tree tree;
	String[] lines = new String[2976];
   int[] dataset=new int[]{10, 297, 593, 947, 1243, 1647, 1943, 2227, 2543, 2976};
	Scanner file=new Scanner(new File("randomizedLSD.txt"));
		for(int i=0; i<2976; i++){
			String line = file.nextLine();
			String[] lineSplit = line.split(" ", 2);
			lines[i]=lineSplit[0];
      }
   
   System.out.println("Dataset length,BSTInsertOpCount,BSTSearchOpCount,ArrayInsertOpCount,ArraySearchOpCount"+"\n");
	for(int i=0; i<dataset.length; i++){
		//System.out.println("\n"+"Dataset length: "+dataset[i]+"\n");
      for(int j=0; j<dataset[i]; j++){
			//System.out.println("BSTApp search: "+lines[j]);
         String[] inputParam= new String[]{lines[j],String.valueOf(dataset[i]),"randomizedLSD.txt"};
         LSBSTApp.main(inputParam);
         //System.out.println("\b"+"\b");
			//String searchResult=tree.search(lines[j]);
			//System.out.println()
         //System.out.println("LSArrayApp search: "+lines[j]);
         LSArrayApp.main(inputParam);
		}
	}



}


}
