package kr.co.ezenac.object;

/*
 * 날짜를 구현한 클래스 MyDate가 있습니다.
 * 날짜가 같으면 equals() 메서드 결과가 true가 되도록 구현하시오.
 * hashCode() 메서드도 구현해 보시오.
 */
class MyDate {
	
	private int month;
	private int date;
	private int year;
	
	
	public MyDate(int date, int month, int year) {
		//super();
		this.month = month;
		this.date = date;
		this.year = year;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate mdate = (MyDate)obj;
			if(this.date == mdate.date && this.month == mdate.month && this.year == mdate.year)
				return true;
			else 
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return date;
	}
}

public class MyDateTest {
	public static void main(String[] args) {
		MyDate date1 = new MyDate(2, 9, 2022);
		MyDate date2 = new MyDate(2, 9, 2022);
		
		System.out.println(date1.equals(date2));
		System.out.println(date1.hashCode());
		System.out.println(date2.hashCode());
	}
}
