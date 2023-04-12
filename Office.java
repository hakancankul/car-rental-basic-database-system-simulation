
public class Office {

	private String phone, address, city;
	private int id, incomes, expenses, employee_salary, employee_bonus, car_expenses;

	public Office(String phone, String address, String city) {

		this.phone = phone;
		this.address = address;
		this.city = city;
		this.incomes = 0;
		this.expenses = 0;
		this.employee_salary = 0;
		this.employee_bonus = 0;
		this.car_expenses = 0;

	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
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
		this.incomes += incomes;
	}

	public int getEmployeeSalary() {
		return employee_salary;
	}

	public void addEmployeeSalary(int employee_salary) {
		this.employee_salary += employee_salary;
	}

	public int getEmployeeBonus() {
		return employee_bonus;
	}

	public void addEmployeeBonus(int employee_bonus) {
		this.employee_bonus += employee_bonus;
	}

	public int getExpenses() {
		return expenses;
	}

	public void addExpenses(int expenses) {
		this.expenses += expenses;
	}

	public int getCarExpenses() {
		return car_expenses;
	}

	public void addCarExpenses(int car_expenses) {
		this.car_expenses += car_expenses;
	}

	public String display() {
		return ".Office;" + phone + ";" + address + ";" + city;
	}

}
