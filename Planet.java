package solarsystem;

public class Planet extends CelestialBody{
	protected int noOfSatellites;
	protected Satellite[] satelliteObjs;
	protected String parentStar;

	public Planet(String name, double diamter, double mass, double life){
		super(name, diamter, mass, life);
	}

	public Planet(String name, double diameter, double mass, double life, String parent, Satellite[] sat){
		super(name, diameter, mass, life);
		parentStar = parent;
		noOfSatellites = sat.length;
		satelliteObjs = sat;
	}

	public int getNoOfSatellites(){
		return noOfSatellites;
	}

	public String getParentStar(){
		return parentStar;
	}

	public Satellite[] getSatellteOnjs(){
		return satelliteObjs;
	}

	public void setNoOfSatellites(int newValue){
		this.noOfSatellites = newValue;
	}

	public void setParentStar(String newValue){
		this.parentStar = newValue;
	}

	public void setSatelliteObjs(Satellite[] newValue){
		this.satelliteObjs = newValue;
	}

	public String toString(){
		String s="";
		for(int i = 0; i<satelliteObjs.length;i++){
			if(satelliteObjs[i]!=null){
				s += satelliteObjs[i].toString();
			}
		}
	return super.toString() + "It is a planet moving around"+ getParentStar()+ "having" + getNoOfSatellites() + " satellites whose details are as follows\n"+ s;
	}
}