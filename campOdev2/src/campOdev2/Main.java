package campOdev2;

public class Main {

	public static void main(String[] args) {
		
		Student student = new Student (1 , "�evval" , "Binici" , "s@s.com" , "12345" , "Java");
		Student student2 = new Student (2 , "�rem" , "Ceylan" , "i@i.com" , "98765" , "c#");
		
		Student[] students= {student , student2 };
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructor instructor = new Instructor (1, "Engin" , "Demirog" , "e@e.com" , "56984" , "java");
		Instructor instructor2 = new Instructor (2, "Sena" , "Kaya" , "n@n.com", "56554" , "c#" );
		
		Instructor[] instructors = {instructor , instructor2 };
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		
		User user = new User (1 , "�evval" , "Binici " , "s@s.com" , "12345");
		User user2 = new User (2 , "�rem" , "Ceylan" , "i@i.com" ,"98765" );
		User user3 = new User (1 , "Engin" , "Demirog" , "e@e.com" , "56984");
		User user4 = new User (2, "Sena" , "Kaya" , "n@n.com" , "56554" );
		
		User[] users = {user, user2 , user3, user4};
		
		UserManager userManager = new UserManager();
		userManager.add(user);
		
				
		
				
		

	}

}
