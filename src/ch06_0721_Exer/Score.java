package ch06_0721_Exer;

public class Score {
	
	int kor;
	int eng;
	int math;
	
	public Score(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public void printScore() { // 평균
		int sum = kor + eng + math;
		double avg= (kor + eng + math) /3; 
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		if (avg >= 90) {
			System.out.println("우수");
		} else if ( avg < 60) {
			System.out.println("재시험");
		} else {
			System.out.println("보통");
		}
		
		
		
	}
}
