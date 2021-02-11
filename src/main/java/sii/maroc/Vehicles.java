package sii.maroc;

public class Vehicles {
	
	private String Type_automobiles;

	public Vehicles() {
	}

	public Vehicles(String type) {
		super();
		Type_automobiles = type;

	}

	public String move(String Type_automobiles, String Vehicles , String DOORS_automobiles, String Nb_km_automobiles) {
		String Detail_automobiles = "";
		if (Type_automobiles.equals("Car") && DOORS_automobiles!=null && Nb_km_automobiles!=null )
			Detail_automobiles += "DOORS OK, MOVING. The " + Type_automobiles + " will consume " + 200 * (5 / 100);
		else if ( Type_automobiles.equals("TRUCK") && DOORS_automobiles!=null && Nb_km_automobiles!=null  ) {
			Detail_automobiles += "DOORS OK, MOVING. The " + Type_automobiles + " will consume " + 1000 * (6 / 100);
		} else if (Type_automobiles.equals("MOTORCYCLE") && DOORS_automobiles!=null && Nb_km_automobiles!=null) {
			Detail_automobiles += "DOORS OK, MOVING. The " + Type_automobiles + " will consume " + 50 * (3 / 100);
		}
		return Detail_automobiles;
	}

}
