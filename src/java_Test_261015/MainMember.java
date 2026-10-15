package java_Test_261015;

public class MainMember {

	public static void main(String[] args) {
		//생성자를 통해서 초기화
		String memberId1 = "tiger";
		String memberPw1 = "12345";
		String memberName1 = "홍길동";
		int memberAge1 = 27;
		String memberEmail1 = "hong@abc.com";
		
		String memberId2 = "lion";
		String memberPw2 = "54321";
		String memberName2 = "이순신";
		int memberAge2 = 62;
		String memberEmail2 = "lee@abc.com";
		
		Member member1 =new Member(memberId1, memberPw1, memberName1, memberAge1, memberEmail1);
		
		System.out.println(member1.getMemberId());
		System.out.println(member1.getMemberName());
		
		
		Member member2 =new Member(); 
		
        member2.setMemberId(memberId2);
        member2.setMemberPw(memberPw2);
        member2.setMemberName(memberName2);
        member2.setMemberAge(memberAge2);
        member2.setMemberEmail(memberEmail2);
       
        System.out.println(member2.getMemberId());
        System.out.println(member2.getMemberName());
	
       String pmId2= member2.getMemberId();	
       String pmName2= member2.getMemberName();	
       System.out.println("아이디: "+ pmId2 + ", 이름: " + pmName2);
	}

}
