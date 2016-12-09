package org.cuatrovientos.spring;

public class Commander {
	private String name;
	private String race;

	public Commander() {
		super();
	}

	public Commander(String name, String race) {
		super();
		this.name = name;
		this.race = race;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	@Override
	public String toString() {
		return "Commander [name=" + name + ", race=" + race + "]";
	}

}
