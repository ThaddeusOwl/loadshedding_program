import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tree{

	BinarySearchTree<Data> bst;
   String fileName="Load_Shedding_All_Areas_Schedule_and_Map.clean.final.txt";
   int n=2976;
   
   public Tree() throws FileNotFoundException{
		bst = new BinarySearchTree<Data>();
		Scanner file=new Scanner(new File(fileName));
		for(int i=0; i<n; i++){
			String line = file.nextLine();
			String[] lineSplit = line.split(" ", 2);
         bst.insert(new Data(lineSplit[0],lineSplit[1]));
		}
   }
   
   public Tree(int a, String b) throws FileNotFoundException{
		this.n=a;
      if(b.equals("default")){
      }else{this.fileName=b;}
      bst = new BinarySearchTree<Data>();
		Scanner file=new Scanner(new File(fileName));
		for(int i=0; i<n; i++){
			String line = file.nextLine();
			String[] lineSplit = line.split(" ", 2);
         bst.insert(new Data(lineSplit[0],lineSplit[1]));
		}
   }
      
   public String search(String details){
      Data a = new Data(details);
      BinaryTreeNode<Data> b = bst.find(a);
      if(b!=null){
         return b.data.getAreas();
      }else{return "Areas not found";}
      //return (bst.find(new Data(details)).data.getAreas());
   }
   
   public void allAreas(){
      bst.inOrder();
   }
   
   public int getInsertOpCount(){
      return bst.insertOpCount;   
   }
   
   public int getSearchOpCount(){
      return bst.searchOpCount;
   }
   
   //public void setFileName(String x){
      //if(x.equals("default")){
      //}else{fileName=x;}
   //}
      
   //public void setNumber(int x){
      //n=x;}

}
