package BusinessLayer;

import java.util.ArrayList;

public class TrainCatalogue {
	//private constructor
	//private TrainCatalogue() {
//
	//    }
	
	static ArrayList<Train> obj1 = new ArrayList<Train>();
	private static TrainCatalogue instance = null;
	
	public void addTrain(Train obj)
	{
		obj1.add(obj);
	}
	
	public void removeTrain(Train t)
	{
		obj1.remove(t);
	}
	
	public static TrainCatalogue  getinstance() {
		// TODO Auto-generated method stub
		if(instance == null)
		{
			instance = new TrainCatalogue();	
		}
		return instance;
	}
	
}
