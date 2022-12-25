package kr.co.ezenac.string;

public class StringTest02 {
	
	public static void main(String[] args) {
		String java = new String("java");
		String sql = new String("sql");
		System.out.println(System.identityHashCode(java));
		
		java = java.concat(sql);
		System.out.println(java/* .toString() */);
		System.out.println(System.identityHashCode(java)); 	//새로운 주소에 할당
		
	}
}
