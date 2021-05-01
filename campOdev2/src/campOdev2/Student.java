package campOdev2;

public class Student extends User {
	
	String takenCourse;
	
	public Student (int id , String firstName , String lastName , String email , String password , String takenCourse ) {
		super (id ,  firstName ,  lastName ,  email , password);
		this.takenCourse = takenCourse ;
		
	}
	
	
	

	public String getTakenCourse() {
		return takenCourse;
	}

	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}

}
