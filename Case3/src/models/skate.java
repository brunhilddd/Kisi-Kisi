package models;

public class skate extends Foot {
	private int total;


	public skate(String id, String name, int price, String type, int total) {
		super(id, name, price, type);
		this.total = total;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public void keciaw() {
		System.out.println("Pael anjg");
		
	}

	
	





}
