package java_Test_261015;

public abstract class Member1 {

	String name;

	public Member1(String name) {
		this.name = name;
	}
	
	public void introduce() {
		System.out.println("회원이름: "+ name);
	}
	
	abstract void useService();{
		
	}
	
}
