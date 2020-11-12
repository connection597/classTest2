package ClassTest;

public class ClassStudent {
	int studentID;
	String studentName;
	int grade;
	String address;
	public char[] getStudentName;
	

	public String getStudentName() {
		return studentName ;
	}
	public static void main(String[]args) {
		ClassStudent studentAhn =new ClassStudent(); //student클래스 생성
		studentAhn.studentName= "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
