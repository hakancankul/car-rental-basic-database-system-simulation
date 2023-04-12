
public class CarRequest {
	private int id, office_id, customer_id;
	private String brand, model, clas, start_date, end_date;

	public CarRequest(int office_id, int customer_id, String brand, String model, String clas, String start_date,
			String end_date) {
		super();
		this.office_id = office_id;
		this.customer_id = customer_id;
		this.brand = brand;
		this.model = model;
		this.clas = clas;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getClas() {
		return clas;
	}

	public void setClas(String clas) {
		this.clas = clas;
	}

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}

	public String getEnd_date() {
		return end_date;
	}

	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}

	public String display() {
		return ".CarRequest" + office_id + ";" + customer_id + ";" + brand + ";" + model + ";" + clas + ";" + start_date
				+ ";" + end_date;
	}

}
