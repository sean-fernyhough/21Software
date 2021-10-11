package com.qa.encap;

public class Gun extends Weapon{

	private String type;
	private float calibre;
	private boolean supportsAttachments;
	private String manufacturer;

	public Gun(int damage, String name, String type, float calibre, boolean supportsAttachments, float cost,
			String manufacturer) {
		super(damage, manufacturer, cost);
		this.damage = damage;
		this.name = name;
		this.type = type;
		this.calibre = calibre;
		this.supportsAttachments = supportsAttachments;
		this.cost = cost;
		this.manufacturer = manufacturer;
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

	public float getCalibre() {
		return calibre;
	}

	public void setCalibre(float calibre) {
		
		if(calibre == 5.56f || calibre == 7.62f || calibre == 0.357){
			
			this.calibre = calibre;
		}else {
			System.out.println("invalid calibre");
		}
	}

	public boolean isSupportsAttachments() {
		return supportsAttachments;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		if (cost > 10000 || cost < 1000) {
			System.out.println("cost out of bounds");
		} else {
			this.cost = cost;
		}
	}

	public String getManufacturer() {
		return manufacturer;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
