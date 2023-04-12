import java.io.*;

public class FileReading {
	String input;
	Company c;

	public FileReading(String input, Company c) {
		this.input = input;
		this.c = c;
	}

	public void inputReading() throws IOException {

		File file = new File("D:\\" + input);
		BufferedReader read = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
		String line;

		while ((line = read.readLine()) != null) {
			line = line.replace("ï", "").replace("»", "").replace("¿", "");
			String[] temp = line.split(";");
			String command = temp[0];
			switch (command) {
			case "addOffice": {
				String phone = temp[1];
				String address = temp[2];
				String city = temp[3];

				Office office = new Office(phone, address, city);

				System.out.println(">" + line);
				c.addOffice(office);
				break;
			}
			case "addEmployee": {
				String name = temp[1];
				String surname = temp[2];
				String gender = temp[3];
				String birth_date = temp[4];
				int office_id = Integer.parseInt(temp[5]);

				Employee employee = new Employee(name, surname, gender, birth_date, office_id);

				System.out.println(">" + line);
				c.addEmployee(employee);
				break;
			}
			case "addCar": {

				String brand = temp[1];
				String model = temp[2];
				String clas = temp[3];
				int km = Integer.parseInt(temp[4]);
				int office_id = Integer.parseInt(temp[5]);

				Car car = new Car(brand, model, clas, km, office_id);

				System.out.println(">" + line);
				c.addCar(car);
				break;
			}
			case "addCustomer": {
				String name = temp[1];
				String surname = temp[2];

				Customer customer = new Customer(name, surname);

				System.out.println(">" + line);
				c.addCustomer(customer);
				break;
			}
			case "addCarRequest": {
				int office_id = Integer.parseInt(temp[1]);
				int customer_id = Integer.parseInt(temp[2]);
				String brand = temp[3];
				String model = temp[4];
				String clas = temp[5];
				String start_date = temp[6];
				String end_date = temp[7];

				CarRequest car_request = new CarRequest(office_id, customer_id, brand, model, clas, start_date,
						end_date);

				System.out.println(">" + line);
				c.addCarRequest(car_request);

				break;
			}
			case "listOffice": {

				System.out.println(">" + line);
				c.listOffice();
				break;
			}
			case "listEmployee": {
				int office_id = Integer.parseInt(temp[1]);
				System.out.println(">" + line);
				c.listEmployee(office_id);
				break;
			}
			case "listCar": {
				int office_id = Integer.parseInt(temp[1]);
				System.out.println(">" + line);
				c.listCar(office_id);
				break;
			}
			case "listCustomer": {
				System.out.println(">" + line);
				c.listCustomer();
				break;
			}
			case "listCarRequest": {
				System.out.println(">" + line);
				c.listCarRequest();
				break;
			}
			case "listContract": {
				System.out.println(">" + line);
				c.listContract();
				break;
			}

			case "deleteOffice": {
				int office_id = Integer.parseInt(temp[1]);
				System.out.println(">" + line);
				c.deleteOffice(office_id);

				break;
			}
			case "deleteEmployee": {
				int office_id = Integer.parseInt(temp[1]);
				int employee_id = Integer.parseInt(temp[2]);
				System.out.println(">" + line);
				c.deleteEmployee(office_id, employee_id);

				break;
			}

			default: {
				System.out.println("Wrong command!");
				break;
			}
			}

		}
		read.close();

	}

}
