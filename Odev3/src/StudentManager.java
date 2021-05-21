
public class StudentManager extends UserManager {
	@Override
	public void add(User user) {
		System.out.println("Öðrenci :" +user.getFirstName()+" "+user.getLastName()+" Eklendi");
   	 
    }
	@Override
    public void remove(User user) {
		
    	System.out.println("Öðrenci :" +user.getFirstName()+" "+user.getLastName()+" Kaldýrýldý");
    }
	@Override
    public void update(User user) {
		System.out.println("Öðrenci :" +user.getFirstName()+" "+user.getLastName()+" Güncellendi");
	 
}

}
