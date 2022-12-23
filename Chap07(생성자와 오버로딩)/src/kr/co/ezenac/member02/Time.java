package kr.co.ezenac.member02;

public class Time {
		
		private int hour;
		private int minute;
		private int second;
		
//getter===========================
		public int getHour() {
			return this.hour;
		}
//setter===========================
		public void setHour(int hour) {
			//예외처리 코드 작성
			if(hour < 0 || hour > 23) {
				System.out.println("시간을 잘못 입력하셨습니다.");
				return;
			}
			 this.hour = hour;		//입력받은 hour의 값을 private int hour(멤버변수, 필드)에 저장
		}
//getter===========================
		public int getMinute() {
			return this.minute;
		}
//setter===========================
		public void setMinute(int minute) {
			//분에 대한 예외처리 코드 작성
			if(minute < 0 || minute > 59 ) {
				System.out.println("분을 잘못 입력하셨습니다.");
				return;
			}
			 this.minute = minute;
		}
//getter===========================
		public int getSecond() {
			return this.second;
		}
//setter===========================
		public void setSecond(int second) {
			//분에 대한 예외처리 코드 작성
			if(second < 0 || second > 59 ) {
				System.out.println("초를 잘못 입력하셨습니다.");
				return;
			}
			 this.second = second;
		}
//=================================
		
		@Override
		public String toString() {
		
		return this.getHour() + "시" + this.getMinute() + "분" + this.getSecond() + "초 입니다.";
		}
		
}
		