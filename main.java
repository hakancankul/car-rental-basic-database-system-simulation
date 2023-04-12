import java.io.*;
import java.util.Scanner;

public class main {

	public static void main(String[] args) throws IOException {

		Company c = new Company("DEUCENG Car Rental Company");
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		while (flag == true) {
			System.out.print(">>>");
			String input = scan.next();
			String[] temp = input.split(";");

			if (temp[0].equals("load")) {

				String file_name = temp[1];
				FileReading f = new FileReading(file_name, c);
				f.inputReading();

			} else if (temp[0].equals("deleteOffice")) {
				int id = Integer.parseInt(temp[1]);
				c.deleteOffice(id);
			} else if (temp[0].equals("deleteEmployee")) {
				int office_id = Integer.parseInt(temp[1]);
				int id = Integer.parseInt(temp[2]);
				c.deleteEmployee(office_id, id);
			} else if (input.equals("nextday")) {
				System.out.println("Office-profits");
				c.displayProfit();

			}

			else if (input.equals("exit")) {
				flag = false;
			} else {
				System.out.println("Wrong command");
			}

		}

//		Company c = new Company("DEUCENG Car Rental Company");
//		FileReading f = new FileReading("input.txt", c);
//		f.inputReading();

	}

}
