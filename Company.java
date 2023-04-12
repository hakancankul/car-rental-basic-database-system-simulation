import java.util.Iterator;
import java.util.Random;

public class Company {
	private String name;
	private Office[] offices;
	private Employee[] employees;
	private Car[] cars;
	private Customer[] customers;
	private CarRequest[] carrequests;
	private Contract[] contracts;
	private static int office_counter, employee_counter, car_counter, customer_counter, carrequest_counter,
			contract_counter;

	public Company(String name) {
		this.name = name;
		offices = new Office[100];
		employees = new Employee[100];
		cars = new Car[100];
		customers = new Customer[100];
		carrequests = new CarRequest[100];
		contracts = new Contract[100];
		office_counter = employee_counter = car_counter = customer_counter = carrequest_counter = contract_counter = 1;
	}

	public void addOffice(Office office) {
		offices[office_counter] = office;
		offices[office_counter].setId(office_counter);
		office_counter++;
	}

	public void addEmployee(Employee employee) {

		employees[employee_counter] = employee;
		employees[employee_counter].setId(employee_counter);

		employee_counter++;
	}

	public void addCar(Car car) {
		cars[car_counter] = car;
		cars[car_counter].setId(car_counter);
		car_counter++;
	}

	public void addCustomer(Customer customer) {
		customers[customer_counter] = customer;
		customers[customer_counter].setId(customer_counter);
		customer_counter++;
	}

	public void addCarRequest(CarRequest carrequest) {

		carrequests[carrequest_counter] = carrequest;
		carrequests[carrequest_counter].setId(carrequest_counter);
		for (int i = 1; i < office_counter; i++) {
			for (int j = 1; j < customer_counter; j++) {
				for (int j2 = 1; j2 < car_counter; j2++) {
					if (offices[i].getId() == carrequest.getOffice_id()
							&& customers[j].getId() == carrequest.getCustomer_id()
							&& cars[j2].getBrand().equals(carrequest.getBrand())
							&& cars[j2].getModel().equals(carrequest.getModel())
							&& cars[j2].getClas().equals(carrequest.getClas())) {

						for (int k = 1; k < employee_counter; k++) {
							if (employees[k].getAvailable() == true && employees[k].getOffice_id() == i) {
								String employee = "Employee" + k;
								String customer = "Customer" + j;
								String car = "Car" + j2;

								String[] temp1 = carrequest.getStart_date().split("\\.");
								String[] temp2 = carrequest.getEnd_date().split("\\.");
								int rent_day = Integer.parseInt(temp2[0]) - Integer.parseInt(temp1[0]);

								employees[k].setAvailable(false);
								cars[j2].setAvailable(false);
								customers[j].setAvailable(false);

								Contract c = new Contract(employee, customer, car, carrequest.getStart_date(),
										carrequest.getEnd_date(), rent_day);
								System.out.println("     Contract:" + employee + ";" + customer + ";" + car + ";"
										+ carrequest.getStart_date() + carrequest.getEnd_date());
								addContract(c);

								offices[i].addEmployeeBonus(10);
								offices[i].addExpenses(10);
								carExpenses(offices[i], cars[j2]);

								break;
							}
						}

					}

				}
			}
		}

		carrequest_counter++;

	}

