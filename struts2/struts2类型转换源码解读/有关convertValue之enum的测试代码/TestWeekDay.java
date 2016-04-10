
public class TestWeekDay {
	
	public static void main(String args[]) {
		
		for (WeekDay day : WeekDay.values()) {
			System.out.println(day + "====>" + day.getDay());
		}
		
		WeekDay.printDay(5);//输出是Fri,而不是Friday！
		
		System.out.println(WeekDay.values());
	}
}
