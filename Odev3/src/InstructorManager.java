
public class InstructorManager extends UserManager{
	@Override
	public void add(User user) {
		System.out.println("E�itmen :" +user.getFirstName()+" "+user.getLastName()+" Eklendi");
   	 
    }
	@Override
    public void remove(User user) {
		
    	System.out.println("E�itmen :" +user.getFirstName()+" "+user.getLastName()+" Kald�r�ld�");
    }
	@Override
    public void update(User user) {
		System.out.println("E�itmen :" +user.getFirstName()+" "+user.getLastName()+" G�ncellendi");
	 
}

}
