package Entity;

public class Campaign {

	private int id;
	private String campainName;
	private double discount;
	
	public Campaign() {
		// TODO Auto-generated constructor stub
	}
	
	public Campaign(int id, String campainName, double discount) {
		super();
		this.id = id;
		this.campainName = campainName;
		this.discount = discount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCampainName() {
		return campainName;
	}

	public void setCampainName(String campainName) {
		this.campainName = campainName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	
}
