
public class Main {

	public static void main(String[] args) {
		Instructor instructor=new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.setInternationalId("123456789");
		System.out.println("Eğitmenin Numarası : "+instructor.getInstructorNumber());
		
		System.out.println("-------------------------------");
		
		Student student =new Student();
		student.setId(2);
		student.setFirstName("Emine");
		student.setLastName("Akduman");
		student.setInternationalId("987654321");
		System.out.println("Öğrencinin Numarası : "+student.getStudentNumber());
		
		System.out.println("-------------------------------");
		
		User user=new User();
		
	
		UserManager userManager = new UserManager();
		userManager.add(user);
		userManager.update(user);
		userManager.remove(user);
		
		
		System.out.println("-------------------------------");
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.remove(instructor);
		instructorManager.update(instructor);
		
		System.out.println("-------------------------------");
		
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		studentManager.remove(student);
		studentManager.update(student);
		
		

	}

}
