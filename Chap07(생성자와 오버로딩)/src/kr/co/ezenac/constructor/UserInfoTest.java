package kr.co.ezenac.constructor;

public class UserInfoTest {

	public static void main(String[] args) {
		
		UserInfo userinfo = new UserInfo();		//기본 생성자
		userinfo.userId = "ezen";
		userinfo.userPassWord = "0111";
		userinfo.userName = "Admiral Yi";
		System.out.println(userinfo.showUserInfo());
		
		UserInfo userinfo2 = new UserInfo("ezenac", "2023", "Shin");
		System.out.println(userinfo2.showUserInfo());		//추가 생성자
	}

}
