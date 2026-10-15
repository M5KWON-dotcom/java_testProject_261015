package java_Test_261015;

public class Mainclass2 {

	public static void main(String[] args) {
		//생성자를 통해서 초기화하기 -> 4개(부모객체 생성자도 불러오기)
		Dog dog = new Dog("푸들",5,"초코",3);
		
        dog.bark();
        
        Animal animal = dog;//업캐스팅
        
        Animal animal1 = new Dog();//다운캐스팅
        Dog dog1 =(Dog)animal1;
        
	}

}
