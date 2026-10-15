package java_Test_261015;

public class MainTest {

	public static void main(String[] args) {
	
		MethodTest meth =new MethodTest();
		meth.age =27;
				
        meth.ageOutput();
	
        int age = meth.ageReturn();
        System.out.println("나이: " + age);
        
        meth.avgScorePrint(80,90);
        double avg = meth.avgScoreReturn(60,80);
        System.out.println("평균: "+ avg);
        System.out.println(meth.avgScoreReturn(60,80));
        
        Student student = new Student();
        student.name = "홍길동";
        
	}

}
