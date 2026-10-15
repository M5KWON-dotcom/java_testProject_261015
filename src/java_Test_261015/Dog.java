package java_Test_261015;

public class Dog extends Animal{

	
	
	String nickName;
	int grade;
	
	public Dog() {
		super();
		}
	public Dog(String name, int age) {
		super(name, age);//부모생성자 불러오기(밑에 자식생성자에 추가넣기)
		}
	public Dog(String name, int age,String nickName, int grade) {
		super(nickName,grade);
		this.nickName = nickName;
		this.grade = grade;
	    }
	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	
	
	
}
