package java_Test_261015;

import java.util.ArrayList;

public class MainMember1 {

	public static void main(String[] args) {
		
		ArrayList<Member1>members = new ArrayList<>();
		
		members.add(new GeneralMember("홍길동"));
		members.add(new GeneralMember("김철수"));
		
		for(Member1 member1 : members) {
			member1.introduce();
			member1.useService();
			
			}
	}
}


