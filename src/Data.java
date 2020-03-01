/**
*Data.java - Reason: to create single objects that contain the different parameters.
*@ThaddeusOwl, 01-03-2020
*/


public class Data{

private String details;
private String areas;

public Data(String a, String b){
	details=a;
	areas=b;
}

public String getDetails(){
	return details;
}

public String getAreas(){
	return areas;
}

}
