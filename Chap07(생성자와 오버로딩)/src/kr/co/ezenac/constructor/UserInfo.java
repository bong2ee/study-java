package kr.co.ezenac.constructor;

public class UserInfo {
		
		String userId;
		String userPassWord;
		String userName;
		String userAddress;
		String PhoneNumber;
		
		public UserInfo() {		//기본생성자
			
		}

		public UserInfo(String userId, String userPassWord, String userName) {
			//super();
			this.userId = userId;
			this.userPassWord = userPassWord;		
			this.userName = userName;
		}	//기본생성자가 아닌 생성자 추가(오버로딩)
			//생성자를 추가했기 때문에 컴파일러가 자동으로 기본생성자 생성x
		
		public String showUserInfo() {		//멤버메서드
			return "고객님의 아이디는 : " + userId + "이고, 등록된 이름은 : " + userName + "입니다.";
		}
		
		
		
		
}
