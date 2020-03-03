import java.io.FileNotFoundException;

public class LSBSTApp{

	public static void main(String [] args) throws FileNotFoundException{
		Tree tree = new Tree();
		
      if(args.length == 1){
			System.out.println(tree.search(args[0]));
		}else{
			tree.allAreas();
		}
      
      System.out.println("Insert Operation Count: " + tree.getInsertOpCount());
      System.out.println("Search Operation Count: " + tree.getSearchOpCount());
	}


}
