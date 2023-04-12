
public class Car {
	private String brand, model, clas;
	private int km, office_id, id;
	private boolean available;
	private int incomes;

	public Car(String brand, String model, String clas, int km, int office_id) {

		this.brand = brand;
		this.model = model;
		this.clas = clas;
		this.km = km;
		this.office_id = office_id;
		this.available = true;
		this.incomes = 0;
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

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	public int getOffice_id() {
		return office_id;
	}

	public void setOffice_id(int office_id) {
		this.office_id = office_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIncomes() {
		return incomes;
	}

	public void addIncomes(int incomes) {
		this.incomes = incomes;
	}

	public String display() {
		return ".Car;" + brand + ";" + model + ";" + clas + ";" + km + ";" + office_id;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
