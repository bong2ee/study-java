package kr.co.ezenac.set;

public class Member {

	private int memberId;		//회원 아이디
	private String memberName;		//회원 이름
	
	
	public Member(int memberId, String memberName) {		//매개변수 O 생성자
		//super();
		this.memberId = memberId;
		this.memberName = memberName;
	}

	// g  s

	public int getMemberId() {
		return memberId;
	}


	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}


	public String getMemberName() {
		return memberName;
	}


	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	
	@Override
	public String toString() {
		
		return memberName + "회원님의 아이디는 " + memberId + " 입니다.";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;		//다운캐스팅
			if(this.memberId == member.memberId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		
		return memberId;
	}
	
}
