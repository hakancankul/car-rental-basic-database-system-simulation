
public class Contract {

	private String employee, customer, car, start_date, end_date;
	private int day;

	public Contract(String employee, String customer, String car, String start_date, String end_date, int day) {

		this.employee = employee;
		this.customer = customer;
		this.car = car;
		this.start_date = start_date;
		this.end_date = end_date;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day -= day;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getCar() {
		return car;
	}

	public void setCar(String car) {
		this.car = car;
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
		return "Contract:" + employee + ";" + customer + ";" + car + ";" + start_date + ";" + end_date;
	}

}
