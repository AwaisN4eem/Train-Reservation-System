package BusinessLayer;

import java.util.ArrayList;

public class StationCatalogue {
	
	static ArrayList<Station> sc =new ArrayList<Station>();
	private static StationCatalogue instance = null;
	static int count;
	
	public void addStation(Station S) {
		sc.add(S);
		count++;
	}
	
	public static StationCatalogue  getinstance() {
		// TODO Auto-generated method stub
		if(instance == null)
		{
			instance = new StationCatalogue();	
		}
		return instance;
	}
}
