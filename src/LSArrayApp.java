import java.io.FileNotFoundException;

public class LSArrayApp{

	public static void main(String [] args) throws FileNotFoundException{
		LSArray array = new LSArray();
		if(args.length == 1){
			System.out.println(array.search(args[0]));
		}else{
			System.out.println(array);
		}
	}
}
