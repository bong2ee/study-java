package kr.co.ezenac.list;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArraylist = new MemberArrayList();
		
		Member memberL = new Member(2022, "이순신");
		Member memberW = new Member(2023, "원균");
		Member memberR = new Member(2024, "나대용");
		Member memberS = new Member(2025, "유성용");
		
		memberArraylist.addMember(memberL);
		memberArraylist.addMember(memberW);
		memberArraylist.addMember(memberR);
		memberArraylist.addMember(memberS);
		
		memberArraylist.showAllMembers();
		
		memberArraylist.removeMember(memberW.getMemberId());
		memberArraylist.showAllMembers();
		
		
		

	}

}
