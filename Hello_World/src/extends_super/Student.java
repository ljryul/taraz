package extends_super;

public class Student extends Person {
	
	private String studentID;
	private int grade;
	private double gPA;
	
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public double getgPA() {
		return gPA;
	}
	public void setgPA(double gPA) {
		this.gPA = gPA;
	}

	public Student(String name, int age, int height, int weight, String studentID, int grade, double gPA) {
		super(name, age, height, weight);
		this.studentID = studentID;
		this.grade = grade;
		this.gPA = gPA;
	}
	
	
	public void show() {
		
		//상속받은 Person클래스의 메소드
		System.out.println("-----------------------------");
		System.out.println("학생 이름 : " + getName());
		System.out.println("학생 나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 몸무게 : " + getWeight());

		//Student클래스의 메소드
		System.out.println("학생 학번 : " + getStudentID());
		System.out.println("학생 학년 : " + getGrade());
		System.out.println("학생 학점 : " + getgPA());
		System.out.println("-----------------------------");

	}

}
