package solarsystem;

import java.io. *;
import java.math.*;
import java.util.*;

public class Satellite extends CelestialBody {
	protected String parentPlanet;

	public Satellite(){
		super();
	}

	public Satellite(String name, double diameter, double mass, double life){
		super(name, diameter, mass, life);
	}

	public Satellite(String name, double diameter, double mass, double life, String parent){
		super(name, diameter, mass, life);
		parentPlanet = parent;
	}

	public String getParentPlanet(){
		return parentPlanet;
	}

	public void setParentPlanet(String newValue){
		this.parentPlanet = newValue;
	}

	public String toString(){
		return super.toString() + " It is satellite of " + getParentPlanet() + "\n";
	}
}