
public class TestWeekDay {
	
	public static void main(String args[]) {
		
		for (WeekDay day : WeekDay.values()) {
			System.out.println(day + "====>" + day.getDay());
		}
		
		WeekDay.printDay(5);//�����Fri,������Friday��
		
		System.out.println(WeekDay.values());
	}
}
