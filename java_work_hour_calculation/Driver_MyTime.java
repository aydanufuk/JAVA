import java.util.ArrayList;
import java.util.Scanner;

public class Driver_MyTime {

	static Scanner input_keyboard = new Scanner(System.in);

	public static void menu() {

		System.out.println("<<<Work Hour Calculation>>>");
		System.out.println("1. Exit Time Calculation");
		System.out.println("2. Total Work Hour Calculation");
		System.out.println("3. Exit");
	}

	public static void exitTimeCalculation() {

		MyTime enterance = readMyTime();

		System.out.println("\nYour enterance time : " + enterance.timeString());

		enterance.addHours(9);
		enterance.addMinutes(30);

		System.out.println("Your exit time      : " + enterance.timeString() + "\n");

	}

	public static ArrayList<MyTime> substringProcess(String enter, String exit) {

		ArrayList<MyTime> input_times = new ArrayList<MyTime>();

		int enter_hour = Integer.parseInt(enter.substring(0, 2));
		int enter_minute = Integer.parseInt(enter.substring(3));

		int exit_hour = Integer.parseInt(exit.substring(0, 2));
		int exit_min = Integer.parseInt(exit.substring(3));

		MyTime enter_time_s = new MyTime(enter_hour, enter_minute, 0);
		MyTime exit_time_s = new MyTime(exit_hour, exit_min, 0);

		System.out.println("\nYour enterance time: " + enter_time_s.timeString());
		System.out.println("Your exit time: " + exit_time_s.timeString());

		input_times.add(exit_time_s);
		input_times.add(enter_time_s);

		return input_times;
	}

	public static void totalWorkHourCalculation() {

		System.out.print("Please enter your enterance time (e.g 08:30) : ");
		String input_enterance = input_keyboard.next();
		// String temp = input_keyboard.next();
		System.out.print("Please enter your exit time (e.g 18:00) : ");
		String input_exit = input_keyboard.next();
		// String temp2 = input_keyboard.next();

		ArrayList<MyTime> calc_times = new ArrayList<MyTime>();
		calc_times = substringProcess(input_enterance, input_exit);

		calc_times.get(1);
		calc_times.get(0);

		MyTime result_temp = new MyTime();

		result_temp = result_temp.findDifference(calc_times.get(1), calc_times.get(0));

		System.out.println("Total work hour is: " + result_temp.timeString());
		System.out.println();

	}

	public static MyTime readMyTime() {
		// Scanner input_keyboard = new Scanner(System.in);

		System.out.print("Please enter enterance hour: ");
		int enter_hour = input_keyboard.nextInt();
		System.out.print("Please enter enterance minute: ");
		int enter_minute = input_keyboard.nextInt();

		MyTime temp_time = new MyTime(enter_hour, enter_minute, 0);

		return temp_time;
	}

	public static void main(String[] args) {

		int selection = 0;

		do {
			menu();
			System.out.print("Please enter your choice [1/2/3]: ");

			selection = input_keyboard.nextInt();

			switch (selection) {
			case 1: {

				exitTimeCalculation();
				break;
			}
			case 2: {
				totalWorkHourCalculation();
				break;
			}
			case 3: {
				System.out.println("Exiting...");
				System.exit(1);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + selection);
			}

		} while (selection != 3);

		exitTimeCalculation();

	}
}
