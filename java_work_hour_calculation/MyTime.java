
public class MyTime {

	private int hour; // 0 - 23
	private int minute; // 0 - 59
	private int second; // 0 - 59
	private static final int HOURS_PER_DAY = 24;
	private static final int MIN_PER_HOUR = 60;

	public MyTime() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
	}

	public MyTime(int hour, int minute, int second) {

		if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
			throw new IllegalArgumentException("hour, minute and/or second was out of range");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public String timeString() {
		return String.format("%02d:%02d", hour, minute);
		// return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int v_hour) {
		this.hour = (v_hour % HOURS_PER_DAY);
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int v_minute) {
		if (v_minute >= 0 && v_minute <= 59) {
			this.minute = v_minute;
		}
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
		}
	}

	public void addHours(int h_add) {
		setHour(this.hour + h_add);
	}

	public void addMinutes(int m_add) {

		int new_hour = this.hour + (m_add + this.minute) / MIN_PER_HOUR;
		int new_minute = (this.minute + m_add) % MIN_PER_HOUR;

		setHour(new_hour);
		setMinute(new_minute);
	}
	/*
	 * public void addMinutes( int madd ) { MyTime( ( this.hour + ( this.minute +
	 * madd ) / this.MIN_PER_HOUR ), ( this.minute + madd ) % this.MIN_PER_HOUR ); }
	 */

	public MyTime findDifference(MyTime enter_time, MyTime exit_time) {
		MyTime totalHour = new MyTime();
		
		if(exit_time.minute < enter_time.minute) {			
			totalHour.setMinute((exit_time.minute + 60) - enter_time.minute);
			totalHour.setHour((exit_time.hour - 1) - enter_time.hour);
		}
		else {
			totalHour.setMinute(exit_time.minute- enter_time.minute);
			totalHour.setHour(exit_time.hour - enter_time.hour);
		}	
		
		return totalHour;
	}
	@Override
	public String toString() {
		return "MyTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}

}
