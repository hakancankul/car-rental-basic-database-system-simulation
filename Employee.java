
public class Employee {
	private String name, surname, gender, birth_date;
	private int office_id, id;
	private boolean available;

	public Employee(String name, String surname, String gender, String birth_date, int office_id) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birth_date = birth_date;
		this.office_id = office_id;
		this.available = true;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
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

	public String display() {
		return "Employee;" + name + ";" + surname + ";" + gender + ";" + birth_date + ";" + office_id;
	}

}
