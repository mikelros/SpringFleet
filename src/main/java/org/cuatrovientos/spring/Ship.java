package org.cuatrovientos.spring;

public class Ship {
	private String name;
	private String type;
	private Commander captain;

	public Ship() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Commander getCaptain() {
		return captain;
	}

	public void setCaptain(Commander captain) {
		this.captain = captain;
	}

	@Override
	public String toString() {
		return "Ship [name=" + name + ", type=" + type + ", captain=" + captain + "]";
	}

}
