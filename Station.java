package BusinessLayer;

public class Station {
	
	private String Station_Name;
	
	public Station(String stationName) {
		
		// TODO Auto-generated constructor stub
		this.Station_Name=stationName;
		StationCatalogue sc = StationCatalogue.getinstance();
		sc.addStation(this);
	}
	public String getStation_Name() {
		return Station_Name;
	}
	public void setStation_Name(String station_Name) {
		Station_Name = station_Name;
	}
	
}
