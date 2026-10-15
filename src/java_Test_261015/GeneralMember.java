package java_Test_261015;

public class GeneralMember extends Member1 implements PointUser{

	public GeneralMember(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void useService() {
		System.out.println(name + ":일반서비스를 이용합니다.");
		
	}

	@Override
	public void usePoint() {
		System.out.println(name + ":포인트를 사용합니다.");
		
	}

	
	
}
