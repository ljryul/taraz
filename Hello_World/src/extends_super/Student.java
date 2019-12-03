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
		
		//��ӹ��� PersonŬ������ �޼ҵ�
		System.out.println("-----------------------------");
		System.out.println("�л� �̸� : " + getName());
		System.out.println("�л� ���� : " + getAge());
		System.out.println("�л� Ű : " + getHeight());
		System.out.println("�л� ������ : " + getWeight());

		//StudentŬ������ �޼ҵ�
		System.out.println("�л� �й� : " + getStudentID());
		System.out.println("�л� �г� : " + getGrade());
		System.out.println("�л� ���� : " + getgPA());
		System.out.println("-----------------------------");

	}

}
