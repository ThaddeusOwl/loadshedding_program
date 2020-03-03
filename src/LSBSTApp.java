import java.io.FileNotFoundException;

public class LSBSTApp{

	public static void main(String [] args) throws FileNotFoundException{
		//Tree tree = new Tree();
		Tree tree;
      if(args.length == 1){
			tree=new Tree();
         System.out.println(tree.search(args[0]));}
      else if(args.length == 3){ //java LSBSTApp "1_2_3" "200" "diffFile.txt"
         tree=new Tree(Integer.parseInt(args[1]), args[2]);
         //tree.setFileName(args[2]); //change source file
         //tree.setNumber(Integer.parseInt(args[1]));//change number of entries
         System.out.println(tree.search(args[0]));
		}else{
			tree = new Tree();
         tree.allAreas();
		}
      
      System.out.println("Insert Operation Count: " + tree.getInsertOpCount());
      System.out.println("Search Operation Count: " + tree.getSearchOpCount());
	}


}
