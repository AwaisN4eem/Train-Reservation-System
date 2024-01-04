package BusinessLayer;

public class Train {
	
	private String train_Name;
	private String train_Arrival;
	private String train_Destination;
	

	public Train(String nameofTrain, String arrival, String destination) {
		this.train_Name = nameofTrain;
		this.train_Arrival = arrival;
		this.train_Destination = destination;
		
		TrainCatalogue tc = TrainCatalogue.getinstance();
		tc.addTrain(this);
	}


	public String getTrain_Destination() {
		return train_Destination;
	}


	public void setTrain_Destination(String train_Destination) {
		this.train_Destination = train_Destination;
	}


	public String getTrain_Arrival() {
		return train_Arrival;
	}


	public void setTrain_Arrival(String train_Arrival) {
		this.train_Arrival = train_Arrival;
	}


	public String getTrain_Name() {
		return train_Name;
	}


	public void setTrain_Name(String train_Name) {
		this.train_Name = train_Name;
	}

}
