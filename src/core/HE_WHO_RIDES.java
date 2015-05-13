package core;

public enum HE_WHO_RIDES {
	
	RANDY(170), DAN(180);//pounds
	
	private double weight;

	private HE_WHO_RIDES(double weight) {
		this.weight = weight;
	}
	
	
	public double getWeight(){
		return weight;
	}
	
}
