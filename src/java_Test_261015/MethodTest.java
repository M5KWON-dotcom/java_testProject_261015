package java_Test_261015;

public class MethodTest {
	
	int age;
	String name;
	int grade;
	double score1;
	double score2;
	
	
	public void ageOutput() {
		System.out.println("나이: "+ this.age);
	}
	
    public int ageReturn() {
    	int result = this.age;
    	return result;
    }
    	public void avgScorePrint(int score1,int score2) { //->매개변수 parameter
    	 		double avg = (score1 + score2)/2;
    	        System.out.println("평균: "+ avg);	
    	}
    	
    	public double avgScoreReturn(int score1,int score2) {
    			double avg = (score1 + score2)/2;
    		    return avg;
    	}
    	
    	public void namePrint(Student student) {
    		String nameP =  student.name;
    		System.out.println(nameP);
    	}
	}

