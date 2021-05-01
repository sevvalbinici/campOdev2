package campOdev2;

public class StudentManager extends UserManager {

	public void add(Student student ) {
		System.out.println(student.getFirstName() +" "+ student.getLastName() + " " + student.getTakenCourse() + " " + "ÝSÝMLÝ KURS EKLENDÝ");
	}
}
