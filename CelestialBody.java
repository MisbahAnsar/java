package solarsystem;

public class CelestialBody implements Speed {
    protected String name;
    protected double diameter;
    protected double mass;
    protected double life;
    protected double sRot;
    protected double sRev;

    public CelestialBody() {}

    public CelestialBody(String name, double diameter, double mass, double life) {
        this.name = name;
        this.diameter = diameter;
        this.mass = mass;
        this.life = life;
    }

    
    public String toString() {
        return name + " is a CelestialBody having \n\t diameter " + diameter + " km, \n\t mass of " + mass + " kg, and \n\t life of " + life + " LYS\n";
    }

    public double getDiameter() {
        return diameter;
    }

    public double getLife() {
        return life;
    }

    public String getName() {
        return name;
    }

    public void setDiameter(double newValue) {
        this.diameter = newValue;
    }

    public void setMass(double newValue) {
        this.mass = newValue;
    }

    
    public double getSpeedOfRevolution() {
        return sRev;
    }

    
    public double getSpeedOfRotation() {
        return sRot;
    }

    public void setSpeedOfRevolution(double speedRv) {
        sRev = speedRv;
    }

    public void setSpeedOfRotation(double speedRt) {
        sRot = speedRt;
    }
}
