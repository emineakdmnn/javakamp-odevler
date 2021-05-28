package kodlamaio.hrms.core.email;

public interface EmailService {
	void sendLink(String email);
	String sendCode();
}
