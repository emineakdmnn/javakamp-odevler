package kodlamaio.hrms.core.email;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class EmailManager implements EmailService{

	@Override
	public void sendLink(String email) {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://hrmsverificationmail/" + uuid.toString();
		System.out.println("Verification link has been sent to " + email );
		System.out.println("Hesabınızı doğrulamak için lütfen bağlantıya tıklayın:  " + verificationLink );
	}

	@Override
	public String sendCode() {
		UUID uuid = UUID.randomUUID();
		String verificationCode = uuid.toString();
		System.out.println("Doğrulama Kodunuz:  " + verificationCode );
		return verificationCode;
	}
}
