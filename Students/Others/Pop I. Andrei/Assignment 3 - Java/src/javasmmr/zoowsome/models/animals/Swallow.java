package javasmmr.zoowsome.models.animals;

public class Swallow extends Bird {

	public Swallow(int nrLegs, String name, boolean migrates, int avgFlightAltitude) {
		setNrOfLegs(nrLegs);
		setName(name);
		setMigrates(migrates);
		setAvgFlightAltitude(avgFlightAltitude);
	}

	public Swallow() {
		this(2, "Swallow", true, 30);
	}

}
