package odev2;

public class Main {

	public static void main(String[] args) {
		System.out.println("KURSLAR");
		Course course1=new Course(1, "C#+Angular", "Engin Demirog");
		Course course2=new Course(2, "Java+React", "Engin Demirog");
		Course course3=new Course(3, "Programlamaya Giriþ Ýçin Temel Kurs", "Engin Demirog");
		
		Course [] courses= {course1,course2,course3};
		for (Course course : courses) {
			System.out.println(course.id+" "+ course.name+" "+course.instructor);
			
		}
		System.out.println("----------------------------------");
		System.out.println("EÐÝTMENLER");
		
		Instructor instructor1=new Instructor(1, "Tümü");
		Instructor instructor2=new Instructor(2, "Engin Demirog");
		Instructor [] instructors= {instructor1,instructor2};
		for (Instructor instructor : instructors) {
			System.out.println(instructor.id+" "+ instructor.name);
			
		}
		
		System.out.println("----------------------------------");
		 CourseManager courseManager=new CourseManager();
		 courseManager.previousLesson(course1);
		 courseManager.previousLesson(course2);
		 courseManager.previousLesson(course3);
		 
		 System.out.println("----------------------------------");
		 
		 courseManager.finishAndContinue(course1);
		 courseManager.finishAndContinue(course2);
		 courseManager.finishAndContinue(course3);
		 
		
		 
		 
	}

}