	public void carExpenses(Office office, Car car) {
		Random rnd = new Random();
		int km = (rnd.nextInt(3) + 1) * 100;
		for (int i = 1; i < office_counter; i++) {
			if (offices[i].getId() == car.getOffice_id()) {
				if (car.getClas().equals("economy")) {
					offices[i].addIncomes(100);
					offices[i].addCarExpenses(20);
					offices[i].addExpenses(20);
					if (km == 100) {
						offices[i].addCarExpenses(5);
						offices[i].addExpenses(5);
					} else if (km == 200) {
						offices[i].addCarExpenses(10);
						offices[i].addExpenses(10);
					} else if (km == 300) {
						offices[i].addCarExpenses(15);
						offices[i].addExpenses(15);
					}
				} else if (car.getClas().equals("sports")) {

					offices[i].addIncomes(200);
					offices[i].addCarExpenses(70);
					offices[i].addExpenses(70);
					if (km == 100) {
						offices[i].addCarExpenses(5);
						offices[i].addExpenses(5);
					} else if (km == 200) {
						offices[i].addCarExpenses(10);
						offices[i].addExpenses(10);
					} else if (km == 300) {
						offices[i].addCarExpenses(15);
						offices[i].addExpenses(15);
					}

				} else if (car.getClas().equals("luxury")) {

					offices[i].addIncomes(300);
					offices[i].addCarExpenses(120);
					offices[i].addExpenses(120);
					if (km == 100) {
						offices[i].addCarExpenses(5);
						offices[i].addExpenses(5);
					} else if (km == 200) {
						offices[i].addCarExpenses(10);
						offices[i].addExpenses(10);
					} else if (km == 300) {
						offices[i].addCarExpenses(15);
						offices[i].addExpenses(15);
					}

				}

			}
		}
	}

	public void calcExpenses() {
		for (int i = 1; i < office_counter; i++) {
			for (int j = 1; j < employee_counter; j++) {
				if (employees[j].getOffice_id() == offices[i].getId()) {
					offices[i].addEmployeeSalary(30);
					offices[i].addExpenses(30);

				}
			}
			offices[i].addExpenses(100);
		}
	}

	public void displayProfit() {
		calcExpenses();

		for (int i = 1; i < office_counter; i++) {
			System.out.println("Office" + offices[i].getId() + " incomes: " + offices[i].getIncomes() + "  cp");

			System.out.println("Office" + offices[i].getId() + " expenses: " + offices[i].getExpenses() + "  cp");
			System.out.println("     Office rent:" + 100);
			System.out.println("     Employee salaries:" + offices[i].getEmployeeSalary());
			System.out.println("     Employee performance bonus:" + offices[i].getEmployeeBonus());
			System.out.println("     Car maintenance:" + offices[i].getCarExpenses());
			int profit = offices[i].getIncomes() - offices[i].getExpenses();
			System.out.println("Office" + offices[i].getId() + " profit:" + profit);

			System.out.println();

		}

	}

	public void addContract(Contract contract) {
		contracts[contract_counter] = contract;
		contract_counter++;
	}

	public void listCarRequest() {

		for (int i = 1; i < carrequest_counter; i++) {
			System.out.println("     " + carrequests[i].getId() + carrequests[i].display());
		}

	}

	public void listContract() {
		for (int i = 1; i < contract_counter; i++) {
			System.out.println("     " + i + "." + contracts[i].display());
		}
	}

	public void listOffice() {
		for (int i = 1; i < office_counter; i++) {
			if (offices[i] != null) {
				System.out.println("     " + offices[i].getId() + offices[i].display());
			}

		}
	}

	public void listEmployee(int office_id) {
		for (int i = 1; i < employee_counter; i++) {
			if (employees[i].getOffice_id() == office_id && employees[i].getName() != null) {
				System.out.println("     " + employees[i].getId() + "." + employees[i].display());

			}
		}
	}

	public void listCar(int office_id) {
		for (int i = 1; i < car_counter; i++) {
			if (cars[i].getOffice_id() == office_id) {
				System.out.println("     " + cars[i].getId() + cars[i].display());

			}
		}
	}

	public void listCustomer() {
		for (int i = 1; i < customer_counter; i++) {
			System.out.println("     " + customers[i].getId() + customers[i].display());

		}
	}

	public void deleteOffice(int office_id) {
		int temp = offices[office_id].getId();
		offices[office_id] = null;
		for (int i = 1; i < employee_counter; i++) {
			if (temp == employees[i].getOffice_id()) {
				employees[i].setName(null);
			}
		}

	}

	public void deleteEmployee(int office_id, int employee_id) {
		if (offices[office_id] != null) {
			employees[employee_id].setName(null);
		}
	}

}
