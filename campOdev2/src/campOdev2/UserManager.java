package campOdev2;

public class UserManager {
      public void add(User user) {
    	  System.out.println(user.getFirstName() + " " + user.getLastName() + " " + "Sisteme eklendi");
    	  System.out.println(user.getId() + " " + user.getEmail() + " " + user.getPassword() + " " + "Giriþ yapýldý"); 
      }
}
