public class LSArrayApp{

	public static void main(String [] args){
		array = new LSArray();
		if(args.length == 1){
			array.toString(args);
		}else{
			array.toString();
		}
	}
}
