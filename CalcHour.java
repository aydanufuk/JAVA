import java.util.Scanner;

public class CalcHour {
	
	public static void main(String[] args) {
		System.out.print("-------------------------\n");
		System.out.print("Calculate My Work Hour ;)\n");
		System.out.println("-------------------------");
		
		System.out.print("Please enter your work start hour\nexample 08:30\nyour input => ");
		String hourPart = "";
		String minutePart = "";
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		
		System.out.println("Your start hour is: " + input);
		hourPart = input.substring(0,2);
		minutePart = input.substring(3);
		
		//System.out.println(hourPart);
		//System.out.println(minutePart);
		
		int hp = Integer.parseInt(hourPart);
		int mp = Integer.parseInt(minutePart);
		
		//System.out.println(hp);
		//System.out.println(mp);
		int hpp = 9;
		int mpp = 30;
		
		int hour = hp + hpp;
		int minute = mp + mpp;
		int addMinute = 0;
		
		if(minute >= 60) {
			addMinute = minute % 60;
			hour++;
			
			minute = addMinute;
		}
		String output = String.valueOf(hour) + ":" + String.valueOf(minute);
		//System.out.println("total hour is: " + hour + " total minute is: " + minute);
		System.out.println("\n<<<You can run at " + output + " :D>>>");
		
	}

}
