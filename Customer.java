
public class Customer {
	private String name, surname;
	private int id;
	private boolean available;

	public Customer(String name, String surname) {
		super();
		this.name = name;
		this.surname = surname;
	}

	public boolean getAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String display() {
		return ".Customer;" + name + ";" + surname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
