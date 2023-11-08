package models;

public class Heels extends Foot {
	private double height;

	public Heels(String id, String name, int price, String type, double height) {
		super(id, name, price, type);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public void keciaw() {
		System.out.println("Putu anjg");
		
	}


	
	






}
