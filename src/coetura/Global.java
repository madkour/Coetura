package coetura;

import java.sql.Time;

public class Global {
	private static int day = 0;
	private static Time time = new Time(0);
	public static int getDay() {
		return day;
	}
	public static void setDay(int day) {
		Global.day = day;
	}
	public static Time getTime() {
		return time;
	}
	public static void setTime(Time time) {
		Global.time = time;
	}

}
